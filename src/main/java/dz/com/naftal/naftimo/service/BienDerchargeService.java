package dz.com.naftal.naftimo.service;

import java.util.List;

import dz.com.naftal.naftimo.models.BienDecharge;
import dz.com.naftal.naftimo.repository.BienDechargeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BienDerchargeService {
    
    @Autowired 
    BienDechargeRepo bienDechargeRepo;


    public boolean createBien(BienDecharge bien) {

		bienDechargeRepo.save(bien);
		return true;

	}

	public boolean SaveMany(List<BienDecharge> bien) {

		try {
			bienDechargeRepo.saveAll(bien);

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public List<BienDecharge> getAll() {

		return bienDechargeRepo.findAll();

	}
    public boolean exist(String code_bar){
        return bienDechargeRepo.existsById(code_bar);
    }

    
}
