package com.dkkcorp.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectAfter {

    @After(value = "com.dkkcorp.aopdemo.aspect.AspectUtil.pointThree()")
    public void afterReturn(JoinPoint joinPoint)
    {
        String met=joinPoint.getSignature().toShortString();
        System.out.println("\n================================  @After >>>>>>>>>> "+ met);
        System.out.println("\n================================  @After >>>>> Finally execution ");
    }
}
