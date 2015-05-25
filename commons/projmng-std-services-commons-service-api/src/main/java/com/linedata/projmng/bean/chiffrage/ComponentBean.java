package com.linedata.projmng.bean.chiffrage;


public class ComponentBean{
	

	/**
	 * 
	 */
	private long id;
	private String label;
			
	public ComponentBean() {
		super();
	}
	
	public ComponentBean(String label) {
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
