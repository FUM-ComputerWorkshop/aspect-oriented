package com.dotin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TimeCalculationAspect //Aspect
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private long startTime;

    @Before("execution(* com.dotin.aspect.business.*.*(..))")  //Pointcut
    public void before(JoinPoint joinPoint) //Advice
    {
        startTime = System.currentTimeMillis();
        logger.info("Start of recording time for {}", getMethodAndClass(joinPoint));
    }

    @After(value = "execution(* com.dotin.aspect.business.*.*(..))")  //Pointcut
    public void after(JoinPoint joinPoint) //Advice
    {
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Execution of {} elapsed: {} ms", getMethodAndClass(joinPoint), timeTaken);
    }

    public String getMethodAndClass(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        String className = signature.getDeclaringType().getSimpleName(); // Gets the simple name of the class
        return className + "." + methodName + "()";
    }
}
