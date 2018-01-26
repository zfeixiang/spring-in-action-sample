package com.example.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(** com.example.concert.Performance.perform(..))")
	public void performance() {}
	
	//@Before("excution(** com.example.concert.Performance.perform(..))") 创建 performance 方法，用 @Pointcut 注解
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("1-Silencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("1-Taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("1-CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Demanding a refund");
		}
	}
}
