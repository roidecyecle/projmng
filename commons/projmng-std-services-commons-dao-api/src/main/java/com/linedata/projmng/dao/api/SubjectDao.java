package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Subject;

public interface SubjectDao {
	
	public Subject addSubject(Subject subject, long idProduct);
	public void removeSubject(long idSubject);
	public Subject updateSubject(long idSubject, Subject subject);
	
	public Subject findSubjectById(long idSubject);
	public List<Subject> findSubjectByLabel(String label);
	public List<Subject> findSubjectByProduct(long idProduct);
	public List<Subject> findAllSubject();


}
