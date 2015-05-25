package com.linedata.projmng.std.lov.dao;

import java.util.List;
import java.util.NoSuchElementException;

import com.linedata.ekip.std.dao.core.ExecutionContext;
import com.linedata.ekip.std.dao.core.ObjectDao;
import com.linedata.ekip.std.dao.core.exception.TechnicalException;
import com.linedata.projmng.std.lov.model.CodeTypeModel;
import com.linedata.projmng.std.lov.model.LovElementModel;
import com.linedata.projmng.std.lov.model.LovElementModelReference;


/**
 * @author tzammel
 */
public interface LovDao extends ObjectDao<LovElementModelReference, LovElementModel>
{
   String BEANID = "LovDao";

   String getLovType(ExecutionContext executionContext, String lovName);

   List<LovElementModel> getLov(ExecutionContext executionContext, Object[] filters, String queryName) throws NoSuchElementException, TechnicalException;

   CodeTypeModel getCodeType(String lovName);

}
