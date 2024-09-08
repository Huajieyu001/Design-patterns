package com.huajieyu.pattern.creator.factory.demo03factory_method;

/**
 * 工厂方法模式
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
