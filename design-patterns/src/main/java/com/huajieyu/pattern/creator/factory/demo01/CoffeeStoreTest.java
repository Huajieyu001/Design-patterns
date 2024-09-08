package com.huajieyu.pattern.creator.factory.demo01;

import org.junit.jupiter.api.Test;

public class CoffeeStoreTest {

    @Test
    public void test(){
        CoffeeStore store = new CoffeeStore();

        Coffee coffee = store.orderCoffee("american");

        coffee.getName();
    }
}
