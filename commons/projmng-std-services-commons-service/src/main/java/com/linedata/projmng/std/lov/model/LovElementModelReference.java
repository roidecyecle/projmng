package com.linedata.projmng.std.lov.model;

import com.linedata.ekip.std.dao.core.ModelReference;

/**
 * @author tzammel
 */
public interface LovElementModelReference extends ModelReference
{
   String BEANID = "LovElementModelReference";

   String getCodeType();

   void setCodeType(String codeType);

   String getValue();

   void setValue(String value);

}
