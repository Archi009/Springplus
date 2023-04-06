package com.yedam.spring.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserVO {
	private String name;
//	private String country;
	private Integer age;
//	입력시 / 로 입력해야! 왜냐? 국가마다 날짜 타입을 처리하는 형식이 다르기 때문
//	이런 불편을 해결하기 위해 Spring에서 지원하는 어노테이션이 있다. 입력받을때의 형식을 입력해준다.
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date today;
	
	private MultipartFile[] pic;
}
