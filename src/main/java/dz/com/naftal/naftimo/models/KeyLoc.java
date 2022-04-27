package dz.com.naftal.naftimo.models;

import java.io.Serializable;

public class KeyLoc implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private  String LOC_ID;
	 private String COP_ID;
	 
	 
	public KeyLoc() {
	
	}


	public KeyLoc(String LOC_ID, String COP_ID) {
		this.LOC_ID = LOC_ID;
		this.COP_ID = COP_ID;
	}	


}
