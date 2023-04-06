package com.yedam.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.boot.emp.service.EmpService;
import com.yedam.boot.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	
	@RequestMapping(value="empList", method=RequestMethod.GET)
	public String empAllList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return"empList";
	}
	
	@RequestMapping(value="empInfo", method=RequestMethod.GET)
	public String empGetInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmpInfo(empVO));
		return "empInfo";
	}
	
	@GetMapping("empInsert")
	public String empInsertForm(Model model) {
		model.addAttribute("empVO",new EmpVO());
		return "empInsert";
	}
	
	@PostMapping("empInsert")
	public String empInsertyProcess(EmpVO empVO) {
		empService.InsertEmpInfo(empVO);
		return "redirect:empList";
	}
}
