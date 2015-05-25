package com.linedata.ife.std.lov.entity;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.linedata.ekip.std.services.core.entity.Entity;
import com.linedata.ife.std.lov.entity.impl.LovElementImpl;
import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;

/**
 * @author tzammel
 */
@XmlSeeAlso(LovElementImpl.class)
@XmlJavaTypeAdapter(AnyTypeAdapter.class)
public interface LovElement extends Entity, LovElementReference
{

   String BEANID = "LovElement";

   /**
    * @return
    */
   String getValue1();

   /**
    * @param value1
    */
   void setValue1(String value1);

   /**
    * @return
    */
   String getInternalValue();

   /**
    * @param internalValue
    */
   void setInternalValue(String internalValue);

   /**
    * @return
    */
   String getFirstAttribute();

   /**
    * @param firstAttribute
    */
   void setFirstAttribute(String firstAttribute);

   /**
    * @return
    */
   String getSecondAttribute();

   /**
    * @param secondAttribute
    */
   void setSecondAttribute(String secondAttribute);

   /**
    * @return
    */
   String getThirdAttribute();

   /**
    * @return
    */
   String getShortDescrip();

   /**
    * @param shortDescrip
    */
   void setShortDescrip(String shortDescrip);

   /**
    * @return
    */
   String getDescrip();

   /**
    * @param descrip
    */
   void setDescrip(String descrip);

   /**
    * @return
    */
   String getHelp();

   /**
    * @param help
    */
   void setHelp(String help);

   /**
    * @return
    */
   String getStatusCode();

   /**
    * @param statusCode
    */
   void setStatusCode(String statusCode);

   /**
    * @return
    */
   String getStatusDesc();

   /**
    * @param statusCesc
    */
   void setStatusDesc(String statusCesc);

   /**
    * @return
    */
   String getDefvalFlag();

   /**
    * @param defvalFlag
    */
   void setDefvalFlag(String defvalFlag);

   /**
    * @return
    */
   String getDefvalDesc();

   /**
    * @param defvalDesc
    */
   void setDefvalDesc(String defvalDesc);
}
