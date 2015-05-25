package com.linedata.projmng.service.api.settings;

import java.util.List;

import com.linedata.projmng.bean.chiffrage.SubjectBean;


public interface SettingSubjectService {
	
	public SubjectBean addSubject(SubjectBean pb, long idProduct);
	public void removeSubject(long  idSubject);
	public SubjectBean updateSubject(SubjectBean pb);
	
	
	public SubjectBean getSubject(long idSubject);
	public List<SubjectBean> getAllSubject();
	public List<SubjectBean> getAllSubjectByLabel(String label);
	public List<SubjectBean> getAllSubjectByProduct(long idProduct);
	
}
