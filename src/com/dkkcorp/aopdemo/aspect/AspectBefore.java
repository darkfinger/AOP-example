package com.dkkcorp.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectBefore {

    @Pointcut("execution(* ad*())")
    public void pointOne() {
    }

    @Before("pointOne()")
    public void beforeMethod() {
        System.out.println(getClass() + "*************************************Now it the aspect working*****************************\n");
    }
}
