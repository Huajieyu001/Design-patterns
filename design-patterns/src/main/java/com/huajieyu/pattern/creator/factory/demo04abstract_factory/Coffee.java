package com.huajieyu.pattern.creator.factory.demo04abstract_factory;

public abstract class Coffee {

    public void addMilk() {
        System.out.println("addMilk");
    }

    public void addSugar() {
        System.out.println("addSugar");
    }

    public abstract String getName();
}
