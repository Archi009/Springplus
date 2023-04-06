package com.yedam.spring.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.spring.tx.mapper.AaaMapper;

@Service
public class AaaServiceImpl implements AaaService {

	@Autowired
	AaaMapper aaaMapper;
	
	@Transactional
	@Override
	public void insert() {
		aaaMapper.insert("101");
		aaaMapper.insert("799");
	}

//	mybatis는 트랜잭션을 하나씩 발생시킨다. 하나를 진행하고 커밋한 다음 다음 트랜잭션에서 오류가 난다.
//	그래서 값이 하나 입력되고 하나는 이력이 안되는 상황이 발생해 무결성이 저해되는데, 이를 방지하여 두가지 트랜잭션을 한 꺼번에 진행시키기 위해 AOP transactional을 사용한다.
	
}
