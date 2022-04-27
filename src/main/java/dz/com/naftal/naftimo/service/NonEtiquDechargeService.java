package dz.com.naftal.naftimo.service;

import java.util.List;

import dz.com.naftal.naftimo.models.NonEtiquDecharge;
import dz.com.naftal.naftimo.repository.NonEtiquDechargeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NonEtiquDechargeService {

    @Autowired 
    NonEtiquDechargeRepo nonEtiquDechargeRepo;


    public boolean createEtiqu(NonEtiquDecharge etiqu) {
		
		
		nonEtiquDechargeRepo.save(etiqu);
		return true;
	
}
	public boolean SaveMany(List<NonEtiquDecharge> liste) {
		
		try {
			nonEtiquDechargeRepo.saveAll(liste);

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	
	public List<NonEtiquDecharge> getAll(){
		return nonEtiquDechargeRepo.findAll();
	}

    
}
