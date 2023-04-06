package com.yedam.java.product.service;

import java.util.List;

public interface ProductService {
	
	//상품조회
	public List<ProductVO> getListpro();
	//등록 번호
	public ProductVO getProNo();
	//등록
	public int insertPro(ProductVO productVO);
	
}
