package com.linedata.projmng.service.api.settings;

import com.linedata.projmng.bean.chiffrage.ProductBean;



public interface ParametrageService {
	

	public boolean addElement(ProductBean product);
	public ProductBean addProduct(ProductBean pb);
	public ProductBean getProduct(long idProduct);
	
}
