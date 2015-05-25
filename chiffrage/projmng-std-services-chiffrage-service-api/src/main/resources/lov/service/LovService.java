package com.linedata.ife.std.lov.service;

import java.util.List;

import javax.jws.WebService;

import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.std.services.core.service.Service;
import com.linedata.ife.std.lov.entity.DataMap;
import com.linedata.ife.std.lov.entity.LovElement;

/**
 * List of values management
 * 
 * @author T.ZAMMEL
 */
@WebService
public interface LovService extends Service
{
   /* bean id */
   String BEANID = "LovService";

   /**
    * manages list of values
    * 
    * @author T.ZAMMEL
    * @param ActionContext
    * @param lovName lov name
    * @param Filters
    * @return list of values
    */

   List<LovElement> getLov(ActionContext actionContext, String lovName, DataMap filters);

   /**
    * this methode is allowed the get the default value of a Lov
    * 
    * @param actionContext
    * @param lovName
    * @param filters
    * @return
    */
   String getLovDefaultValue(ActionContext actionContext, String lovName, DataMap filters);

   /**
    * manages list of values
    * 
    * @author M.Abdennadher
    * @param ActionContext
    * @param lovName lov name
    * @param Filters
    * @param value
    * @return String Lov description
    */
   String getLovDescription(ActionContext actionContext, String lovName, DataMap filters, String value);

   /**
    * this method is allowed to return the second attribut of a LOV
    * 
    * @param actionContext
    * @param lovName
    * @param filters
    * @param lovValue
    * @return
    */
   String getLovSecondAttribute(ActionContext actionContext, String lovName, DataMap filters, String value);

   /**
    * this method is allowed to return the first attribut of a LOV
    * 
    * @param actionContext
    * @param lovName
    * @param filters
    * @param lovValue
    * @return
    */
   String getLovFirstAttribute(ActionContext actionContext, String lovName, DataMap filters, String lovValue);

}
