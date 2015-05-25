package com.linedata.projmng.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Author;
import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.dao.api.AuthorDao;

@Repository
@Transactional
public class AuthorDaoImpl implements AuthorDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Author addAuthor(Author author) {
		em.persist(author);
		return author;
	}

	@Override
	public boolean removeAuthor(long idAuthor) {
		Author a = findAuthor(idAuthor);
		em.remove(a);
		return true;
	}

	@Override
	public boolean updateAuthor(long idAuthor, Author author) {
		Author a = findAuthor(idAuthor);
		a.setAuthor(author);
		return true;
	}

	@Override
	public Author findAuthor(long idAuthor) {
		Author a  = em.find(Author.class, idAuthor);
		return a;
	}

	@Override
	public List<Author> findAllAuthor() {
		Query req=em.createQuery("select a from author a");
		return req.getResultList();
		
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Author affectAnEstimation(Author author, Collection<Estimation> estimations) {
		author.setEstimation(estimations);
		em.persist(author);
		return null;
	}
	

}
