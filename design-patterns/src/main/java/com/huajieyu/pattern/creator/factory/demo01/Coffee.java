package com.huajieyu.pattern.creator.factory.demo01;

public abstract class Coffee {

    public void addMilk() {
        System.out.println("addMilk");
    }

    public void addSugar() {
        System.out.println("addSugar");
    }

    public abstract void getName();
}
