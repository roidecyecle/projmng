package com.linedata.projmng.service.api.chiffrage;

import java.util.List;

import com.linedata.projmng.bean.chiffrage.UnitOfWorkBean;


public interface UnitOfWorkService {

	public UnitOfWorkBean addUniOfWork(UnitOfWorkBean unit, long idEstimation, long idActionType, long idAbaque);
	public UnitOfWorkBean updateUnitOfWork(UnitOfWorkBean unit, long idAtionType, long idAbaque);
	public void deleteUnitOfWork(long idUnit);
	
	public UnitOfWorkBean getUnitOfWorkDetail(long idUnit);
	public List<UnitOfWorkBean> getAllUnitByEstimation(long idEstimation);
}
