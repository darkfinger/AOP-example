package com.dkkcorp.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectBefore {

    @Before("com.dkkcorp.aopdemo.aspect.AspectUtil.pointOne()")
    public void beforeMethod() {
        System.out.println(getClass() + "*************************************Now it the aspect working*****************************\n");
    }

    @Before("com.dkkcorp.aopdemo.aspect.AspectUtil.pointTwo()")
    public void beforeMethodTwo() {
        System.out.println(getClass() + "*************************************Now it the second aspect working*****************************\n");
    }
}
