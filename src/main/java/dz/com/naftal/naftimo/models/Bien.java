package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;



@Entity
@IdClass(CompositeKey.class)
public class Bien implements Serializable{
	
	
	 @Id
	 private  String code_bar;
	 @Id
	 private String codelocalisation;
	 @Id
	 private String code_cop;
	
	 private int etat;
	 private String date_scan;
	 private String matricule;
	 private int stockage;

		public Bien() {
		}
	 




	public Bien(String code_bar, String codelocalisation, String code_cop, int etat, String date_scan,
				String matricule, int stockage) {
			super();
			this.code_bar = code_bar;
			this.codelocalisation = codelocalisation;
			this.code_cop = code_cop;
			this.etat = etat;
			this.date_scan = date_scan;
			this.matricule = matricule;
			this.stockage = stockage;
		}





	public String getCode_bar() {
			return code_bar;
		}





		public void setCode_bar(String code_bar) {
			this.code_bar = code_bar;
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





	@Override
	public String toString() {
		return "Bien [id=" + code_bar + "]";
	}
	

}
