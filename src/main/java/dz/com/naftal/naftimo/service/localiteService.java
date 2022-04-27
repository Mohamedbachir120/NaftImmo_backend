package dz.com.naftal.naftimo.service;

import java.util.List;

import dz.com.naftal.naftimo.models.localite;
import dz.com.naftal.naftimo.repository.LocaliteRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class localiteService {
    @Autowired
    LocaliteRepo localiteRepo ;

    public List<localite> findAll(){
        return localiteRepo.findAll();
    }
    public List<localite> findByCentre(String centre){

        return localiteRepo.findByCodeCop(centre);
        
    } 

    public List findCentres(){
        return localiteRepo.findCentres();
    }
    
}
