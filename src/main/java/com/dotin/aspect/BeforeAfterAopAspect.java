package com.dotin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAfterAopAspect //Aspect
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @After(value = "execution(* com.dotin.aspect.business.*.*(..))")  //Pointcut
    public void after(JoinPoint joinPoint) //Advice
    {
        logger.info("After execution of {}", joinPoint);
    }

    @Before("execution(* com.dotin.aspect.business.*.*(..))")  //Pointcut
    public void before(JoinPoint joinPoint) //Advice
    {
        logger.info("Before execution of {}", joinPoint);
    }
}
