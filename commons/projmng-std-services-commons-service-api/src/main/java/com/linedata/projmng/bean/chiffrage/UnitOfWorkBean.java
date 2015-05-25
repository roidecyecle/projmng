package com.linedata.projmng.bean.chiffrage;


public class UnitOfWorkBean{

	private long id;
	private String label;
	private double costJH;
	private double costH;
	private ActionTypeBean actionType;
	private EstimationBean estimation;
	private AbacusBean abacus;

 
		
	public UnitOfWorkBean(String label, float costJH) {
		super();
		this.label = label;
		this.costJH = costJH;
	}
	
	public UnitOfWorkBean() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getCostJH() {
		return costJH;
	}
	public void setCostJH(double costJH) {
		this.costJH = costJH;
	}
	public EstimationBean getEstimation() {
		return estimation;
	}
	public void setEstimation(EstimationBean estimation) {
		this.estimation = estimation;
	}

	public double getCostH() {
		return costH;
	}

	public void setCostH(double costH) {
		this.costH = costH;
	}

	public ActionTypeBean getActionType() {
		return actionType;
	}

	public void setActionType(ActionTypeBean actionType) {
		this.actionType = actionType;
	}

	public AbacusBean getAbacus() {
		return abacus;
	}

	public void setAbacus(AbacusBean abacus) {
		this.abacus = abacus;
	}

	
}
