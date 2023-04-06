package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("getListBook")
	public String getBookList(Model model) {
		model.addAttribute("bookList", service.getListBook());
//		System.out.println(service.getListBook());
		return "books/bookList";
	}
	@GetMapping("insertBook")
	public String insertBook(Model model) {
		model.addAttribute("book",service.getBookNo());
		return "books/bookInsert";
	}
	@PostMapping("insertBook")
	public String insertBookPorcess(BookVO bookVO,RedirectAttributes rrtt) {
		service.insertBook(bookVO);
		return "redirect:getListBook";
	}
	
	@GetMapping("getRent")
	public String getRentList(Model model) {
		model.addAttribute("rentList", service.getRent());
		return "books/RentList";
	}
}
