package com.linedata.projmng.dao.api;

import com.linedata.projmng.commons.model.Abacus;



public interface AbacusDao {

	public boolean addElement(Abacus abacus, long idComponent, long idComplexity);
	public boolean updateElement(long idAbacus, long idComponent, long idComplexity);
	public boolean removeElement(long idAbacus);
	
	public Abacus getAbacusElements(long idAbacus);
}
