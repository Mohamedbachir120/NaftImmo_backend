package dz.com.naftal.naftimo.repository;

import dz.com.naftal.naftimo.models.NonEtiquDecharge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NonEtiquDechargeRepo extends JpaRepository<NonEtiquDecharge,String>{
    
}
