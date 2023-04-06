package com.yedam.boot.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String jobId;
//	VO에 setter를 이용할 때 아래 형태로 넣어야 한다는 것
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date hireDate;
	private double salary;
	private double commissionPct;
	private int employeeId;
	private int	managerId;	
	private int departmentId;
	
}
