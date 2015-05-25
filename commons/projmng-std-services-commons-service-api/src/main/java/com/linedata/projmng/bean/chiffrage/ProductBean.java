package com.linedata.projmng.bean.chiffrage;

import java.util.Collection;



public class ProductBean {

	/**
	 * 
	 */
	private long id;
	private String label;
	private String version;
	private Collection<SubjectBean> subjects;
	
	
	public void setProduct(ProductBean p){
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
	public Collection<SubjectBean> getSubjects() {
		return subjects;
	}
	public void setSubjects(Collection<SubjectBean> subjects) {
		this.subjects = subjects;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
