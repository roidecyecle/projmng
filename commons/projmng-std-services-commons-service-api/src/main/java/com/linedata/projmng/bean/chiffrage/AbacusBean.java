package com.linedata.projmng.bean.chiffrage;


public class AbacusBean {
	
	private long idAbacus;
	private float coutH;
	private ComponentBean component;
	private ComplexityBean conplexity;
	
	
	public AbacusBean(float coutH) {
		super();
		this.coutH = coutH;
	}
	
	public AbacusBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdAbacus() {
		return idAbacus;
	}
	public void setIdAbacus(long idAbacus) {
		this.idAbacus = idAbacus;
	}
	public float getCoutH() {
		return coutH;
	}
	public void setCoutH(float coutH) {
		this.coutH = coutH;
	}
	public ComponentBean getComponent() {
		return component;
	}
	public void setComponent(ComponentBean component) {
		this.component = component;
	}
	public ComplexityBean getConplexity() {
		return conplexity;
	}
	public void setConplexity(ComplexityBean conplexity) {
		this.conplexity = conplexity;
	}

	

}
