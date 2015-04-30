package com.linedata.projmng.dao;


import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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



public abstract class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		SubjectDao subjectDao = (SubjectDao) ctx.getBean("subjectdao");
		AuthorDao authorDao = (AuthorDao) ctx.getBean("authordao");
		EstimationDao estimationDao = (EstimationDao) ctx.getBean("estimationdao");
		UnitOfWorkDao unitOfWorkDao = (UnitOfWorkDao) ctx.getBean("unitofworkdao");
		ComponentDao componentDao = (ComponentDao) ctx.getBean("componentdao");
		ComplexityDao complexityDao = (ComplexityDao) ctx.getBean("complexitydao");
		AbacusDao abacusDao = (AbacusDao) ctx.getBean("abacusdao");
		ActionTypeDao actionTypeDao = (ActionTypeDao) ctx.getBean("actiontypedao");
		

		Product p = new Product();
		p.setLabel("EKIP V7");
		productDao.addProduct(p);
		
		Subject s = new Subject("Test unitaire", "1.2", Calendar.getInstance().getTime(), "1.0");
		subjectDao.addSubject(s,p.getId());
		
		Author a = new Author();
		a.setName("Raed");
		a.setFunction("Directeur de pole");
		authorDao.addAuthor(a);
		
		
		UnitOfWork unit1 = new UnitOfWork("unite 1", 1);
		UnitOfWork unit2 = new UnitOfWork("unite 2", 5);
		UnitOfWork unit3 = new UnitOfWork("unite 3", 5.5F);
		UnitOfWork unit4 = new UnitOfWork("unite 4", 7);
	
		Estimation est1 = new Estimation(Calendar.getInstance().getTime(),"DOCUMENT 1",Status.CREATE);
		Estimation est2 = new Estimation(Calendar.getInstance().getTime(),"DOCUMENT 2",Status.UPDATE);
		
		estimationDao.addEstimation(est1, a.getId(), s.getId());
		estimationDao.addEstimation(est2, a.getId(), s.getId());
		
		Component comp = new Component("Block");
		componentDao.addComponent(comp);
		Component comp2 = new Component("Screen");
		componentDao.addComponent(comp2);
		
		Complexity comx = new Complexity("facile");
		complexityDao.addComplexity(comx);
		
		ActionType action = new ActionType("Creation", 5);
		actionTypeDao.addActionType(action);
		
		ActionType action1 = new ActionType("Modification", 15);
		actionTypeDao.addActionType(action1);
		
		Abacus abac = new Abacus(5.2F);
		Abacus abac2 = new Abacus(10);
		
		abacusDao.addElement(abac, comp.getId(), comx.getId());
		abacusDao.addElement(abac2, comp2.getId(), comx.getId());
		
		unitOfWorkDao.addUniOfWork(unit1, est1.getId(),action.getId(),abac.getIdAbacus());
		unitOfWorkDao.addUniOfWork(unit2, est2.getId(),action.getId(),abac.getIdAbacus());
		unitOfWorkDao.addUniOfWork(unit3, est1.getId(),action.getId(),abac.getIdAbacus());	
		unitOfWorkDao.addUniOfWork(unit4, est1.getId(),action.getId(),abac.getIdAbacus());
		
		
		ArrayList<UnitOfWork> list = (ArrayList<UnitOfWork>) estimationDao.getAllUnits(est2.getId());
		ArrayList<Estimation> list2 = (ArrayList<Estimation>) estimationDao.getAllEstimationByLabel("");
		
		for(int i=0; i<=list.size();i++){
			System.out.println(list2.get(i).getlabel());
		}
		
		System.out.println(estimationDao.getEstimation(est2.getId()).getUnitsOfWork().size());
		

		Author a1 = new Author();
		a1.setName("Bassem");
		a1.setFunction("Chef de projet");
		authorDao.addAuthor(a1);
		
		est1.setAuthor(a1);
		est1.setLibelle("EPIC 2");
		estimationDao.updateEstimation(est1);
		
		
		unitOfWorkDao.updateUnitOfWork(unit1, action1.getId(), abac.getIdAbacus());
		
		UnitOfWork unit = unitOfWorkDao.getUnitOfWorkDetail(unit1.getId());
		
		System.out.println("unite est "+unit.getLabel());
		
		unitOfWorkDao.deleteUnitOfWork(unit2.getId());
		
		
		
		System.out.println("Abaque est "+abacusDao.getAbacusElements(abac2.getIdAbacus()).getConplexity().getLabel());

		abacusDao.removeElement(abac2.getIdAbacus());
		
	}

}
