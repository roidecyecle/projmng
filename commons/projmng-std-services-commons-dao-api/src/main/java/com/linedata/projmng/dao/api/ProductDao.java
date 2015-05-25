package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Product;

public interface ProductDao {

	public Product addProduct(Product product);
	public void removeProduct(long idProduct);
	public void updatePoduct(Product Product);
	
	public Product getProduct(long idProduct);
	public List<Product> findAllProduct();
	public List<Product> findAllProductByLabel(String label);
	
}
