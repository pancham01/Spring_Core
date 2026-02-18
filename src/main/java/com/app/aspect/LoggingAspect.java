package com.app.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.app.service.BankService.transferMoney(..))")
    public void beforeAdvice() {
    	
        System.out.println("Logging BEFORE transaction...");
        
    }

    @After("execution(* com.app.service.BankService.transferMoney(..))")
    public void afterAdvice() {
        System.out.println("Logging AFTER transaction...");
    }
    
    
}
