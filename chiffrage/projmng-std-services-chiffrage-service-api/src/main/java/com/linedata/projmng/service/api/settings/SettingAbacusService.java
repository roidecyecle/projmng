package com.linedata.projmng.service.api.settings;

import java.util.List;

import com.linedata.projmng.bean.chiffrage.AbacusBean;



public interface SettingAbacusService {

	
	public AbacusBean addElement(AbacusBean a);
	public AbacusBean getAbacus(long idAbacus);
	public List<AbacusBean> getAllAbacus();
	public List<AbacusBean> getAllAbacusByLabel(String label);
	
}
