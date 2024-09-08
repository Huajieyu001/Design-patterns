package com.huajieyu.pattern.creator.factory.demo03factory_method;

/**
 * 简单工厂模式
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
