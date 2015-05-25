package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Abacus;
import com.linedata.projmng.commons.model.ActionType;
import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.UnitOfWorkDao;

@Repository
@Transactional
public class UnitOfWorkDaoImpl implements UnitOfWorkDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public UnitOfWork addUniOfWork(UnitOfWork unit, long idEstimation, long idActionType, long idAbacus) {
		Estimation estimation = em.find(Estimation.class, idEstimation);
		Abacus abacus = em.find(Abacus.class, idAbacus);
		ActionType action = em.find(ActionType.class, idActionType);
		unit.setEstimation(estimation);
		unit.setActionType(action);
		unit.setAbacus(abacus);
		em.persist(unit);
		em.flush();
		return unit;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public UnitOfWork updateUnitOfWork(UnitOfWork unit, long idAtionType,
			long idAbaque) {
		ActionType a = em.find(ActionType.class, idAtionType);
		Abacus ab = em.find(Abacus.class, idAbaque);
		unit.setAbacus(ab);unit.setActionType(a);
		em.merge(unit);
		return unit;
	}

	@Override
	public boolean deleteUnitOfWork(long idUnit) {
		UnitOfWork unit = getUnitOfWorkDetail(idUnit);
		em.merge(unit);
		em.remove(unit);
		
		return true;
	}

	@Override
	public UnitOfWork getUnitOfWorkDetail(long idUnitOfWork) {
		UnitOfWork unit = em.find(UnitOfWork.class, idUnitOfWork);
		return unit;
	}

	@Override
	public List<UnitOfWork> getAllUnitByEstimation(long idEstimation) {
		Query req=em.createQuery("select u from UnitOfWork u where u.estimation.id = :x");
		req.setParameter("x",idEstimation);
		return req.getResultList();
	}

}
