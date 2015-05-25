package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Author;
import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.Status;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.EstimationDao;

@Component
@Repository
@Transactional
public class EstimationDaoImpl implements EstimationDao{
	
	@PersistenceContext
	private EntityManager em;

	private static Logger logger = Logger.getLogger(EstimationDaoImpl.class);
	
	@Override
	public Estimation addEstimation(Estimation estimation, long idAuthor, long idSubject) {
		Author author = em.find(Author.class, idAuthor);
		Subject subject = em.find(Subject.class, idSubject);
		estimation.setAuthor(author);
		estimation.setSubject(subject);
		em.persist(estimation);
		em.flush();
		return estimation;
	}
	


	@Override
	public List<UnitOfWork> getAllUnits(long idEstimation) {
		Query req=em.createQuery("select u from UnitOfWork u where u.estimation.id=:x");
		req.setParameter("x", idEstimation);
		return req.getResultList();
	}


	@Override
	public Estimation getEstimation(long idEstimation) {	
			Estimation est = em.find(Estimation.class, idEstimation);
			return est;
	}


	@Override
	public List<Estimation> getAllEstimationByLabel(String label) {
		logger.debug("IN getAllEstimationByLabel");
		Query req=em.createQuery("select e from Estimation e where e.label like :x");
		req.setParameter("x", "%"+label+"%");
		return req.getResultList();
	}
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}



	@Override
	public Estimation updateEstimation(Estimation estimation) {
		em.merge(estimation);
		return estimation;
	}



	@Override
	public Estimation ChangeStatus(long idEstimation, Status st) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteEstimation(long idEstimation) {
		logger.debug("IN deleteEstimation METHODE");
		Estimation est = em.find(Estimation.class, idEstimation);
		if(est == null){
			logger.warn("This estimation is not exist");
		}
		else{
			em.remove(est);
		}
	}



	@Override
	public double getCostByEstimation(long idEstimation) {
		double cost = 0;
		Query req=em.createQuery("select sum(u.costH) from UnitOfWork u where u.estimation.id = :x");
		req.setParameter("x", idEstimation);
		if(req.getSingleResult() != null)
		cost = (Double) req.getSingleResult();
		return cost;
	}




}
