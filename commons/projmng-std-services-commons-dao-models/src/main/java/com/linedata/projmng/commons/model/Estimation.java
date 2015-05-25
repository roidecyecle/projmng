package com.linedata.projmng.commons.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "ESTIMATION_PROJ")
public class Estimation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7752391232972763938L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="E_DATE")
	private Date date;
	
	private String label;

	@Enumerated(EnumType.STRING)	
	private Status status;
	
	@OneToMany(fetch=FetchType.LAZY,
			   targetEntity=UnitOfWork.class,
			   mappedBy="estimation",
			   cascade=CascadeType.ALL)
	private Collection<UnitOfWork> unitsOfWork = new ArrayList<UnitOfWork>();
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Subject subject;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Author author;
	

	public Estimation(Date date, String label, Status status) {
		super();
		this.date = date;
		this.label = label;
		this.setStatus(status);
	}

	public Estimation() {
		super();
	}

	public Estimation(String label) {
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

	public Collection<UnitOfWork> getUnitsOfWork() {
		return unitsOfWork;
	}

	public void setUnitsOfWork(Collection<UnitOfWork> unitsOfWork) {
		this.unitsOfWork = unitsOfWork;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
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
