package com.yedam.java.product.mapper;

import java.util.List;

import com.yedam.java.product.service.ProductVO;

public interface ProductMapper {
	
	
//		상품정보 조회
		public List<ProductVO> getProList();
	
//		상품정보 수정
		
//		상품등록 번호 자동 갱신
		public ProductVO getProNo();
		
//		상품정보 입력
		public int insertPro(ProductVO productVO);
		
		
//		매출정보 조회 
		public List<ProductVO> getIncome();
}
