package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class LabController {
	
	@Autowired
	LabService labService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<LabListReadRS> getLabList() {

		LabListReadRS labListReadRS = new LabListReadRS();
		try {
			labListReadRS.setLabBeanList(labService.findAllActiveLab());
			labListReadRS.setStatus("SUCCESS");
		} catch (Exception e) {
			labListReadRS.setStatus("FAILURE");
			return new ResponseEntity<>(labListReadRS, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(labListReadRS, HttpStatus.OK);
	}

}
