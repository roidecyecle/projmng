package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.dao.api.ProductDao;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	private static Logger logger = Logger.getLogger(ProductDaoImpl.class);
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Product addProduct(Product product) {
		em.persist(product);
		logger.info("Product persist is: "+product.toString());
		return null;
	}

	@Override
	public void removeProduct(long idProduct) {
		Product p = new Product();
		p = getProduct(idProduct);
		em.remove(p);
	}

	@Override
	public void updatePoduct(Product product) {
		Product p =em.find(Product.class, product.getId());
		p.setProduct(product);
		em.flush();
	}
	

	@Override
	public List<Product> findAllProduct() {
		Query req=em.createQuery("select p from Product p");
		return req.getResultList();
	}

	@Override
	public List<Product> findAllProductByLabel(String label) {
		Query req=em.createQuery("select p from Product p where p.label like :x");
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
	public Product getProduct(long idProduct) {	
		return em.find(Product.class, idProduct);
	}


}
