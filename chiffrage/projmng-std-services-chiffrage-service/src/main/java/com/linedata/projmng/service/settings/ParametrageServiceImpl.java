package com.linedata.projmng.service.settings;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.BeanMapper;
import com.linedata.projmng.bean.chiffrage.ProductBean;
import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.dao.api.ProductDao;
import com.linedata.projmng.service.api.settings.ParametrageService;

@Service
@Transactional(value="transactionManager",readOnly = true)
public class ParametrageServiceImpl implements ParametrageService{

	
	@Autowired
    ProductDao productDao;

	@Autowired
	@Qualifier(value="ChiffrageDetail")
	BeanMapper mapper;
	
	
	@Override
	public boolean addElement(ProductBean product) {		
		return true;
	}

	@Override
	public ProductBean addProduct(ProductBean pb) {	
		Product p = mapper.map(pb, Product.class);
		productDao.addProduct(p);
		return pb;
	}

	@Override
	public ProductBean getProduct(long idProduct) {
		return	mapper.map(productDao.getProduct(idProduct),ProductBean.class);
	}

	
}
