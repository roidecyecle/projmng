package com.linedata.projmng.std.lov;

import com.linedata.ekip.std.utils.commons.java.SerialVersionUID;
import com.linedata.projmng.std.Bean;

/**
 * Form bean for administration_Lov. Represents a LovElt.
 */
public class LovBean extends Bean
{
   /** serialVersionUID. */
   static final long          serialVersionUID = SerialVersionUID.compute(LovBean.class);

   public static final String BEAN_KEY         = "LovBean";

   public String getBeanKey()
   {
      return BEAN_KEY;
   }

   /** LOV filter value */
   private String filter1;

   /**
    * Getter for LOV filter value
    * 
    * @return filter1
    */
   public String getFilter1()
   {
      return this.filter1;
   }

   /**
    * Setter for LOV filter value
    * 
    * @param filter1 the LOV filter value
    */
   public void setFilter1(String filter1)
   {
      this.filter1 = filter1;
   }

   /** LOV filter value */
   private String filter2;

   /**
    * Getter for LOV filter value
    * 
    * @return filter2
    */
   public String getFilter2()
   {
      return this.filter2;
   }

   /**
    * Setter for LOV filter value
    * 
    * @param filter2 the LOV filter value
    */
   public void setFilter2(String filter2)
   {
      this.filter2 = filter2;
   }

   /** LOV filter value */
   private String filter3;

   /**
    * Getter for LOV filter value
    * 
    * @return filter3
    */
   public String getFilter3()
   {
      return this.filter3;
   }

   /**
    * Setter for LOV filter value
    * 
    * @param filter3 the LOV filter value
    */
   public void setFilter3(String filter3)
   {
      this.filter3 = filter3;
   }

   /** value */
   private String value;

   /**
    * Getter for value
    * 
    * @return value
    */
   public String getValue()
   {
      return this.value;
   }

   /**
    * Setter for value
    * 
    * @param value the value
    */
   public void setValue(String value)
   {
      this.value = value;
   }

   /** Short label */
   private String shortLabel;

   /**
    * Getter for Short label
    * 
    * @return shortLabel
    */
   public String getShortLabel()
   {
      return this.shortLabel;
   }

   /**
    * Setter for Short label
    * 
    * @param shortLabel the Short label
    */
   public void setShortLabel(String shortLabel)
   {
      this.shortLabel = shortLabel;
   }

   /** Long label */
   private String longLabel;

   /**
    * Getter for Long label
    * 
    * @return longLabel
    */
   public String getLongLabel()
   {
      return this.longLabel;
   }

   /**
    * Setter for Long label
    * 
    * @param longLabel the Long label
    */
   public void setLongLabel(String longLabel)
   {
      this.longLabel = longLabel;
   }

   /** LOV attribute 1 */
   private String attribute1;

   /**
    * Getter for LOV attribute 1
    * 
    * @return attribute1
    */
   public String getAttribute1()
   {
      return this.attribute1;
   }

   /**
    * Setter for LOV attribute 1
    * 
    * @param attribute1 the LOV attribute 1
    */
   public void setAttribute1(String attribute1)
   {
      this.attribute1 = attribute1;
   }

   /** LOV attribute 2 */
   private String attribute2;

   /**
    * Getter for LOV attribute 2
    * 
    * @return attribute2
    */
   public String getAttribute2()
   {
      return this.attribute2;
   }

   /**
    * Setter for LOV attribute 2
    * 
    * @param attribute2 the LOV attribute 2
    */
   public void setAttribute2(String attribute2)
   {
      this.attribute2 = attribute2;
   }

   /** LOV attribute 3 */
   private String attribute3;

   /**
    * Getter for LOV attribute 3
    * 
    * @return attribute3
    */
   public String getAttribute3()
   {
      return this.attribute3;
   }

   /**
    * Setter for LOV attribute 3
    * 
    * @param attribute3 the LOV attribute 3
    */
   public void setAttribute3(String attribute3)
   {
      this.attribute3 = attribute3;
   }

   /** Status */
   private String status;
   private String statusShortLabel;
   private String statusLongLabel;

   /**
    * Getter for Status
    * 
    * @return status
    */
   public String getStatus()
   {
      return this.status;
   }

   /**
    * Setter for Status
    * 
    * @param status the Status
    */
   public void setStatus(String status)
   {
      this.status = status;
   }

   /** Rank for sort operation */
   private String orderNum;

   /**
    * Getter for Rank for sort operation
    * 
    * @return orderNum
    */
   public String getOrderNum()
   {
      return this.orderNum;
   }

   /**
    * Setter for Rank for sort operation
    * 
    * @param orderNum the Rank for sort operation
    */
   public void setOrderNum(String orderNum)
   {
      this.orderNum = orderNum;
   }

   public String getStatusLongLabel()
   {
      return statusLongLabel;
   }

   public void setStatusLongLabel(String statusLongLabel)
   {
      this.statusLongLabel = statusLongLabel;
   }

   public String getStatusShortLabel()
   {
      return statusShortLabel;
   }

   public void setStatusShortLabel(String statusShortLabel)
   {
      this.statusShortLabel = statusShortLabel;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj) return true;
      if (obj == null) return false;
      if (this.getClass() != obj.getClass()) return false;
      LovBean other = (LovBean) obj;
      if (this.value == null)
      {
         if (other.value != null) return false;
      }
      else if (!value.equals(other.value)) return false;
      return true;
   }

}
