package com.yedam.java.service;

import java.util.List;

public interface BoardService {
		
		//전체조회
		public List<BoardVO> selectAllBoardList(); 
		
		//부여될 게시글 번호 조회
		public int getBoardNo();
		
		//등록
		public int insertBoard(BoardVO boardVO);
		
		
		//게시글 조회를 기반으로 한 인기순
		
}
