package com.linedata.projmng.std.lov.Entity;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;

import com.linedata.ekip.std.services.core.entity.EntityReference;
import com.linedata.projmng.std.lov.Entity.impl.LovElementReferenceImpl;


/**
 * @author tzammel
 */
@XmlSeeAlso(LovElementReferenceImpl.class)
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
public interface LovElementReference extends EntityReference
{

   String BEANID = "LovElementReference";

   /**
    * @return
    */
   String getCodeType();

   /**
    * @param codeType
    */
   void setCodeType(String codeType);

   /**
    * @return
    */
   String getValue();

   /**
    * @param value
    */
   void setValue(String value);
}
