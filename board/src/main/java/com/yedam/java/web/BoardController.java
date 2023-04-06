package com.yedam.java.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.service.BoardService;
import com.yedam.java.service.BoardVO;

@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	//전체조회
	@GetMapping("list")
	public String boardList(Model model) {
		model.addAttribute("boardList",boardService.selectAllBoardList());
		return "board/list";
	}
	
	
	//등록 - 페이지 
	@GetMapping("insert")
	public String boardInsertForm(Model model) {
		model.addAttribute("boardNo", boardService.getBoardNo());
		return "board/insert";
	}
	
	//등록 - 처리
	@PostMapping("insert")
	public String boardInsertProcess(BoardVO boardVO) {
		boardService.insertBoard(boardVO);
		return "redirect:list";
	}
	
	//인기 현황 조회 
	
	
	
	
}
