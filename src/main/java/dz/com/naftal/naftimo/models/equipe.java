package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="equipe")
@IdClass(KeyEquipe.class)
public class equipe implements Serializable{
    private int YEAR;
    @Id
    private String INV_ID;
    private String COP_ID;
    @Id
    private String EMP_ID;
    private String EMP_FULLNAME;
    private String JOB_LIB;
    private String GROUPE_ID; 
    private int EMP_IS_MANAGER;

    
    public equipe() {
    }
    
    public equipe(int yEAR, String iNV_ID, String cOP_ID, String eMP_ID, String eMP_FULLNAME, String jOB_LIB,
            String gROUPE_ID, int eMP_IS_MANAGER) {
        YEAR = yEAR;
        INV_ID = iNV_ID;
        COP_ID = cOP_ID;
        EMP_ID = eMP_ID;
        EMP_FULLNAME = eMP_FULLNAME;
        JOB_LIB = jOB_LIB;
        GROUPE_ID = gROUPE_ID;
        EMP_IS_MANAGER = eMP_IS_MANAGER;
    }

    public int getYEAR() {
        return YEAR;
    }
    public void setYEAR(int yEAR) {
        YEAR = yEAR;
    }
    public String getINV_ID() {
        return INV_ID;
    }
    public void setINV_ID(String iNV_ID) {
        INV_ID = iNV_ID;
    }
    public String getCOP_ID() {
        return COP_ID;
    }
    public void setCOP_ID(String cOP_ID) {
        COP_ID = cOP_ID;
    }
    public String getEMP_ID() {
        return EMP_ID;
    }
    public void setEMP_ID(String eMP_ID) {
        EMP_ID = eMP_ID;
    }
    public String getEMP_FULLNAME() {
        return EMP_FULLNAME;
    }
    public void setEMP_FULLNAME(String eMP_FULLNAME) {
        EMP_FULLNAME = eMP_FULLNAME;
    }
    public String getJOB_LIB() {
        return JOB_LIB;
    }
    public void setJOB_LIB(String jOB_LIB) {
        JOB_LIB = jOB_LIB;
    }
    public String getGROUPE_ID() {
        return GROUPE_ID;
    }
    public void setGROUPE_ID(String gROUPE_ID) {
        GROUPE_ID = gROUPE_ID;
    }
    public int getEMP_IS_MANAGER() {
        return EMP_IS_MANAGER;
    }
    public void setEMP_IS_MANAGER(int eMP_IS_MANAGER) {
        EMP_IS_MANAGER = eMP_IS_MANAGER;
    } 

    
}
