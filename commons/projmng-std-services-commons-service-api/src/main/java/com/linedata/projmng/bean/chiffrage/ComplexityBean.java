package com.linedata.projmng.bean.chiffrage;


public class ComplexityBean {

	/**
	 * 
	 */
	private long id;
	private String label;
	
	
	public ComplexityBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ComplexityBean(String label) {
		super();
		this.label = label;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}


	
}
