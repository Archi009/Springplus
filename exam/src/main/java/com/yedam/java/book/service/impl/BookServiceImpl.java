package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;
		


	@Override
	public List<RentVO> getRent() {
		return mapper.getRent();
	}



	@Override
	public List<BookVO> getListBook() {
		return mapper.getListBook();
	}



	@Override
	public int insertBook(BookVO bookVO) {
		return mapper.insertBook(bookVO);
	}



	@Override
	public BookVO getBookNo() {
		return mapper.getBookNo();
	}




}
