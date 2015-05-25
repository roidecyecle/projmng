package com.linedata.projmng.commons.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5199154326155069508L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String label;
	private String version;
	@OneToMany(mappedBy="produit",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Collection<Subject> subjects;
	
	
	public void setProduct(Product p){
		this.label = p.getLabel();
		this.version = p.getVersion();
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
	public Collection<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Collection<Subject> subjects) {
		this.subjects = subjects;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
