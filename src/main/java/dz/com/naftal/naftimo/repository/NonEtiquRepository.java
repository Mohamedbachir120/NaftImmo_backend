package dz.com.naftal.naftimo.repository;



import java.util.List;

import dz.com.naftal.naftimo.models.NonEtiqu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NonEtiquRepository extends JpaRepository<NonEtiqu, String>{
	
	
	@Query(value = "SELECT COUNT(*),etat FROM non_etiqu GROUP BY etat ;" , nativeQuery=true)
	List stats();

		
	@Query(value = "SELECT * FROM non_etiqu where code_cop = :centre ;" , nativeQuery=true)
	List<NonEtiqu> findByCodeCentre(String centre);



	@Query(value = "SELECT COUNT(*),etat FROM non_etiqu where  code_cop = :centre  GROUP BY etat ;" , nativeQuery=true)
	List stat_par_centre(String centre);

	@Query(value = "SELECT COUNT(*),code_cop FROM non_etiqu GROUP BY code_cop ;" , nativeQuery=true)
	List stat_par_structure();

}
