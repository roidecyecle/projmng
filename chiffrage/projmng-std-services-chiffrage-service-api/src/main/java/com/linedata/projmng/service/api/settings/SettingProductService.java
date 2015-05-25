package com.linedata.projmng.service.api.settings;

import java.util.List;

import com.linedata.projmng.bean.chiffrage.ProductBean;


public interface SettingProductService {

	public ProductBean addProduct(ProductBean product);
	public void removePoduct(long idProduct);
	public void updateProduct(ProductBean product);

	public ProductBean getProduct(long idProduct);
	public List<ProductBean> findAllProduct();
	public List<ProductBean> findAllProductByLabel(String label);
	
}
