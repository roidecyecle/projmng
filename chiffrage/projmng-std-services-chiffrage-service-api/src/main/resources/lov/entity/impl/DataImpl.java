package com.linedata.ife.std.lov.entity.impl;

import com.linedata.ife.std.lov.entity.Data;

public class DataImpl implements Data
{
   private String key;

   private Object value;

   public final String getKey()
   {
      return key;
   }

   public final void setKey(String key)
   {
      this.key = key;
   }

   public final Object getValue()
   {
      return value;
   }

   public final void setValue(Object value)
   {
      this.value = value;
   }

}
