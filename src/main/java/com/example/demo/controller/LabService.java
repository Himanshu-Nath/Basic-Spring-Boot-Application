package com.example.demo.controller;

import java.util.List;

public interface LabService {

	public List<LabBean> findAllActiveLab() throws Exception;
	
	public List<LabBean> getCourseLabList() throws Exception;
}
