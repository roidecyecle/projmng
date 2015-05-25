package com.linedata.projmng.service.api.settings;

import java.util.List;

import com.linedata.projmng.bean.chiffrage.ActionTypeBean;
import com.linedata.projmng.bean.chiffrage.ProductBean;


public interface SettingActionTypeService {

	public ProductBean addActionType(ActionTypeBean actiontype);
	public ProductBean removeActionType(ActionTypeBean actiontype);
	public ProductBean updateActionType(ActionTypeBean actiontype);
	
	
	public ProductBean getActionType(long idActionType);
	public List<ActionTypeBean> getAllActionType();
	public List<ActionTypeBean> getAllActionTypeByLabel(String label);
	
}
