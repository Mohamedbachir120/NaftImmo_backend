package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NonEtiquDecharge implements Serializable{

    @Id
    private  String num_serie;
   


    private int etat;
    private String date_scan;
    private String matricule;
    private int stockage;
    private String marque;
    private String modele;
    private String nature;
    private int nombre;
    public NonEtiquDecharge() {
    }
    public NonEtiquDecharge(String num_serie, int etat, String date_scan, String matricule, int stockage, String marque,
            String modele, String nature, int nombre) {
        this.num_serie = num_serie;
        this.etat = etat;
        this.date_scan = date_scan;
        this.matricule = matricule;
        this.stockage = stockage;
        this.marque = marque;
        this.modele = modele;
        this.nature = nature;
        this.nombre = nombre;
    }
    public String getNum_serie() {
        return num_serie;
    }
    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
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
