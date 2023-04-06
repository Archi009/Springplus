package com.yedam.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.junit.Restaurant;

//스프링 테스트 내에서 컨테이너를 생성하기 위한 어노테이션
@RunWith(SpringJUnit4ClassRunner.class)
//컨테이너의 정보를 끌고 오기 위한 어노테이션
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestClass {
	
	
//	Autowired , bean으로서 구현클래스를 사용할 때 변수를 인터페이스를 사용
//	Autowired 아래는 인터페이스
	/*@Autowired
	ApplicationContext ctx;
								*/
//	RunWith 로 컨테이너 생성을 가능하게 만들었으므로 context변수를 따로 받지 않고
//	직접적으로 받아도 된다.
	@Autowired
	Restaurant res;
	@Test
	public void beanTest() {
//		컴포넌트 등록시 이름(id)를 등록해서 이름으로 빈을 불러오거나,
//		클래스를 가져오면 된다
		/*Restaurant res = ctx.getBean(Restaurant.class);*/
		assertNotNull(res);
	}
}
