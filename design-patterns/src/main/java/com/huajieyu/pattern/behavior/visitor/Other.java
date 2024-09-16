package com.huajieyu.pattern.behavior.visitor;

public class Other implements Person{

    @Override
    public void feed(Cat cat) {
        System.out.println("别人喂养了" + cat);
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("别人喂养了" + dog);
    }
}