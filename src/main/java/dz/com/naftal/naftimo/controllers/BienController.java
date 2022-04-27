package dz.com.naftal.naftimo.controllers;

import java.util.List;

import dz.com.naftal.naftimo.models.Bien;
import dz.com.naftal.naftimo.models.CompositeKey;
import dz.com.naftal.naftimo.models.User;
import dz.com.naftal.naftimo.models.localite;
import dz.com.naftal.naftimo.payload.request.ChangePasswordRequest;
import dz.com.naftal.naftimo.payload.response.MessageResponse;
import dz.com.naftal.naftimo.repository.UserRepository;
import dz.com.naftal.naftimo.service.BienService;
import dz.com.naftal.naftimo.service.localiteService;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BienController {
	
	@Autowired
	BienService bienService;
	

	@Autowired
    UserRepository userRepository;


	@Autowired
    private PasswordEncoder passwordEncoder;

	@Autowired
	localiteService localiteservice;




	
	@RequestMapping(value = "/localite")
	public List<localite> all_localites(){
		return localiteservice.findAll();
	}
	@RequestMapping(value="/localite_par_centre/{centre}")
	public List<localite>  findByCentre(@PathVariable String centre){

		return this.localiteservice.findByCentre(centre);
	}
	
	@RequestMapping(value="/find_centres")
	public List find_centres(){

		return  localiteservice.findCentres();
	}
	
	@RequestMapping(value =  "/create_bien" ,  method =  RequestMethod.POST)
	public boolean createBien(@RequestBody Bien bien) {
		bien.setStockage(1);
		return bienService.createBien(bien);
		  
	}
	@RequestMapping(value =  "/existeBien" ,  method =  RequestMethod.POST)
	public boolean existBien(@RequestBody Bien bien) {
		
		CompositeKey key = new CompositeKey(bien.getCode_bar(),bien.getCodelocalisation(),bien.getCode_cop());
		
			
		 return bienService.exist(key);
	}
	
	
	
	@RequestMapping(value =  "/linked_objects/{codelocalisation}" ,  method =  RequestMethod.POST)
	public List<Bien> ListBien(@PathVariable String codelocalisation) {
		
			
		 return bienService.getRelatedObject(codelocalisation);
	}
	
	@RequestMapping(value="/save_many",method = RequestMethod.POST)
	public boolean SaveMany(@RequestBody List<Bien> bien){
		
		return bienService.SaveMany(bien);
		
	}

	@RequestMapping(value = "/all_bien")
	public List<Bien> findAll(){

		return bienService.getAll();
	}

	@RequestMapping(value = "/bien_par_centre/{centre}")
	public List<Bien> find_by_centre(@PathVariable String centre){

		return bienService.findByCodeCop(centre);
	}


	@RequestMapping(value = "/stats_bien")
	public List stats(){
		return bienService.stat_par_structure();

	}
	@RequestMapping(value="/stat_bien_par_centre/{centre}")
	public List stats_par_centre(@PathVariable String centre){
		return bienService.stat_par_centre(centre);
	}
	
	@PostMapping(value="/change_password")
	public ResponseEntity<?>  changePassword(@RequestBody ChangePasswordRequest request)
	{
		Authentication auth =  SecurityContextHolder.getContext().getAuthentication();

			String currentUserName = auth.getName();

			User user  = userRepository.findByUsername(currentUserName).orElseThrow();
			System.out.println(user.getPassword());
			if(passwordEncoder.matches(request.getPassword(), user.getPassword())){
				user.setPassword(passwordEncoder.encode(request.getNewpassword()));
				userRepository.save(user);
			
				return ResponseEntity.ok(new MessageResponse("success"));
			}
			
			return ResponseEntity.ok(new MessageResponse("error"));

		

		
		



	}

	@RequestMapping(value="stat_bien")
	public List Stat_biens(){
		return bienService.stats();
	}

	@RequestMapping(value = "/stat_par_structure")
	public List stat_biens(){

		return bienService.stat_par_structure();
	}


	


}
