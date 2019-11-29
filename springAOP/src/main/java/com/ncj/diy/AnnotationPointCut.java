package com.ncj.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationPointCut {
    @Before("execution(* com.ncj.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前(注解实现)");
    }
    @After("execution(* com.ncj.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后(注解实现)");
    }
    @Around("execution(* com.ncj.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
