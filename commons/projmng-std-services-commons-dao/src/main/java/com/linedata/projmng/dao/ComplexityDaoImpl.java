package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Complexity;
import com.linedata.projmng.dao.api.ComplexityDao;

@Repository
@Transactional
public class ComplexityDaoImpl implements ComplexityDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Complexity addComplexity(Complexity complexity) {
		em.persist(complexity);
		return complexity;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Complexity updateComplexity(Complexity complexity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Complexity removeComplexity(Complexity complexity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complexity> getAllComplexities() {
		// TODO Auto-generated method stub
		return null;
	}

}
