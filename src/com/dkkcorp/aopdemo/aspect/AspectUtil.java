package com.dkkcorp.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectUtil {

    @Pointcut("execution(* addAccount())")
    public void pointOne() {
    }


    @Pointcut("execution(* addben())")
    public void pointTwo() {
    }

    @Pointcut("execution(* set*())")
    public void setter() {
    }
}
