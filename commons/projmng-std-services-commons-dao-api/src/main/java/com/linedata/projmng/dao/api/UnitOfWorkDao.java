package com.linedata.projmng.dao.api;

import com.linedata.projmng.commons.model.UnitOfWork;

public interface UnitOfWorkDao {

	public UnitOfWork addUniOfWork(UnitOfWork unit, long idEstimation, long idActionType, long idAbaque);
	public UnitOfWork updateUnitOfWork(UnitOfWork unit, long idAtionType, long idAbaque);
	public boolean deleteUnitOfWork(long idUnit);
	
	public UnitOfWork getUnitOfWorkDetail(long idUnit);
	
}
