package dz.com.naftal.naftimo.controllers;

import java.util.List;

import dz.com.naftal.naftimo.models.BienDecharge;
import dz.com.naftal.naftimo.models.NonEtiquDecharge;
import dz.com.naftal.naftimo.service.BienDerchargeService;
import dz.com.naftal.naftimo.service.NonEtiquDechargeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class DechargeController {

    @Autowired
    BienDerchargeService bienDerchargeService;
    @Autowired
    NonEtiquDechargeService nonEtiquDechargeService;

    @RequestMapping("/decharges_bien")
    public List<BienDecharge> all_decharge_bien(){

       return bienDerchargeService.getAll();
    }

    @RequestMapping("/decharges_sn")
    public List<NonEtiquDecharge> all_decharge_sn(){

       return nonEtiquDechargeService.getAll();
    }
    
}
