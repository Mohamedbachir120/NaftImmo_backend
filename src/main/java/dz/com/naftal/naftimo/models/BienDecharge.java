package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BienDecharge  implements Serializable{


	 @Id
	 private  String code_bar;

	 private int etat;
	 private String date_scan;
	 private String matricule;
	 private int stockage;
     
    public BienDecharge() {
    }

    public BienDecharge(String code_bar, int etat, String date_scan, String matricule, int stockage) {
        this.code_bar = code_bar;
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

     
    
}
