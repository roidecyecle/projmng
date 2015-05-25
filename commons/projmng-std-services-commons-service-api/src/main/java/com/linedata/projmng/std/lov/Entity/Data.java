package com.linedata.projmng.std.lov.Entity;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import com.linedata.ekip.std.xml.bind.AnyTypeAdapter;
import com.linedata.projmng.std.lov.Entity.impl.DataImpl;

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
