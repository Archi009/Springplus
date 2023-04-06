package com.yedam.java.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Controller
public class ProductController {

	@Autowired
	ProductService pros;
	
	@GetMapping("getProList")
	public String getProList(Model model) {
		model.addAttribute("pro", pros.getListpro());
		return "product/productList";				
	}
	
	@GetMapping("insertPro")
	public String insertProNo(Model model) {
		model.addAttribute("proNo", pros.getProNo());
		return "product/productInsert";
	}
	@PostMapping("insertPro")
	public String insertPro(ProductVO productVO, RedirectAttributes rrtt) {
		pros.insertPro(productVO);
		return "redirect:getProList";
	}
	
}
