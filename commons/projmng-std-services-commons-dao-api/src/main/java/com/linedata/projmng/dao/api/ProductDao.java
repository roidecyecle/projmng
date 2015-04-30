package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Product;

public interface ProductDao {

	public ProductDao addProduct(Product product);
	public boolean removeProduct(long idProduct);
	public boolean updatePoduct(long idProduct);
	public ProductDao findProductByLabel(String label);
	public List<ProductDao> findAllProduct();
	public Product getProduct(long idProduct);
}
