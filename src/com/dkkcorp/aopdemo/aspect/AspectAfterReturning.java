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
@Order(2)
public class AspectAfterReturning {

    @AfterReturning(value = "com.dkkcorp.aopdemo.aspect.AspectUtil.pointThree()",returning = "result")
    public void afterReturn(JoinPoint joinPoint, List<Account>  result )
    {
        String met=joinPoint.getSignature().toShortString();
        System.out.println("\n================================ @AfterReturning >>>>>>>>>> "+ met);

        for (Account a:result){
            System.out.println("\n================================ @AfterReturning >>>>> name : "+a);
        }

        result.get(0).setName("David");

    }
}
