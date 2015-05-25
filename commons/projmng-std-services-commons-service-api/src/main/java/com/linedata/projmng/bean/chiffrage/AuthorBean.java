package com.linedata.projmng.bean.chiffrage;

import java.util.Collection;

public class AuthorBean{
	
	/**
	 * 
	 */
	private long id;
	private String name;
	private String function;
	private Collection<EstimationBean> estimation;
	
	public void setAuthor(AuthorBean a){
		this.name = a.getName();
		this.function = a.getFunction();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public Collection<EstimationBean> getEstimation() {
		return estimation;
	}
	public void setEstimation(Collection<EstimationBean> estimation) {
		this.estimation = estimation;
	}

}
