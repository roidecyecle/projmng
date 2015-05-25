package com.linedata.ife.std.lov.entity.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.linedata.ife.std.lov.entity.Data;
import com.linedata.ife.std.lov.entity.DataMap;

public class DataMapImpl implements DataMap
{
   private List<Data> dataList = new ArrayList<Data>();

   public final List<Data> getDataList()
   {
      return dataList;
   }

   public final void setDataList(List<Data> dataList)
   {
      this.dataList = dataList;
   }

   public final void put(String key, Object value)
   {
      Data data = new DataImpl();
      data.setKey(key);  
      data.setValue(value);
      dataList.add(data);
   }

   @Override
   public final Object get(String key)
   {
      for (Data data : dataList)
      {
         if (data.getKey() != null && data.getKey().equals(key))
         {

            return data.getValue();

         }
      }
      return null;
   }

   @Override
   public final void putAll(Map<String, Object> map)
   {

      if (map != null)
      {
         for (Entry<String, Object> ent : map.entrySet())
         {
            this.put((String) ent.getKey(), ent.getValue());
         }
      }

   }
}
