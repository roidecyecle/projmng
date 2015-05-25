package com.linedata.projmng.service.settings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.BeanMapper;

import com.linedata.projmng.bean.chiffrage.ProductBean;
import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.dao.api.ProductDao;
import com.linedata.projmng.dao.api.SubjectDao;
import com.linedata.projmng.service.api.settings.SettingProductService;

@Service
@Transactional(value = "transactionManager", readOnly = true)
public class SettingProductServiceImpl  implements SettingProductService{

	@Autowired
	@Qualifier(value = "ChiffrageDetail")
	BeanMapper mapper;

	@Autowired
	ProductDao productDao;

	@Autowired
	SubjectDao subjectDao;


	@Override
	public ProductBean addProduct(ProductBean product) {
		productDao.addProduct(mapper.map(product, Product.class));
		return product;
	}


	@Override
	public ProductBean getProduct(long idProduct) {
		Product p = productDao.getProduct(idProduct);
		return mapper.map(p, ProductBean.class);
	}


	@Override
	public void removePoduct(long idProduct) {
		productDao.removeProduct(idProduct);
	}


	@Override
	public void updateProduct(ProductBean product) {
		Product p = mapper.map(product, Product.class);
		productDao.updatePoduct(p);
	}


	@Override
	public List<ProductBean> findAllProduct() {
		List<ProductBean> list = new ArrayList<ProductBean>();
		for(Product p:productDao.findAllProduct()){
			ProductBean pb = mapper.map(p,ProductBean.class);
			list.add(pb);
		}
		return list;
	}


	@Override
	public List<ProductBean> findAllProductByLabel(String label) {
		List<ProductBean> list = new ArrayList<ProductBean>();
		for(Product p:productDao.findAllProductByLabel(label)){
			ProductBean pb = mapper.map(p,ProductBean.class);
			list.add(pb);
		}
		return list;
	}






	

}
