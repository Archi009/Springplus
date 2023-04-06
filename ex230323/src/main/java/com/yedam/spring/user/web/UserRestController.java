package com.yedam.spring.user.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yedam.spring.emp.service.UserListVO;
import com.yedam.spring.user.UserVO;


@CrossOrigin  //혹시 몰라서 붙여놓음, 이거 뭔지 모름 cors에러
@RestController //데이터를 반환하는 컨트롤러  //@Contller +@ResponseBody를 의미함, => 해당 클래스 내의 모든 컨트롤러는 객체를 반환
public class UserRestController {
//	                  경로                  방식
	@RequestMapping(value="/insertUser", method=RequestMethod.POST)
	public UserVO insertUser(UserVO userVO) {
		
		System.out.println("name : "+ userVO.getName());
//		System.out.println("country : "+ userVO.getCountry());
		System.out.println("age : "+ userVO.getAge());
		System.out.println("date : "+ userVO.getToday());
		
		return userVO;
	}
	
	
	@RequestMapping("/insertUsers")
	public List<UserVO> insertUserList(UserListVO userListVO){
		
//		데이터 넘길때 list[i].value의 name
		for(UserVO user : userListVO.getList()) {
			System.out.println(user);
		}
		
		return userListVO.getList();
	}
	
	
	@RequestMapping("/getUserData")
	public UserVO getUserData	(@RequestParam("id") String name,
								@RequestParam( required = false) Integer age) {
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setAge(age);
//		userVO.setAge(age == null ? 0 : age);
		
		
		return userVO;
	}
	
	
	@GetMapping("/getDataList")
	public String getDataList(@RequestParam Map<String, Object> map) {
		String message = null;
//		부메랑에서는 인코딩이 안돼서 깨짐
		if(map.isEmpty()) {
			message = "데이터가 존재하지 않습니다.";
					
		}else {
			message = "데이터가 생성되었습니다.";
			
			Set<Map.Entry<String,Object>> entryList = map.entrySet();
			for(Map.Entry<String, Object>entry : entryList) {
				System.out.print("Key : " + entry.getKey());
				System.out.println(", Value : " + entry.getValue());
			}
		}
		return message;
	}
	
//	name=?&name=?&name=?...
	@RequestMapping("/getNames")
	public Map<String,Object> getNames(@RequestParam List<String>name){
		Map<String,Object> map = new HashMap<>();
		map.put("result", "success");
		map.put("data",name);
		
		return map;
	}
	
//	@PathVariable
	@RequestMapping("/getEmpInfo/{employeeId}")
	public UserVO getEmpInfo(@PathVariable String employeeId) {
		UserVO userVO = new UserVO();
		userVO.setName(employeeId);
		return userVO;
	}
	
//	RequestBody
	@RequestMapping("/getInfo")
	public UserVO getInfo(@RequestBody UserVO userVO) {
		
		return userVO;
	}
	
//	문제있음
	@PostMapping("/upload")
	public String uploadFil(@RequestPart MultipartFile[] pic) {
//		System.out.println(userVO);
//		System.out.println("name : " + userVO.getName());
//		System.out.println("file : "+ userVO.getPic().getOriginalFilename());
		System.out.println(pic[0].getOriginalFilename());
		return "Upload Complete";
	}
	
	
	
	
}
