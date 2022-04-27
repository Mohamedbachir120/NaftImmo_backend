package dz.com.naftal.naftimo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="localite")
@IdClass(KeyLoc.class)
public class localite implements Serializable{
    @Id
    private String LOC_ID;
    @Id
    private String COP_ID;

    private String LOC_LIB;
    private String COP_LIB;
    private int LOC_ACTIVE;

    public localite(){
        
    }
    

    public localite(String LOC_ID, String COP_ID, String LOC_LIB, String COP_LIB, int LOC_ACTIVE) {
        this.LOC_ID = LOC_ID;
        this.COP_ID = COP_ID;
        this.LOC_LIB = LOC_LIB;
        this.COP_LIB = COP_LIB;
        this.LOC_ACTIVE = LOC_ACTIVE;
    }


    public String getLOC_ID() {
        return LOC_ID;
    }

    public void setLOC_ID(String LOC_ID) {
        this.LOC_ID = LOC_ID;
    }

    public String getCOP_ID() {
        return COP_ID;
    }

    public void setCOP_ID(String COP_ID) {
        this.COP_ID = COP_ID;
    }

    public String getLOC_LIB() {
        return LOC_LIB;
    }

    public void setLOC_LIB(String LOC_LIB) {
        this.LOC_LIB = LOC_LIB;
    }

    public String getCOP_LIB() {
        return COP_LIB;
    }

    public void setCOP_LIB(String COP_LIB) {
        this.COP_LIB = COP_LIB;
    }

    public int getLOC_ACTIVE() {
        return LOC_ACTIVE;
    }

    public void setLOC_ACTIVE(int LOC_ACTIVE) {
        this.LOC_ACTIVE = LOC_ACTIVE;
    }

    @Override
	public String toString() {
		return "Localite [id=" + LOC_ID + "]";
	}
    

    
    
}
