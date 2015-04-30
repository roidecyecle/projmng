package com.linedata.projmng.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Abacus;
import com.linedata.projmng.commons.model.Complexity;
import com.linedata.projmng.commons.model.Component;
import com.linedata.projmng.dao.api.AbacusDao;

@Repository
@Transactional
public class AbacusDaoImpl implements AbacusDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean addElement(Abacus abacus, long idComponent, long idComplexity) {
		Component component = em.find(Component.class, idComponent);
		Complexity complexity = em.find(Complexity.class, idComplexity);
		abacus.setComponent(component);
		abacus.setConplexity(complexity);
		em.persist(abacus);
		return true;
	}

	@Override
	public boolean updateElement(long idAbacus,long idComponent, long idComplexity) {
		Component component = em.find(Component.class, idComponent);
		Complexity complexity = em.find(Complexity.class, idComplexity);
		Abacus abacus = em.find(Abacus.class, idAbacus);
		abacus.setComponent(component);
		abacus.setConplexity(complexity);
		em.merge(abacus);
		return true;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public boolean removeElement(long idAbacus) {
		Abacus abacus = em.find(Abacus.class, idAbacus);
		em.remove(abacus);
		return true;
	}

	@Override
	public Abacus getAbacusElements(long idAbacus) {
		Abacus abacus = em.find(Abacus.class, idAbacus);
		return abacus;
	}

}
