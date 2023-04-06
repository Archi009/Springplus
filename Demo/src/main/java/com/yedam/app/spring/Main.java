package com.yedam.app.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		xml 방식으로 받아와야해서 GenricXmlApplicationContext사용
//		다른 클래스 생성하고 xml에서 주소값만 입력해주면 
//		main을 따로 수정 하지 않고 연결대상을 바꿔 이용 가능. 
//		연결 대상을 바꾸면 파일에 붙은 S글자의 위치도 바뀐다(빈으로 등록된 파일에는 S가 붙는다)
		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:applicationContext.xml"); 
	
		TV tv = (TV) ctx.getBean("tv");
		tv.on();
	}
}
