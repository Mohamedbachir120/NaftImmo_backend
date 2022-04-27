package dz.com.naftal.naftimo.controllers;

import java.util.List;

import dz.com.naftal.naftimo.models.BienDecharge;
import dz.com.naftal.naftimo.service.BienDerchargeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BienDechargeController {
    @Autowired
    BienDerchargeService bienDechargeService;


	@RequestMapping(value =  "/create_bienDecharge" ,  method =  RequestMethod.POST)
	public boolean createBien(@RequestBody BienDecharge bien) {
		bien.setStockage(1);
		return bienDechargeService.createBien(bien);
		  
	}
	@RequestMapping(value =  "/existeBienDecharge" ,  method =  RequestMethod.POST)
	public boolean existBien(@RequestBody BienDecharge bien) {
		
		
			
		 return bienDechargeService.exist(bien.getCode_bar());
	}
    @RequestMapping(value="/save_manyDecharge",method = RequestMethod.POST)
	public boolean SaveMany(@RequestBody List<BienDecharge> bien){
		
		return bienDechargeService.SaveMany(bien);
		
	}
    
}
