package dz.com.naftal.naftimo.repository;

import dz.com.naftal.naftimo.models.BienDecharge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BienDechargeRepo extends JpaRepository<BienDecharge,String>{
    
}
