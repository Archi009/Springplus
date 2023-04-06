package com.yedam.java.book.service;

import java.util.List;


public interface BookService {
	public List<BookVO> getListBook();
	public int insertBook(BookVO bookVO);
	public List<RentVO> getRent();
	public BookVO getBookNo();
}
