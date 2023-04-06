package com.yedam.spring.tx.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	
	//포인트컷 설정 : 비즈니스 로직과 관련된 메소드 중에서 Advice(공통 코드)가 적용될 메소드
	@Pointcut("within(com.yedam.spring.tx.service.*)")
	public void allPointCut() {};
	
	//실행을 요청 했을때 pointcut에 해당되는 정보가 joinpoint에 담기고 순차적으로 실행 된다.
//	그 다음 실제 우리가 실행하려고 하는 핵심관심을 실행한다.(obj에 담아서)
	//weaving : 포인트 컷 + Advice + 타이밍
	@Around("allPointCut()")
	public Object logger(ProceedingJoinPoint joinpoint) throws Throwable {
//		AOP가 적용되는 메서드의 이름
		String signtuerStr = joinpoint.getSignature().toString();
		System.out.println("시작 : "+signtuerStr);
		
//		공통기능
		System.out.println("핵심 기능 전 실행 - 공통 기능 : " + System.currentTimeMillis());
//		proceed : 실제로 받은 프로시져 실행
//		object에 담는것은 실행되는 메소드가 어떤것인지 몰라서 포괄적으로 사용 하려는 것
		try {
			Object obj = joinpoint.proceed();
			return obj;
		}finally {
			System.out.println("핵심 기능 전 실행 - 공통 기능 : " + System.currentTimeMillis());
			System.out.println("끝 : "+signtuerStr);
		}
		
		
	}
	
}
