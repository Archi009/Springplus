package com.yedam.spring.emp.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.yedam.spring.user.UserVO;

import lombok.Data;

@Data
public class UserListVO {

	private List<UserVO> list;
	
	
	
}
