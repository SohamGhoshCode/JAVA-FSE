package com.cognizant.springlearn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.cognizant.springlearn.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        LOGGER.info("Before method: {}", joinPoint.getSignature().getName());
    }

    @After("execution(* com.cognizant.springlearn.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        LOGGER.info("After method: {}", joinPoint.getSignature().getName());
    }

    @Around("execution(* com.cognizant.springlearn.service.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("Around before method: {}", joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        LOGGER.info("Around after method: {}", joinPoint.getSignature().getName());
        return result;
    }
}
