package com.linedata.projmng.service.chiffrage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.BeanMapper;
import com.linedata.projmng.bean.chiffrage.ProductBean;
import com.linedata.projmng.bean.chiffrage.UnitOfWorkBean;
import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.EstimationDao;
import com.linedata.projmng.dao.api.UnitOfWorkDao;
import com.linedata.projmng.service.api.chiffrage.UnitOfWorkService;

@Service
@Transactional(value = "transactionManager", readOnly = true)
public class UnitOfWorkServiceImpl implements UnitOfWorkService{
	
	@Autowired
	EstimationDao estimationDao;
	
	@Autowired
	UnitOfWorkDao unitOfWorkDao;
	
	
	@Autowired
	@Qualifier(value = "ChiffrageDetail")
	BeanMapper mapper;

	@Override
	public UnitOfWorkBean addUniOfWork(UnitOfWorkBean unit, long idEstimation, long idActionType, long idAbaque) {
		UnitOfWork u = mapper.map(unit, UnitOfWork.class);
		u=  unitOfWorkDao.addUniOfWork(u, idEstimation, idActionType, idAbaque);
		unit.setId(u.getId());
		return unit;
	}

	@Override
	public UnitOfWorkBean updateUnitOfWork(UnitOfWorkBean unit, long idAtionType, long idAbaque) {
		UnitOfWork u = mapper.map(unit, UnitOfWork.class);
		u = unitOfWorkDao.updateUnitOfWork(u, idAtionType, idAbaque);
		unit = mapper.map(u, UnitOfWorkBean.class);
		return unit;
	}

	@Override
	public void deleteUnitOfWork(long idUnit) {
		unitOfWorkDao.deleteUnitOfWork(idUnit);
	}

	@Override
	public UnitOfWorkBean getUnitOfWorkDetail(long idUnit) {
		UnitOfWork u = unitOfWorkDao.getUnitOfWorkDetail(idUnit);
		return mapper.map(u, UnitOfWorkBean.class);
	}

	@Override
	public List<UnitOfWorkBean> getAllUnitByEstimation(long idEstimation) {
		List<UnitOfWorkBean> list = new ArrayList<UnitOfWorkBean>();
		for(UnitOfWork u: unitOfWorkDao.getAllUnitByEstimation(idEstimation)){
			UnitOfWorkBean ub = mapper.map(u,UnitOfWorkBean.class);
			list.add(ub);
		}
		return list;	
	}



	
}
