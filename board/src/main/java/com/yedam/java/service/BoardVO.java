package com.yedam.java.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardImage;
	//java.util.Date -> setter 사용시 'yyyy/MM/dd'
	//html 의 input 태그 -> type : date 사용시 'yyyy-MM-dd'
	//스프링에서 지원하는 DateTimeFormat 을 미스매치 해결을위한 방법으로 사용
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date boardDate;
}
