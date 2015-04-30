package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.ActionType;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.ActionTypeDao;

@Repository
@Transactional
public class ActionTypeDaoImpl implements ActionTypeDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public ActionType addActionType(ActionType actionType) {
		em.persist(actionType);
		return actionType;
	}
	public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
	
	@Override
	public ActionType updateActionType(ActionType actionType) {
		em.merge(actionType);
		return actionType;
	}
	@Override
	public boolean removeActionType(ActionType actionType) {
		em.remove(actionType);
		return true;
	}
	@Override
	public ActionType getActionType(long idAction) {
		ActionType action = em.find(ActionType.class,idAction);
		return action;
	}
	@Override
	public List<UnitOfWork> getUnitsByAction(long idAction) {
		Query req=em.createQuery("select u from UnitOfWork u where u.actionType.id=:x");
		req.setParameter("x", idAction);
		return req.getResultList();
		
	}

}
