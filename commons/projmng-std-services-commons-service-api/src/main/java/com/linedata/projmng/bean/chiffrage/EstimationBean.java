package com.linedata.projmng.bean.chiffrage;

import java.util.Date;


public class EstimationBean {


	private long id;	
	private Date date;
	private String label;
	private Status status;
	private SubjectBean subject;
	private AuthorBean author;
	

	public EstimationBean(Date date, String label, Status status) {
		super();
		this.date = date;
		this.label = label;
		this.setStatus(status);
	}

	public EstimationBean() {
		super();
	}

	public EstimationBean(String label) {
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


	public SubjectBean getSubject() {
		return subject;
	}

	public void setSubject(SubjectBean subject) {
		this.subject = subject;
	}

	public AuthorBean getAuthor() {
		return author;
	}

	public void setAuthor(AuthorBean author) {
		this.author = author;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Estimation [id=" + id + ", date=" + date + ", label=" + label
				+ ", status=" + status + ", subject=" + subject.getDescription() + ", author="
				+ author.getName() + "]";
	}


}
