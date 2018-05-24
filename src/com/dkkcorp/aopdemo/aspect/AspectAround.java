package com.dkkcorp.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectAround {

    @Around(value = "com.dkkcorp.aopdemo.aspect.AspectUtil.pointThree()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        String met=proceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n================================  @Around >>>>>>>>>> "+ met);
        Long start=System.currentTimeMillis();
        Object result=proceedingJoinPoint.proceed();
        Long ends=System.currentTimeMillis();
        Long dur=ends-start;
        System.out.println("\n================================  @Around >>>>> Time of exec is : "+dur);
        return  result;
    }
}
