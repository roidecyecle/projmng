package com.linedata.projmng.commons.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPONENT")
public class Component implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5765504408876206865L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
			
	public Component() {
		super();
	}
	
	public Component(String label) {
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
