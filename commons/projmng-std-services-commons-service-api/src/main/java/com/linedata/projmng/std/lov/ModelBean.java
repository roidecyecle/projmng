package com.linedata.projmng.std.lov;

import com.linedata.ekip.std.utils.commons.java.SerialVersionUID;
import com.linedata.projmng.std.Bean;

/**
 * Form bean for administration_Lov. Represents a LovElt.
 */
public class ModelBean extends Bean
{
   /** serialVersionUID. */
   static final long          serialVersionUID = SerialVersionUID.compute(ModelBean.class);

   public static final String BEAN_KEY         = "ModelBean";

   public String getBeanKey()
   {
      return BEAN_KEY;
   }

   /** Type value */
   private String type;

   /**
    * Getter for type value
    * 
    * @return type
    */
   public String getType()
   {
      return this.type;
   }

   /**
    * Setter for Type value
    * 
    * @param type the Type value
    */
   public void setType(String type)
   {
      this.type = type;
   }

}
