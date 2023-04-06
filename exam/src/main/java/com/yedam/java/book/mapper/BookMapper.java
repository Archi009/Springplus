package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;

public interface BookMapper {
	public List<BookVO> getListBook();
	public int insertBook(BookVO bookVO);
	public List<RentVO> getRent();
	public BookVO getBookNo ();
}
