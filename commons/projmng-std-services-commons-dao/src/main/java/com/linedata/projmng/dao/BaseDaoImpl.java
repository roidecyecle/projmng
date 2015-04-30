package com.linedata.projmng.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.Subject;


@Component
@Repository
@Transactional
public class BaseDaoImpl {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public void addEstimation(Estimation c){
		em.persist(c);
	}
	
	public void addSubject(Subject s){
		em.persist(s);
	}
	
	public Subject getChiffrage(int id){
		return em.find(Subject.class, id);
		
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
