package com.linedata.projmng.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.dao.api.ProductDao;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public ProductDao addProduct(Product product) {
		em.persist(product);
		return null;
	}

	@Override
	public boolean removeProduct(long idProduct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePoduct(long idProduct) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

	@Override
	public ProductDao findProductByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDao> findAllProduct() {
		// TODO Auto-generated method stub
		return null;
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
