package com.yedam.spring.board.mapper;

import java.util.List;

import com.yedam.spring.board.service.BoardVO;

public interface BoardMapper {

//	전체조회
	public List<BoardVO> selectBoardList();
//	상세
	public BoardVO selectBoardInfo(BoardVO boardVO);
//	등록하고자 하는 글 번호
	public BoardVO getBoardNo();
//	글작성
	public int insertBoard(BoardVO boardVO);
//	수정
	public int updateBoard(BoardVO boardVO);
//	삭제
	public int deleteBoard(int boardNo);
	
}
