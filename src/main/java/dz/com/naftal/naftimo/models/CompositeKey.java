package dz.com.naftal.naftimo.models;

import java.io.Serializable;

public class CompositeKey implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String code_bar;
	 private String codelocalisation;
	 private String code_cop;
	 
	 
	public CompositeKey() {
	
	}


	public CompositeKey(String code_bar, String codelocalisation, String code_cop) {
		this.code_bar = code_bar;
		this.codelocalisation = codelocalisation;
		this.code_cop = code_cop;
	}	


}
