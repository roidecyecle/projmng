package com.linedata.projmng.service.settings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.std.services.core.bean.BeanMapper;
import com.linedata.projmng.bean.chiffrage.SubjectBean;
import com.linedata.projmng.commons.model.Subject;
import com.linedata.projmng.dao.api.SubjectDao;
import com.linedata.projmng.service.api.settings.SettingSubjectService;

@Service
@Transactional(value = "transactionManager", readOnly = true)
public class SettingSubjectServiceImpl implements SettingSubjectService{

	@Autowired
	@Qualifier(value = "ChiffrageDetail")
	BeanMapper mapper;

	@Autowired
	SubjectDao subjectDao;

	@Override
	public SubjectBean addSubject(SubjectBean pb, long idProduct) {
		Subject s = mapper.map(pb, Subject.class);
		subjectDao.addSubject(s, idProduct);
		return pb;
	}

	@Override
	public void removeSubject(long idSubject) {
		subjectDao.removeSubject(idSubject);
	}

	@Override
	public SubjectBean updateSubject(SubjectBean pb) {
		Subject s = mapper.map(pb, Subject.class);
		subjectDao.updateSubject(s.getId(), s);
		return pb;
	}

	@Override
	public SubjectBean getSubject(long idSubject) {
		Subject s = subjectDao.findSubjectById(idSubject);
		SubjectBean sb = mapper.map(s, SubjectBean.class);
		return sb;
	}

	@Override
	public List<SubjectBean> getAllSubject() {
		List<SubjectBean> list = new ArrayList<SubjectBean>();
		for(Subject s: subjectDao.findAllSubject()){
			SubjectBean sb = mapper.map(s, SubjectBean.class);
			list.add(sb);
		}
		return list;
	}

	@Override
	public List<SubjectBean> getAllSubjectByLabel(String label) {
		List<SubjectBean> list = new ArrayList<SubjectBean>();
		for(Subject s: subjectDao.findSubjectByLabel(label)){
			SubjectBean sb = mapper.map(s, SubjectBean.class);
			list.add(sb);
		}
		return list;
	}

	@Override
	public List<SubjectBean> getAllSubjectByProduct(long idProduct) {
		List<SubjectBean> list = new ArrayList<SubjectBean>();
		for(Subject s: subjectDao.findSubjectByProduct(idProduct)){
			SubjectBean sb = mapper.map(s, SubjectBean.class);
			list.add(sb);
		}
		return list;
	}
	

}
