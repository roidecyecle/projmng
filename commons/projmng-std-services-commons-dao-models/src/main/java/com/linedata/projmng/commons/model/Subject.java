package com.linedata.projmng.commons.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1295215197297623108L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String description;
	
	private String version_study;
	
	@Temporal(TemporalType.DATE)
	private Date date_study;
	
	private String version;
	
	@ManyToOne
	@JoinColumn(name="IDPRODUCT")
	private Product produit;
	
	@OneToMany(mappedBy="subject",fetch=FetchType.LAZY)
	private Collection<Estimation> estimation;

	public Subject(String description, String version_study, Date date_study,String version) {
		super();
		this.description = description;
		this.version_study = version_study;
		this.date_study = date_study;
		this.version = version;
	}

	public Subject() {
		super();
	}
	
	public void setSubject(Subject s){
		this.description = s.getDescription();
		this.date_study = s.getDate_study();
		this.version = s.getVersion();
		this.version_study = s.getVersion_study();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion_study() {
		return version_study;
	}

	public void setVersion_study(String version_study) {
		this.version_study = version_study;
	}

	public Date getDate_study() {
		return date_study;
	}

	public void setDate_study(Date date_study) {
		this.date_study = date_study;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public Collection<Estimation> getEstimation() {
		return estimation;
	}

	public void setEstimation(Collection<Estimation> estimation) {
		this.estimation = estimation;
	}

	

}
