package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NonEtiqu implements Serializable{
	@Id
	 private  String num_serie;
	
	 private String codelocalisation;
	 private String code_cop;

	 private int etat;
	 private String date_scan;
	 private String matricule;
	 private int stockage;
	 private String marque;
	 private String modele;
	 private String nature;
	 private int nombre;
	 
	public NonEtiqu(String num_serie, String codelocalisation, String code_cop, int etat, String date_scan,
			String matricule, int stockage, String marque, String modele, String nature, int nombre) {
		super();
		this.num_serie = num_serie;
		this.codelocalisation = codelocalisation;
		this.code_cop = code_cop;
		this.etat = etat;
		this.date_scan = date_scan;
		this.matricule = matricule;
		this.stockage = stockage;
		this.marque = marque;
		this.modele = modele;
		this.nature = nature;
		this.nombre = nombre;
	}

	public NonEtiqu() {
	
	}

	public String getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}

	public String getCodelocalisation() {
		return codelocalisation;
	}

	public void setCodelocalisation(String codelocalisation) {
		this.codelocalisation = codelocalisation;
	}

	public String getCode_cop() {
		return code_cop;
	}

	public void setCode_cop(String code_cop) {
		this.code_cop = code_cop;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public String getDate_scan() {
		return date_scan;
	}

	public void setDate_scan(String date_scan) {
		this.date_scan = date_scan;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getStockage() {
		return stockage;
	}

	public void setStockage(int stockage) {
		this.stockage = stockage;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	 


}
