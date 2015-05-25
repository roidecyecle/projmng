package com.linedata.projmng.std.lov.model.impl;

import com.linedata.projmng.std.lov.model.LovElementModel;




/**
 * @author tzammel
 */
public class LovElementModelImpl extends LovElementModelReferenceImpl implements LovElementModel
{
   private String shortDescrip;
   private String descrip;
   private String help;
   private String statusCode;
   private String statusDesc;
   private String defvalFlag;
   private String defvalDesc;
   private String value1;
   private String internalValue;
   private String firstAttribute;
   private String secondAttribute;
   private String thirdAttribute;

   public String getValue1()
   {
      return value1;
   }

   public void setValue1(String value1)
   {
      this.value1 = value1;
   }

   public String getInternalValue()
   {
      return internalValue;
   }

   public void setInternalValue(String internalValue)
   {
      this.internalValue = internalValue;
   }

   public String getFirstAttribute()
   {
      return firstAttribute;
   }

   public void setFirstAttribute(String firstAttribute)
   {
      this.firstAttribute = firstAttribute;
   }

   public String getSecondAttribute()
   {
      return secondAttribute;
   }

   public void setSecondAttribute(String secondAttribute)
   {
      this.secondAttribute = secondAttribute;
   }

   public String getThirdAttribute()
   {
      return thirdAttribute;
   }

   public void setThirdAttribute(String thirdAttribute)
   {
      this.thirdAttribute = thirdAttribute;
   }

   public String getShortDescrip()
   {
      return shortDescrip;
   }

   public void setShortDescrip(String shortDescrip)
   {
      this.shortDescrip = shortDescrip;
   }

   public String getDescrip()
   {
      return descrip;
   }

   public void setDescrip(String descrip)
   {
      this.descrip = descrip;
   }

   public String getHelp()
   {
      return help;
   }

   public void setHelp(String help)
   {
      this.help = help;
   }

   public String getStatusCode()
   {
      return statusCode;
   }

   public void setStatusCode(String statusCode)
   {
      this.statusCode = statusCode;
   }

   public String getStatusDesc()
   {
      return statusDesc;
   }

   public void setStatusDesc(String statusDesc)
   {
      this.statusDesc = statusDesc;
   }

   public String getDefvalFlag()
   {
      return defvalFlag;
   }

   public void setDefvalFlag(String defvalFlag)
   {
      this.defvalFlag = defvalFlag;
   }

   public String getDefvalDesc()
   {
      return defvalDesc;
   }

   public void setDefvalDesc(String defvalDesc)
   {
      this.defvalDesc = defvalDesc;
   }

}
