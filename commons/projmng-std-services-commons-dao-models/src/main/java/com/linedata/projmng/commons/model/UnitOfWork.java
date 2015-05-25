package com.linedata.projmng.commons.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="UNIT_OF_WORK")
public class UnitOfWork implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9131073966441524313L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	private double costJH;
	private double costH;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ACTION_TYPE")
	private ActionType actionType;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESTIMATION")
	private Estimation estimation;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CODE_ABACUS")
	private Abacus abacus;
 
		
	public UnitOfWork(String label, float costJH) {
		super();
		this.label = label;
		this.costJH = costJH;
	}
	
	public UnitOfWork() {
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
	public Estimation getEstimation() {
		return estimation;
	}
	public void setEstimation(Estimation estimation) {
		this.estimation = estimation;
	}

	public double getCostH() {
		return costH;
	}

	public void setCostH(double costH) {
		this.costH = costH;
	}

	public Abacus getAbacus() {
		return abacus;
	}

	public void setAbacus(Abacus abacus) {
		this.abacus = abacus;
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	
}
