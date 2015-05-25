package com.linedata.projmng.service.chiffrage;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.BeanMapper;
import com.linedata.projmng.bean.chiffrage.EstimationBean;
import com.linedata.projmng.bean.chiffrage.UnitOfWorkBean;
import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.EstimationDao;
import com.linedata.projmng.dao.api.UnitOfWorkDao;
import com.linedata.projmng.service.api.chiffrage.EstimationService;

@Service
@Transactional(value = "transactionManager", readOnly = true)
public class EstimationServiceImpl implements EstimationService{
	
	@Autowired
	EstimationDao estimationDao;
	
	@Autowired
	UnitOfWorkDao unitDao;
	
	@Autowired
	@Qualifier(value = "ChiffrageDetail")
	BeanMapper mapper;

	@Override
	public EstimationBean addEstimation(EstimationBean estimation,long idAuteur, long idSubject) {
		Estimation e = mapper.map(estimation, Estimation.class);
		e = estimationDao.addEstimation(e, idAuteur, idSubject);
		estimation.setId(e.getId());
		return estimation;
	}

	@Override
	public EstimationBean updateEstimation(EstimationBean estimation) {
		Estimation e = mapper.map(estimation, Estimation.class);
		estimationDao.updateEstimation(e);
		return estimation;
	}

	@Override
	public void deleteEstimation(long idEstilmation) {
		estimationDao.deleteEstimation(idEstilmation);	
	}

	@Override
	public EstimationBean getEstimation(long idEstimation) {
		Estimation e = estimationDao.getEstimation(idEstimation);
		EstimationBean eb = mapper.map(e, EstimationBean.class);
		return eb;
	}

	@Override
	public List<UnitOfWorkBean> getAllUnits(long idEstimation) {
		List<UnitOfWorkBean> list = new ArrayList<UnitOfWorkBean>();
		for(UnitOfWork u: unitDao.getAllUnitByEstimation(idEstimation)) {
			UnitOfWorkBean ub = mapper.map(u,UnitOfWorkBean.class);
			list.add(ub);
		}
		return list;
	}

	@Override
	public List<EstimationBean> getAllEstimationByLabel(String label) {
		List<EstimationBean> list = new ArrayList<EstimationBean>();
		for(Estimation e: estimationDao.getAllEstimationByLabel(label)){
			EstimationBean eb = mapper.map(e,EstimationBean.class);
			list.add(eb);
		}
		return list;	
	}

	@Override
	public EstimationBean ChangeStatus(long idEstimation, Status st) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCostByEstimation(long idEstimation) {
		return estimationDao.getCostByEstimation(idEstimation);
	}
	
}
