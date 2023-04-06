package com.yedam.java.product.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ProductVO {
	private int productId;
	private String productName;
	private int productPrice;
	private String productInfo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date productDate;
	private String company;
	private String managerId;
}
