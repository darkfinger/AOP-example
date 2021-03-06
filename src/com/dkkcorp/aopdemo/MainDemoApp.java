package com.dkkcorp.aopdemo;

import com.dkkcorp.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call the business method
        theAccountDAO.addAccount();

        // do it again!
        System.out.println("\nlet's call it again!\n");

        // call the business method again
        theAccountDAO.addben();

        //find4
        List<Account> list=theAccountDAO.findAccount();
        System.out.println("\n============================================>>>>>>> new "+list.get(0).toString());

        // close the context
        context.close();
    }

}