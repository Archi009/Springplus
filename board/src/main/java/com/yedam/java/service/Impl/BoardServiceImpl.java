package com.yedam.java.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.mapper.BoardMapper;
import com.yedam.java.service.BoardService;
import com.yedam.java.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> selectAllBoardList() {
		return boardMapper.selectAllBoardList();
	}

	@Override
	public int getBoardNo() {
		return boardMapper.getBoardNo();
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		return boardMapper.insertBoard(boardVO);
	}

}
