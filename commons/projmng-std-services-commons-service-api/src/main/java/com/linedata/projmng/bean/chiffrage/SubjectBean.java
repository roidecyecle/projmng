package com.linedata.projmng.bean.chiffrage;

import java.util.Collection;
import java.util.Date;



public class SubjectBean  {


	private long id;	
	private String description;	
	private String version_study;	
	private Date date_study;	
	private String version;	
	private ProductBean produit;	
	private Collection<EstimationBean> estimation;
	
	
	public SubjectBean(String description, String version_study, Date date_study,String version) {
		super();
		this.description = description;
		this.version_study = version_study;
		this.date_study = date_study;
		this.version = version;
	}

	public SubjectBean() {
		super();
	}
	
	public void setSubject(SubjectBean s){
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

	public ProductBean getProduit() {
		return produit;
	}

	public void setProduit(ProductBean produit) {
		this.produit = produit;
	}

	public Collection<EstimationBean> getEstimation() {
		return estimation;
	}

	public void setEstimation(Collection<EstimationBean> estimation) {
		this.estimation = estimation;
	}

	

}
