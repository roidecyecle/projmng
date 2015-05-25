package com.linedata.projmng.commons.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPLEXITY")
public class Complexity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7702923172852464969L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	
	
	public Complexity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Complexity(String label) {
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
