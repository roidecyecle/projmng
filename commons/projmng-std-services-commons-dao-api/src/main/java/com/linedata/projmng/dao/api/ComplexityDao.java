package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Complexity;

public interface ComplexityDao {

	public Complexity addComplexity(Complexity complexity);
	public Complexity updateComplexity(Complexity complexity);
	public Complexity removeComplexity(Complexity complexity);
	
	public List<Complexity> getAllComplexities();
}
