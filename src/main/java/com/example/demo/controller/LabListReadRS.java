package com.example.demo.controller;

import java.util.List;

public class LabListReadRS extends BaseResponse{
	private List<LabBean> labBeanList;

	/**
	 * @return the labBeanList
	 */
	public List<LabBean> getLabBeanList() {
		return labBeanList;
	}

	/**
	 * @param labBeanList the labBeanList to set
	 */
	public void setLabBeanList(List<LabBean> labBeanList) {
		this.labBeanList = labBeanList;
	}
	
}
