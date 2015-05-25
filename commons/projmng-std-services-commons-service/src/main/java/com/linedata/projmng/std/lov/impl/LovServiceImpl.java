package com.linedata.projmng.std.lov.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.commons.server.log.LogFactory;
import com.linedata.ekip.commons.server.log.Logger;
import com.linedata.ekip.commons.shared.context.ActionContext;
import com.linedata.ekip.std.dao.core.ExecutionContext;
import com.linedata.ekip.std.dao.core.ExecutionMode;
import com.linedata.ekip.std.services.core.service.impl.ServiceImpl;
import com.linedata.projmng.std.lov.LovQueryService;
import com.linedata.projmng.std.lov.Entity.DataMap;
import com.linedata.projmng.std.lov.Entity.LovElement;
import com.linedata.projmng.std.lov.Entity.LovElementReference;
import com.linedata.projmng.std.lov.dao.LovDao;
import com.linedata.projmng.std.lov.service.LovService;


/**
 * List of values management
 * 
 * @author T.ZAMMEL
 */
@Transactional(readOnly = true)
public class LovServiceImpl extends ServiceImpl<LovElementReference, LovElement> implements LovService
{
   private final Logger                 log = LogFactory.getLog(LovServiceImpl.class);

   @Resource(name = "LovDao")
   private LovDao                       lovDao;

   @Autowired(required = false)
   private List<LovQueryService>        lovQueryServices;

   private Map<String, LovQueryService> lovQueryServiceMap;

   public void manageMap()
   {
      lovQueryServiceMap = new HashMap<String, LovQueryService>();
      if (lovQueryServices != null)
      {
         for (LovQueryService lovQueryService : lovQueryServices)
         {
            if (!lovQueryServiceMap.containsKey(lovQueryService.getBeanId()))
            {
               lovQueryServiceMap.put(lovQueryService.getBeanId(), lovQueryService);
            }
         }
      }

   }

   public List<LovElement> getLov(ActionContext actionContext, String lovName, DataMap filters)
   {

      Random randomGenerator = new Random();
      int transactionId = randomGenerator.nextInt(100);
      ExecutionContext executionContext = getExecutionContext(actionContext, ExecutionMode.NEX);

      List<LovElement> result = null;

      log.info(actionContext, "LovService.getLov transaction " + transactionId + " lovName " + lovName);

      if (lovName != null)
      {
         LovQueryService lovQueryService;
         String typlov = lovDao.getLovType(executionContext, lovName);
         if (!typlov.equals("Spec"))
         {
            if (typlov.equals("CCOD") || typlov.equals("CCA"))
            {
               lovQueryService = lovQueryServiceMap.get("ConstraintLovQueryService");
            }
            else
            {
               lovQueryService = lovQueryServiceMap.get("SimpleLovQueryService");
            }

            result = lovQueryService.getLov(executionContext, lovName, (com.linedata.ekip.std.services.core.query.DataMap) filters);

         }
         else
         {

            if (lovQueryServiceMap.containsKey(lovName))
            {
               lovQueryService = lovQueryServiceMap.get(lovName);

               result = lovQueryService.getLov(executionContext, lovName, (com.linedata.ekip.std.services.core.query.DataMap) filters);
            }

         }
      }
      if (result != null)
      {
         log.info(actionContext, "LovService.getLov Result  transaction " + transactionId + " result.size() " + result.size());
         return result;
      }

      log.info(actionContext, "LovService.getLov Result  transaction " + transactionId + " result.size()  null");
      return new ArrayList<LovElement>();

   }

   @Override
   public String getBeanId()
   {

      return BEANID;
   }

   @Override
   public String getLovDefaultValue(ActionContext actionContext, String lovName, DataMap filters)
   {
      // intialise the default value

      List<LovElement> lovElements = getLov(actionContext, lovName, filters);
      // search for the right value
      for (LovElement element : lovElements)
      {
         if (element.getDefvalFlag().equals("O"))
         {
            return element.getValue();
         }

      }
      return null;
   }

   @Override
   public String getLovDescription(ActionContext actionContext, String lovName, DataMap filters, String lovValue)
   {
      // intialise the default value
      List<LovElement> lovElements = getLov(actionContext, lovName, filters);
      // search for the right value
      for (LovElement element : lovElements)
      {
         if (element.getValue().equals(lovValue))
         {
            return element.getDescrip();
         }

      }
      return null;
   }

   @Override
   public String getLovSecondAttribute(ActionContext actionContext, String lovName, DataMap filters, String lovValue)
   {
      // getting the second value
      List<LovElement> lovElements = getLov(actionContext, lovName, filters);
      // search for the right value
      for (LovElement element : lovElements)
      {
         if (element.getValue().equals(lovValue))
         {
            return element.getSecondAttribute();
         }

      }
      return null;
   }

   @Override
   public String getLovFirstAttribute(ActionContext actionContext, String lovName, DataMap filters, String lovValue)
   {
      // getting the second value
      List<LovElement> lovElements = getLov(actionContext, lovName, filters);
      // search for the right value
      for (LovElement element : lovElements)
      {
         if (element.getValue().equals(lovValue))
         {
            return element.getFirstAttribute();
         }

      }
      return null;
   }
}
