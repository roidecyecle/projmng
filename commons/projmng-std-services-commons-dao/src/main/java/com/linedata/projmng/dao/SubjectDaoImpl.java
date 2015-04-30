package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.dao.api.SubjectDao;

@Repository
@Transactional
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject updateSubject(long idSubject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject findSubjectById(long idSubject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject findSubjectByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> findAllSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
