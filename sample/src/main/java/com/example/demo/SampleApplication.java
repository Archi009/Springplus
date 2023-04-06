package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//↓실질적으로 프로그램을 실행했을때 여러가지 작업을함 
@SpringBootApplication
public class SampleApplication {
//	부트를 실행하는 주체
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
