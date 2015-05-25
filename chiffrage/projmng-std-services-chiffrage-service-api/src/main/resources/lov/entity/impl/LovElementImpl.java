package com.linedata.ife.std.lov.entity.impl;

import javax.xml.bind.annotation.XmlType;

import com.linedata.ife.std.lov.entity.LovElement;

@XmlType(name = "LovElement")
public class LovElementImpl extends LovElementReferenceImpl implements LovElement
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

   public final String getValue1()
   {
      return value1;
   }

   public final void setValue1(String value1)
   {
      this.value1 = value1;
   }

   public final String getInternalValue()
   {
      return internalValue;
   }

   public final void setInternalValue(String internalValue)
   {
      this.internalValue = internalValue;
   }

   public final String getFirstAttribute()
   {
      return firstAttribute;
   }

   public final void setFirstAttribute(String firstAttribute)
   {
      this.firstAttribute = firstAttribute;
   }

   public final String getSecondAttribute()
   {
      return secondAttribute;
   }

   public final void setSecondAttribute(String secondAttribute)
   {
      this.secondAttribute = secondAttribute;
   }

   public final String getThirdAttribute()
   {
      return thirdAttribute;
   }

   public final void setThirdAttribute(String thirdAttribute)
   {
      this.thirdAttribute = thirdAttribute;
   }

   public final String getShortDescrip()
   {
      return shortDescrip;
   }

   public final void setShortDescrip(String shortDescrip)
   {
      this.shortDescrip = shortDescrip;
   }

   public final String getDescrip()
   {
      return descrip;
   }

   public final void setDescrip(String descrip)
   {
      this.descrip = descrip;
   }

   public final String getHelp()
   {
      return help;
   }

   public final void setHelp(String help)
   {
      this.help = help;
   }

   public final String getStatusCode()
   {
      return statusCode;
   }

   public final void setStatusCode(String statusCode)
   {
      this.statusCode = statusCode;
   }

   public final String getStatusDesc()
   {
      return statusDesc;
   }

   public final void setStatusDesc(String statusDesc)
   {
      this.statusDesc = statusDesc;
   }

   public final String getDefvalFlag()
   {
      return defvalFlag;
   }

   public final void setDefvalFlag(String defvalFlag)
   {
      this.defvalFlag = defvalFlag;
   }

   public final String getDefvalDesc()
   {
      return defvalDesc;
   }

   public final void setDefvalDesc(String defvalDesc)
   {
      this.defvalDesc = defvalDesc;
   }
}
