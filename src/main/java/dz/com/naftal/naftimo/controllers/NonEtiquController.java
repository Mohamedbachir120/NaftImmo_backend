package dz.com.naftal.naftimo.controllers;

import java.util.List;

import dz.com.naftal.naftimo.models.NonEtiqu;
import dz.com.naftal.naftimo.models.equipe;
import dz.com.naftal.naftimo.repository.EquipeRepository;
import dz.com.naftal.naftimo.service.NonEtiquService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

public class NonEtiquController {
	
	@Autowired
	NonEtiquService bienService;

	@Autowired 
	EquipeRepository equipeRepository;
	


	
	@RequestMapping(value =  "/create_NonEtiqu" ,  method =  RequestMethod.POST)
	public boolean createBien(@RequestBody NonEtiqu bien) {
		bien.setStockage(1);
		return bienService.createEtiqu(bien);
		  
	}
	@RequestMapping(value="/save_manyNonEtiqu",method = RequestMethod.POST)
	public boolean SaveMany(@RequestBody List<NonEtiqu> bien){
		
		return bienService.SaveMany(bien);
		
	}
	@RequestMapping(value = "/all_non_etiqu")
	public List<NonEtiqu> findAll(){

		return bienService.getAll();
	}
	@RequestMapping(value = "/non_etiqu_by_centre/{centre}")
	public List<NonEtiqu> find_by_centre(@PathVariable String centre){

		return bienService.findByCodeCop(centre);
	}

	@RequestMapping(value="/equipe")
	public List<equipe> findAllEquipes(){

		return equipeRepository.findAll();
	}
	

	@RequestMapping(value="/equipe_par_centre/{centre}")
	public List<equipe> find_Equipe_par_centre(@PathVariable String centre){

		return equipeRepository.findByCodeCop(centre);
	}
	
	@RequestMapping(value="stat_SN")
	public List Stat_SN(){
		return bienService.stats();
	}

	@RequestMapping(value="/stat_sn_par_centre/{centre}")
	public List stat_par_centre(@PathVariable String centre){
		return bienService.stat_par_centre(centre);
	}


}
