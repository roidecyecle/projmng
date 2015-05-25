package com.linedata.projmng.std.lov.Entity.impl;

import javax.xml.bind.annotation.XmlType;


import com.linedata.ekip.std.services.core.entity.impl.EntityReferenceImpl;
import com.linedata.projmng.std.lov.Entity.LovElementReference;


@XmlType(name = "LovElementReference")
public class LovElementReferenceImpl extends EntityReferenceImpl implements LovElementReference
{

   private String codeType;
   private String value;

   public boolean isValid()
   {
      return false;
   }
   
   public final String getCodeType()
   {
      return codeType;
   }

   public final void setCodeType(String codeType)
   {
      this.codeType = codeType;
   }

   public final String getValue()
   {
      return value;
   }

   public final void setValue(String value)
   {
      this.value = value;
   }

   public String getFactoryBeanId()
   {
      return "LovElementReferenceFactory";
   }

   public String getWorkflowEntityCodification()
   {
      return null;
   }
   
   public String getInternalId()
   {
      return null;
   }
}
