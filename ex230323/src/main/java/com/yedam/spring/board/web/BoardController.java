package com.yedam.spring.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.spring.board.service.BoardService;
import com.yedam.spring.board.service.BoardVO;

@Controller
//@RequestMapping("/board") 클래스에 requsetMapping 을 해서 경로에 대/중/소 분류를 하는 경우가 있다.
public class BoardController {
	
//	@GetMapping("/list") // -> /board/list
//	public String boardList() {
//		reutrn "board/list";
//	}
	
	@Autowired
	BoardService boardService;
	
//	전체조회 : URI - getBoardList, RETURN - board/boardList
	
	@GetMapping("getBoardList")
	public String getBoardListAll(Model model) {
		model.addAttribute("boardList", boardService.getBoardList());
		return "board/boardList";
	}
	
	
//	단건조회 : URI - getBoardInfo, RETURN - board/boardInfo
	
	@GetMapping("getBoardInfo")
	public String getBoardInfo(Model model , BoardVO boardVO) {
		model.addAttribute("boardInfo", boardService.getBoardInfo(boardVO));
		return "board/boardInfo";
	}
	
//	등록 - 페이지 요청 : URI - boardInsert, RETURN - board/boardInsert
	
	@GetMapping("boardInsert")
	public String insertBoardForm(Model model) {
//		등록번호를 화면에 뿌린 다음 다시 VO에 담아서 처리 하겠다
		model.addAttribute("boardInfo", boardService.getBoardNumber());
//		model.addAttribute("bno", boardService.getBoardNumber().getBno());
		return "board/boardInsert";
	}
	
//	등록 - 처리 : URI - boardInsert, RETURN - 전체 조회 다시 호출
	
	@PostMapping("boardInsert")
	public String boardInsertProcess(BoardVO boardVO, RedirectAttributes rrtt) {
		
//		boardVO.setBno(boardService.getBoardNumber().getBno());
//		등록 번호를 화면에서 따오지 않고 자동으로 하는 방식.
//		 boardService.insertBoardInfo(boardVO);
		
		boardService.insertBoardInfo(boardVO);
		return "redirect:getBoardList";
	}
//	redirect 할 때 불러 오는 것은 뒤에 오는 경로를 사용한 메소드의 mapping방식을 끌어오기 때문에
//	이동하고자하는 위치의 mapping방식을 Get으로 하면 좀 더 쉽게 redirect할 수 있다.(왜? 경로값이 숨겨져있진 않아서 걍 경로에 ? 붙이고 쓰면 되니까)
//	post방식을 사용하게 되면 redirect의 정의를 찾아 보고 해야한다. ppt확인.!
	
//	수정 - 페이지 : URI = boardUpdate, RETURN - board/boardUpdate
	@GetMapping("boardUpdate")
	public String updateBoardForm(BoardVO boardVO , Model model) {
		model.addAttribute("boardInfo", boardService.getBoardInfo(boardVO));
		return "board/boardUpdate";
	}
	
//	수정 - 처리 : URI - boardUpdate, RETURN - 단건조회 다시 호출
	@PostMapping("boardUpdate")
	public String boardUpdateProcess(BoardVO boardVO, RedirectAttributes rrtt) {
		
		boardService.updateBoardInfo(boardVO);
		
		return "redirect:getBoardInfo?bno="+boardVO.getBno();
	}
	
	
	
//	삭제 : URI - boardDelete, RETURN - 전체조회다시 호출
//	post방식으로 요청을 하면 request header(어떻게 요청되고 어디로 가야하고가 담긴 정보 통신과 관련된 정리에 필요한 정보)
//	와 request body(뿌려질 정보 ) 로 구성되어 요청정보를 반환한다. 받아 올 때 ResposeBody를 통해 body에 담긴 정보를 받아 오고(사용하겠다 선언)
//	매개변수에 RequestParam을 통해 필요한값을 사용 할 수 있다
	@GetMapping("boardDelete")
	
	public String boardDeleteProcess(@RequestParam int bno, RedirectAttributes rrtt) {
		
		boardService.deleteBoardInfo(bno);
		
		return "redirect:getBoardList";
	}
	
	
}
