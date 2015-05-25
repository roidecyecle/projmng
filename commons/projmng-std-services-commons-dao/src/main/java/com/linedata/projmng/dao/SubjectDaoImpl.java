package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.ServiceMessage;
import com.linedata.ekip.std.services.core.exception.EkipServiceException;
import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.dao.api.SubjectDao;

@Repository
@Transactional(noRollbackFor=EkipServiceException.class)
public class SubjectDaoImpl implements SubjectDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Subject addSubject(Subject subject, long idProduct) {
		Product p = em.find(Product.class, idProduct);
		subject.setProduit(p);
		em.persist(subject);		
		return subject;	
	}

	@Override
	public void removeSubject(long idSubject) {
		Subject s = findSubjectById(idSubject);
		em.remove(s);
	}

	@Override
	public Subject updateSubject(long id, Subject subject) {
		Subject s =em.find(Subject.class, id);
		s.setSubject(subject);
		em.flush();
		return subject;
	}

	@Override
	public Subject findSubjectById(long idSubject){
		Subject sb = null;
		sb = em.find(Subject.class, idSubject);
		return sb;
	}

	@Override
	public List<Subject> findSubjectByLabel(String label) {
		Query req=em.createQuery("select s from Subject s where s.description like :x");
		req.setParameter("x", "%"+label+"%");
		return req.getResultList();
	}

	@Override
	public List<Subject> findAllSubject() {
		Query req=em.createQuery("select s from Subject s");
		return req.getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Subject> findSubjectByProduct(long idProduct) {
		Query req=em.createQuery("select s from Subject s where s.produit.id=:x");
		req.setParameter("x", idProduct);
		return req.getResultList();
	}

}
