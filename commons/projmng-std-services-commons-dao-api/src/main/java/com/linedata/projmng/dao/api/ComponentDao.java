package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Component;

public interface ComponentDao {

	public void addComponent(Component component);
	public void updateComponent(Component component);
	public void removeComponent(Component component);
	
	public List<Component> getAllComponents();
}
