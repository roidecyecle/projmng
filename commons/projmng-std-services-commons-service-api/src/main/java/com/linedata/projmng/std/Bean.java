package com.linedata.projmng.std;

import com.linedata.ekip.std.services.core.bean.BeanWithKey;
 
public abstract class Bean implements BeanWithKey
{

   private long id;
   private Long version;

   public long getId()
   {
      return id;
   }

   public void setId(long id)
   {
      this.id = id;
   }

   public Long getVersion()
   {
      return version;
   }

   public void setVersion(Long version)
   {
      this.version = version;
   }

}
