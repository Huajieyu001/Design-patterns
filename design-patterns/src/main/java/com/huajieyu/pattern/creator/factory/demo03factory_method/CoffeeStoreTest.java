package com.huajieyu.pattern.creator.factory.demo03factory_method;

import org.junit.jupiter.api.Test;

public class CoffeeStoreTest {

    @Test
    public void test(){
        CoffeeStore store = new CoffeeStore();
        store.setFactory(new AmericanCoffeeFactory());
        store.setFactory(new LatteCoffeeFactory());
        store.setFactory(new AmericanCoffeeFactory());

        Coffee coffee = store.orderCoffee();

        coffee.getName();
    }
}
