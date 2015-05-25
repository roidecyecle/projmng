package com.linedata.ife.std.lov.entity;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.linedata.ife.std.lov.entity.impl.DataImpl;
import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;

/**
 * @author tzammel
 */
@XmlSeeAlso(DataImpl.class)
public interface Data
{
   /**
    * @return
    */
   String getKey();

   /**
    * @param key
    */
   void setKey(String key);

   /**
    * @return
    */
   Object getValue();

   /**
    * @param value
    */
   void setValue(Object value);

}
