package com.linedata.projmng.std.lov.model;

/**
 * @author tzammel
 */
public interface LovElementModel extends LovElementModelReference
{
   String BEANID = "LovElementModel";

   String getValue1();

   void setValue1(String value1);

   String getInternalValue();

   void setInternalValue(String internalValue);

   String getFirstAttribute();

   void setFirstAttribute(String firstAttribute);

   String getSecondAttribute();

   void setSecondAttribute(String secondAttribute);

   String getThirdAttribute();

   void setThirdAttribute(String thirdAttribute);

   String getShortDescrip();

   void setShortDescrip(String shortDescrip);

   String getDescrip();

   void setDescrip(String descrip);

   String getHelp();

   void setHelp(String help);

   String getStatusCode();

   void setStatusCode(String statusCode);

   String getStatusDesc();

   void setStatusDesc(String statusDesc);

   String getDefvalFlag();

   void setDefvalFlag(String defvalFlag);

   String getDefvalDesc();

   void setDefvalDesc(String defvalDesc);

}
