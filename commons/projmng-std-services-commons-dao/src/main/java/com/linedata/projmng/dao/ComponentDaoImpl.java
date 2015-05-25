package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Component;
import com.linedata.projmng.dao.api.ComponentDao;

@Repository
@Transactional
public class ComponentDaoImpl implements ComponentDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addComponent(Component component) {
		em.persist(component);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void updateComponent(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeComponent(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Component> getAllComponents() {
		// TODO Auto-generated method stub
		return null;
	}

}
