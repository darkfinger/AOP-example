package com.dkkcorp.aopdemo.aspect;

import com.dkkcorp.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class AspectAfterThrow {

    @AfterThrowing(value = "com.dkkcorp.aopdemo.aspect.AspectUtil.pointThree()",throwing = "result")
    public void afterReturn(JoinPoint joinPoint, Throwable  result )
    {
        String met=joinPoint.getSignature().toShortString();
        System.out.println("\n================================ @AfterThrowing >>>>>>>>>> "+ met);
        System.out.println("\n================================ @AfterThrowing>>>>> Exception : "+result);
    }
}
