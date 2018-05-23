package com.dkkcorp.aopdemo.aspect;

import com.dkkcorp.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class AspectBefore {


    @Before("com.dkkcorp.aopdemo.aspect.AspectUtil.pointOne()")
    public void beforeMethod() {
        System.out.println(getClass() + "************************************* @Before Now it the aspect working*****************************\n");
    }

    @Before("com.dkkcorp.aopdemo.aspect.AspectUtil.pointTwo()")
    public void beforeMethodTwo() {
        System.out.println(getClass() + "************************************* @Before Now it the second aspect working*****************************\n");
    }
}
