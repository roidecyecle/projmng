package com.linedata.projmng.dao.api;

import java.util.List;

import com.linedata.projmng.commons.model.Subject;

public interface SubjectDao {
	
	public Subject addSubject(Subject subject, long idProduct);
	public void removeSubject(long idSubject);
	public Subject updateSubject(long idSubject);
	public Subject findSubjectById(long idSubject);
	public Subject findSubjectByLabel(String label);
	public List<Subject> findAllSubject();


}
