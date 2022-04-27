package dz.com.naftal.naftimo.repository;

import java.util.List;

import dz.com.naftal.naftimo.models.KeyEquipe;
import dz.com.naftal.naftimo.models.equipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipeRepository extends JpaRepository<equipe,KeyEquipe>{
    

	@Query(value = "SELECT * FROM equipe  where COP_ID = :centre ;" , nativeQuery = true)
    List<equipe> findByCodeCop(String centre); 
    
}
