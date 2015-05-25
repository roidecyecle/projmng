package com.linedata.projmng.std.lov.model.impl;

import com.linedata.projmng.std.lov.model.LovElementModelReference;




/**
 * @author tzammel
 */
public class LovElementModelReferenceImpl implements LovElementModelReference
{

   private String codeType;
   private String value;

   public String getCodeType()
   {
      return codeType;
   }

   public void setCodeType(String codeType)
   {
      this.codeType = codeType;
   }

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

   @Override
   public boolean isValid()
   {

      return false;
   }

   @Override
   public Boolean needExec()
   {

      return null;
   }

   @Override
   public void setExecWithSuccessAtLeastOneTime(boolean arg0)
   {

   }

   @Override
   public void setNeedExec(Boolean arg0)
   {

   }

   @Override
   public Object[] getModelReferenceAsArray()
   {

      return new Object[] {};
   }

}
