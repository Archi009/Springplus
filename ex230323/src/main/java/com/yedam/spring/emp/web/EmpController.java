package com.yedam.spring.emp.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.spring.emp.service.EmpService;
import com.yedam.spring.emp.service.EmpVO;

//페이지 반환할거
@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
//	통상적인 방식의 규칙! 
//	조회(데이터, 일반페이지) -> GET
//	등록, 수정, 삭제 -> POST
	
//	전체조회
	@GetMapping("/empList")
	public String getEmpAllList(Model model) {
		model.addAttribute("empList",empService.getEmpAll());
		return "emp/empList";
	}
	
	
//	단건조회
	@GetMapping("/empInfo")
	public String getEmpInfo(EmpVO empVO, Model model) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	
//	같은 경로라도 Get이냐 Post냐에 따라서 인식을 달리 한다.
//	등록 - Form
	@GetMapping("/empInsert")
	public String empInsertForm() {
		return "emp/empInsert";
	}

//	등록 - Process
	@PostMapping("/empInsert")
	public String empInsertProcess(EmpVO empVO, RedirectAttributes rrtt) {
		int empId = empService.insertEmp(empVO);
		String result = null;
		if(empId == -1 ) {
			result = "정상적으로 등록되지 않았습니다.";
		}else {			
			result = "정상적으로 등록되었습니다." 
					+ "\n등록된 사원의 사번은 " +empId +"입니다.";
		}
		
		rrtt.addFlashAttribute("result",result);
		
//		model을 사용하고 redirect를 하면 자료 손실이 일어나 수 있다
//		model.addAttribute("result",result);
//		자료를 삽입 하면 전체 조회를 해서 자료가 삽입됐는가 확인하는과정이 있다 따라서 controller가 필요하다
//		redirect ->  Controller요청
		return "redirect:empList";
	}
	
//	수정 json으로 받아볼거야!=>비동기식으로 만들어보겠다
//	1) Client - JSON -> Server
//	2) Server - JSON -> Client
	@PostMapping("/empUpdate")
	@ResponseBody
	public Map<String,String> empUpdateProcess(@RequestBody EmpVO empVO) {
		return empService.updateEmp(empVO);
	}	
	
	@PostMapping("/empDelete")	
	@ResponseBody
	public String empDeleteProcess(@RequestParam int employeeId) {
		 Map<String,String> map = empService.deleteEmp(employeeId);
		return map.get("결과");
	}
	
	
	
	
}
