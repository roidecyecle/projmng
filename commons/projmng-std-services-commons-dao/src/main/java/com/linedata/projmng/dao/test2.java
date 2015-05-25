package com.linedata.projmng.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linedata.ekip.std.services.core.exception.EkipServiceException;
import com.linedata.projmng.commons.model.Abacus;
import com.linedata.projmng.commons.model.ActionType;
import com.linedata.projmng.commons.model.Author;
import com.linedata.projmng.commons.model.Complexity;
import com.linedata.projmng.commons.model.Component;
import com.linedata.projmng.commons.model.Estimation;
import com.linedata.projmng.commons.model.Product;
import com.linedata.projmng.commons.model.Status;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.commons.model.UnitOfWork;
import com.linedata.projmng.dao.api.AbacusDao;
import com.linedata.projmng.dao.api.ActionTypeDao;
import com.linedata.projmng.dao.api.AuthorDao;
import com.linedata.projmng.dao.api.ComplexityDao;
import com.linedata.projmng.dao.api.ComponentDao;
import com.linedata.projmng.dao.api.EstimationDao;
import com.linedata.projmng.dao.api.ProductDao;
import com.linedata.projmng.dao.api.SubjectDao;
import com.linedata.projmng.dao.api.UnitOfWorkDao;

public class test2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/spring.xml");

		ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		SubjectDao subjectDao = (SubjectDao) ctx.getBean("subjectdao");
		AuthorDao authorDao = (AuthorDao) ctx.getBean("authordao");
		EstimationDao estimationDao = (EstimationDao) ctx
				.getBean("estimationdao");
		UnitOfWorkDao unitOfWorkDao = (UnitOfWorkDao) ctx
				.getBean("unitofworkdao");
		ComponentDao componentDao = (ComponentDao) ctx.getBean("componentdao");
		ComplexityDao complexityDao = (ComplexityDao) ctx
				.getBean("complexitydao");
		AbacusDao abacusDao = (AbacusDao) ctx.getBean("abacusdao");
		ActionTypeDao actionTypeDao = (ActionTypeDao) ctx
				.getBean("actiontypedao");

	

		
		
		
		
	

	
	}
}
