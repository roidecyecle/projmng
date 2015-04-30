package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.ActionType;
import com.linedata.projmng.commons.model.UnitOfWork;


public interface ActionTypeDao {
	
	public ActionType addActionType(ActionType actionType);
	public ActionType updateActionType(ActionType actionType);
	public boolean removeActionType(ActionType actionType);
	
	public ActionType getActionType(long idAction);
	public List<UnitOfWork> getUnitsByAction(long idAction);

}
