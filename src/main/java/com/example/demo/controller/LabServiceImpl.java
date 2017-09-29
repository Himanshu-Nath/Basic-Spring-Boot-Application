package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LabServiceImpl implements LabService{
	
	@Autowired
	LabRepository labRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public List<LabBean> findAllActiveLab() throws Exception {
		List<Lab> labList = null;
		List<LabBean> labBeanList = new ArrayList<LabBean>();
		
		labList = labRepository.findAllActiveLab();
		if(labList != null){
			for(Lab Lab : labList) {
				LabBean labBean = new LabBean();
				labBean.setId(Lab.getId());
				labBean.setActiveInd(Lab.getActiveInd());
				labBean.setLabName(Lab.getLabName());
				labBean.setLabDesc(Lab.getLabDesc());
				labBean.setLabSrcId(Lab.getLabSrcId());
				labBeanList.add(labBean);
			}
		}
		return labBeanList;
	}
}
