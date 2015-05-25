package com.linedata.projmng.bean.chiffrage;

import java.util.Collection;

public class ActionTypeBean{

	private long id;
	private String label;
	private float coefficient;
	private Collection<UnitOfWorkBean> unitsOfWorks;

	
	public ActionTypeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ActionTypeBean(String label, float coefficient) {
		super();
		this.label = label;
		this.coefficient = coefficient;
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
	public float getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	public Collection<UnitOfWorkBean> getUnitsOfWorks() {
		return unitsOfWorks;
	}

	public void setUnitsOfWorks(Collection<UnitOfWorkBean> unitsOfWorks) {
		this.unitsOfWorks = unitsOfWorks;
	}

}
