package com.linedata.projmng.service.api.chiffrage;

import java.util.List;

import javax.transaction.Status;

import com.linedata.projmng.bean.chiffrage.EstimationBean;
import com.linedata.projmng.bean.chiffrage.UnitOfWorkBean;


public interface EstimationService {

	public EstimationBean addEstimation(EstimationBean estimation,long idAuteur, long idSubject);
	public EstimationBean updateEstimation(EstimationBean estimation);
	public void deleteEstimation(long idEstilmation);
	
	public EstimationBean getEstimation(long idEstimation);
	public List<UnitOfWorkBean> getAllUnits(long idEstimation);
	public List<EstimationBean> getAllEstimationByLabel(String label);
	
	public EstimationBean ChangeStatus(long idEstimation, Status st);
	
	public double getCostByEstimation(long idEstimation);
}
