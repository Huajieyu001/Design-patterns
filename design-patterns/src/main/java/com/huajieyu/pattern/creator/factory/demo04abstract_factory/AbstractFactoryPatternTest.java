package com.huajieyu.pattern.creator.factory.demo04abstract_factory;

import org.junit.jupiter.api.Test;

public class AbstractFactoryPatternTest {

    @Test
    public void test(){
        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
