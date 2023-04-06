package com.yedam.spring.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String jobId;
	private Date hireDate;
	private double salary;
	private double commissionPct;
	private int employeeId;
	private int	managerId;	
	private int departmentId;
	
}
