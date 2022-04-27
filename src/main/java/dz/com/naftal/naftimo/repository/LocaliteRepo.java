package dz.com.naftal.naftimo.repository;

import java.util.List;

import dz.com.naftal.naftimo.models.KeyLoc;
import dz.com.naftal.naftimo.models.localite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LocaliteRepo  extends JpaRepository<localite,KeyLoc>{

	@Query(value = "SELECT * FROM localite  where COP_ID = :centre ;" , nativeQuery = true)
    List<localite> findByCodeCop(String centre); 
    
    @Query(value = "SELECT DISTINCT (COP_ID) , COP_LIB FROM localite;", nativeQuery = true)
    List findCentres();
}
