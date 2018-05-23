package com.dkkcorp.aopdemo.dao;

import com.dkkcorp.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    public List<Account> findAccount(){
        List<Account> list=new ArrayList<>();
        Account account=new Account("Checking",1);
        Account account1=new Account("Saving",3);
        list.add(account);
        list.add(account1);
        return list;
    }

    public void addAccount(){
        System.out.println(getClass()+"***************************************ADD ACCOUNT IN DAO");
    }

    public void addben(){
        System.out.println(getClass()+"***************************************ADD BENEFIT IN DAO");
    }
}
