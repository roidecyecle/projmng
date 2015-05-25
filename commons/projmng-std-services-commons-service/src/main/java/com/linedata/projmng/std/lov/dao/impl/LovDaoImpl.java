package com.linedata.projmng.std.lov.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.persistence.EntityManager;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.commons.server.log.LogFactory;
import com.linedata.ekip.commons.server.log.Logger;
import com.linedata.ekip.std.dao.core.ApiException;
import com.linedata.ekip.std.dao.core.ExecutionContext;
import com.linedata.ekip.std.dao.core.ExecutionMode;
import com.linedata.ekip.std.dao.core.exception.EkipDaoException;
import com.linedata.ekip.std.dao.core.exception.TechnicalException;
import com.linedata.ekip.std.dao.core.impl.ObjectDaoImpl;
import com.linedata.projmng.std.lov.dao.LovDao;
import com.linedata.projmng.std.lov.model.CodeTypeModel;
import com.linedata.projmng.std.lov.model.LovElementModel;
import com.linedata.projmng.std.lov.model.LovElementModelReference;


/**
 * @author tzammel
 */
public class LovDaoImpl extends ObjectDaoImpl<LovElementModelReference, LovElementModel> implements LovDao
{

   private static final Logger LOG    = LogFactory.getLog(LovDaoImpl.class);
   public static final String  BEANID = "LovDao";

   private String              sqlTypeCodeQuery;
   private Map<String, String> sqlListOfValueQuery;
   
   
   private EntityManager em;

   @Transactional(readOnly = true)
   public String getLovType(ExecutionContext executionContext, String lovName)
   {

      String nature = "Spec";

      String sqlSelector = getSqlTypeCodeQuery();
      LOG.debug(null, sqlSelector);

      if (sqlSelector == null)
      {
         throw new NoSuchElementException("The query find type code doesn t exist");
      }

      if (sqlSelector.trim().isEmpty())
      {
         try
         {
            throw new TechnicalException("The query namedfind type code defines an empty query");
         }
         catch (TechnicalException e)
         {
            LOG.error(null, e.getMessage());
         }
      }
      try
      {
         nature = (String) getFrameworkJdbcTemplate().queryForObject(sqlSelector, new Object[]
         { lovName }, String.class);
      }
      catch (EmptyResultDataAccessException e)
      {
         nature = "Spec";
      }
      catch (Exception e)
      {
         LOG.error(null, e.getMessage());
      }

      return nature;

   }

   public String getBeanId()
   {
      // TODO Auto-generated method stub
      return BEANID;
   }

   public List<LovElementModel> getLov(ExecutionContext executionContext, Object[] filters, String queryName) throws NoSuchElementException, TechnicalException
   {
      String sqlSelector = sqlListOfValueQuery.get(queryName);
      LOG.debug(null, sqlSelector);

      if (sqlSelector == null)
      {
         throw new NoSuchElementException("The query named " + queryName + " doesn t exist");
      }

      if (sqlSelector.trim().isEmpty())
      {
         throw new TechnicalException("The query named " + queryName + " defines an empty query");
      }

      List<LovElementModel> modelList = null;

      try
      {
         modelList = getFrameworkJdbcTemplate().query(sqlSelector, filters, this.new LovElementRowMapper());
      }
      catch (EmptyResultDataAccessException e)
      {
         modelList = null;
      }
      catch (Exception e)
      {
         LOG.error(null, e.getMessage());
      }
      return modelList;

   }

   final class LovElementResultSetExtractor implements ResultSetExtractor<LovElementModel>
   {
      public LovElementModel extractData(ResultSet resultSet) throws SQLException, DataAccessException
      {

         LovElementModel model = getBeanFactory().buildBean();
         model.setCodeType(resultSet.getString("codeType"));
         model.setDefvalFlag(resultSet.getString("defvalFlag"));
         model.setDescrip(resultSet.getString("descrip"));
         model.setHelp(resultSet.getString("help"));
         model.setShortDescrip(resultSet.getString("shortDescrip"));
         model.setStatusCode(resultSet.getString("statusCode"));
         model.setValue(resultSet.getString("value"));
         model.setValue1(resultSet.getString("value1"));
         model.setInternalValue(resultSet.getString("internalValue"));
         model.setFirstAttribute(resultSet.getString("firstAttribute"));
         model.setSecondAttribute(resultSet.getString("secondAttribute"));
         model.setThirdAttribute(resultSet.getString("thirdAttribute"));

         return model;
      }
   }

   final class LovElementRowMapper implements RowMapper<LovElementModel>
   {
      public LovElementModel mapRow(ResultSet resultSet, int row) throws SQLException
      {
         LovElementResultSetExtractor resultSetExtractor = new LovElementResultSetExtractor();
         return resultSetExtractor.extractData(resultSet);
      }
   }

   public String getSqlTypeCodeQuery()
   {
      return this.sqlTypeCodeQuery;
   }

   public void setSqlTypeCodeQuery(String sqlTypeCodeQuery)
   {
      this.sqlTypeCodeQuery = sqlTypeCodeQuery;
   }

   /**
    * @return the ekipDaoTemplate
    */

   public Map<String, String> getSqlListOfValueQuery()
   {
      return sqlListOfValueQuery;
   }

   public void setSqlListOfValueQuery(Map<String, String> sqlListOfValueQuery)
   {
      this.sqlListOfValueQuery = sqlListOfValueQuery;
   }

   @Override
   public void exec(ExecutionContext arg0, LovElementModel arg1) throws SQLException, ApiException, ParseException
   {

   }

   @Override
   public boolean testModeTrt(ExecutionMode arg0)
   {

      return false;
   }

   @Override
   public CodeTypeModel getCodeType(String lovName)
   {

      return null;
   }

   @Override
   public void execute(ExecutionContext arg0, LovElementModel arg1) throws EkipDaoException
   {
      // TODO Auto-generated method stub

   }
}
