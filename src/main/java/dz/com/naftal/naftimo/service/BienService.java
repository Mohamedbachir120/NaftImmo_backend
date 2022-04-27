package dz.com.naftal.naftimo.service;

import java.util.List;

import dz.com.naftal.naftimo.models.Bien;
import dz.com.naftal.naftimo.models.CompositeKey;
import dz.com.naftal.naftimo.repository.BienRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BienService {

	@Autowired
	private BienRepository bienRepository;

	public boolean exist(CompositeKey key) {
		return bienRepository.existsById(key);

	}

	public List<Bien> getRelatedObject(String codelocalisation) {

		return (List<Bien>) bienRepository.findByCodelocalisation(codelocalisation);

	}

	public List<Bien> findByCodeCop(String centre){
		return (List<Bien>) bienRepository.findByCodeCentre(centre);
	}
	public boolean createBien(Bien bien) {

		bienRepository.save(bien);
		return true;

	}

	public boolean SaveMany(List<Bien> bien) {

		try {
			bienRepository.saveAll(bien);

			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public List<Bien> getAll() {

		return bienRepository.findAll();

	}

	public List stats() {

		return bienRepository.stats();

	}

	public List stat_par_structure() {
		return bienRepository.stat_par_structure();
	}

	public List stat_par_centre(String centre){
		return bienRepository.stats_par_centre(centre);
	}
}
