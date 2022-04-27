package dz.com.naftal.naftimo.repository;

import java.util.List;

import dz.com.naftal.naftimo.models.Bien;
import dz.com.naftal.naftimo.models.CompositeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BienRepository extends JpaRepository<Bien, CompositeKey>{

	
	@Query(value = "SELECT * FROM bien  where codelocalisation = :codelocalisation ;" , nativeQuery = true)
	List<Bien> findByCodelocalisation(@Param("codelocalisation") String codelocalisation);

	@Query(value = "SELECT * FROM bien  where code_cop = :centre ;" , nativeQuery = true)
	List<Bien> findByCodeCentre(@Param("centre") String centre);


	@Query(value = "SELECT COUNT(*),etat FROM bien    GROUP BY etat ;" , nativeQuery=true)
	List stats();

	@Query(value = "SELECT COUNT(*),etat FROM bien where  code_cop = :centre  GROUP BY etat ;" , nativeQuery=true)
	List stats_par_centre(String centre);

	@Query(value = "SELECT COUNT(*),code_cop FROM bien  GROUP BY code_cop ;" , nativeQuery=true)
	List stat_par_structure();



}
