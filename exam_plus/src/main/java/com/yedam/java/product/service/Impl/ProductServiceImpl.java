package com.yedam.java.product.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper pro;
	
	@Override
	public List<ProductVO> getListpro() {
		return pro.getProList();
	}

	@Override
	public ProductVO getProNo() {
		
		return pro.getProNo();
	}

	@Override
	public int insertPro(ProductVO productVO) {
		int result = pro.insertPro(productVO);
		
		if(result ==1) {
			return productVO.getProductId();
		}else {
			return -1;
		}
	}



}
