package dz.com.naftal.naftimo.models;

import java.io.Serializable;

public class KeyEquipe  implements Serializable{
    
    private static final long serialVersionUID = 3L;
	private  String INV_ID;
	 private String EMP_ID;
	 
	 
	public KeyEquipe() {
	
	}


	public KeyEquipe(String INV_ID, String EMP_ID) {
		this.INV_ID = INV_ID;
		this.EMP_ID = EMP_ID;
	}	


}
