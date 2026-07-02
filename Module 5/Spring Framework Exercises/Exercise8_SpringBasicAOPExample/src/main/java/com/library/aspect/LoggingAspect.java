package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void beforeAdvice() {
        System.out.println("LoggingAspect: Before method execution.");
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void afterAdvice() {
        System.out.println("LoggingAspect: After method execution.");
    }
}
