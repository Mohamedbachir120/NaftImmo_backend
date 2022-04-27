package dz.com.naftal.naftimo.controllers;

import java.util.List;

import dz.com.naftal.naftimo.models.NonEtiquDecharge;
import dz.com.naftal.naftimo.service.NonEtiquDechargeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class NonEtiquDechargeController {

    @Autowired 
    NonEtiquDechargeService nonEtiquDechargeService;

    @RequestMapping(value =  "/create_NonEtiquDecharge" ,  method =  RequestMethod.POST)
	public boolean createBien(@RequestBody NonEtiquDecharge bien) {
		bien.setStockage(1);
		return nonEtiquDechargeService.createEtiqu(bien);
		  
	}
	@RequestMapping(value="/save_manyNonEtiquDecharge",method = RequestMethod.POST)
	public boolean SaveMany(@RequestBody List<NonEtiquDecharge> bien){
		
		return nonEtiquDechargeService.SaveMany(bien);
		
	}
	@RequestMapping(value = "/all_non_etiquDecharge")
	public List<NonEtiquDecharge> findAll(){

		return nonEtiquDechargeService.getAll();
	}
    
}
