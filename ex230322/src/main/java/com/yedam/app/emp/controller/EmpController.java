package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
//	스프링은 컨트롤러를 기능별로 세분화 한다.
	
	@Autowired
	EmpService EmpService;
	
//	getEmpInfo?employee_id=xxxxx
	@RequestMapping("/getEmpInfo")
	@ResponseBody
	public EmpVO getEmpInfo(EmpVO empVO) {
		return EmpService.getEmpInfo(empVO);
	}
	
}
