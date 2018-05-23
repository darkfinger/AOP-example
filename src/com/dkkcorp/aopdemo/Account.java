package com.dkkcorp.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String name;
    private Integer level;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Account(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public Account() {

    }
}
