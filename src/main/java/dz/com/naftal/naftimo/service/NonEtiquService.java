package dz.com.naftal.naftimo.service;

import java.util.List;

import dz.com.naftal.naftimo.models.NonEtiqu;
import dz.com.naftal.naftimo.repository.NonEtiquRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NonEtiquService {
	@Autowired
	private NonEtiquRepository etiquRepo;
	
	public boolean createEtiqu(NonEtiqu etiqu) {
		
		
		etiquRepo.save(etiqu);
		return true;
	
}
	public boolean SaveMany(List<NonEtiqu> liste) {
		
		try {
			etiquRepo.saveAll(liste);

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	
	public List<NonEtiqu> getAll(){
		return etiquRepo.findAll();
	}

	public List<NonEtiqu> findByCodeCop(String centre){

		return etiquRepo.findByCodeCentre(centre);
	}

	public List stats(){

		return etiquRepo.stats();
	
	}

	public List stat_par_structure(){
		
		return etiquRepo.stat_par_structure();
	}
	
	public List stat_par_centre(String centre){

		return etiquRepo.stat_par_centre(centre);
	}
	

}
