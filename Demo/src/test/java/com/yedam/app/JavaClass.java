package com.yedam.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.yedam.app.java.SamsungTV;
import com.yedam.app.java.TV;

public class JavaClass {
//	스프링과 상관없이 junit 테스트 해봄
	@Test
	public void method() {
		System.out.println("단순 테스트");
	}
	
	@Test
	public void javaTest() {
		TV tv = new SamsungTV();
		assertNotNull(tv);
	}
}
