package com.yedam.spring.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.spring.emp.service.EmpVO;

public interface EmpMapper {
	//전체조회
	public List<EmpVO> selectEmpAllList();
	
	//단건조회	
	public EmpVO selectEmpInfo(EmpVO empVO);
	
	//등록
	public int insertEmpInfo(EmpVO empVO);
	
	//수정
	//급여를 정해진 비율로 인상
/*	아래와 같아 매개변수값이 두개일때 받아오는 경우 구분한기위해서 
 * mybatis에서 지원하는 @Param 을 사용해서 이름을 부여한다.
 */
	public int updateEmpSal(
			@Param("employeeId")int employeeId, 
			@Param("raise")int raise);
	
	//사원정보 수정
	public int updateEmpInfo(EmpVO empVO);
	
	//삭제
	public int deleteEmpInfo(int employeeId);
}
