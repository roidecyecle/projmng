package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.Status;
import com.linedata.projmng.commons.model.UnitOfWork;

public interface EstimationDao {
	
	public Estimation addEstimation(Estimation estimation,long idAuteur, long idSubject);
	public Estimation updateEstimation(Estimation estimation);
	public void deleteEstimation(long idEstilmation);
	
	public Estimation getEstimation(long idEstimation);
	public List<UnitOfWork> getAllUnits(long idEstimation);
	public List<Estimation> getAllEstimationByLabel(String label);
	
	public Estimation ChangeStatus(long idEstimation, Status st);
	
	public double getCostByEstimation(long idEstimation);
	
	
}
