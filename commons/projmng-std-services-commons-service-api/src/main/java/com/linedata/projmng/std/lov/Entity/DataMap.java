package com.linedata.projmng.std.lov.Entity;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.linedata.projmng.std.lov.Entity.impl.DataMapImpl;



/**
 * @author tzammel
 */
@XmlSeeAlso(DataMapImpl.class)
public interface DataMap
{
   /**
    * @param key
    * @param value
    */
   void put(String key, Object value);

   /**
    * @param key
    * @return
    */
   Object get(String key);

   /**
    * @param map
    */
   void putAll(Map<String, Object> map);

   /**
    * @return
    */
   List<Data> getDataList();

}
