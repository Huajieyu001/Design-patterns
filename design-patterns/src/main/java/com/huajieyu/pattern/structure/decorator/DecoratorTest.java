package com.huajieyu.pattern.structure.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void test(){
        Food food = new Noodles();
        food.setDesc("这是面");
        food = new Bacon(food);

        System.out.println(food.cost());
        System.out.println(food.getDesc());

        System.out.println("-----------------------");
        food = new Bacon(food);
        food = new Bacon(food);
        food = new Egg(food);
        System.out.println(food.cost());
        System.out.println(food.getDesc());
    }
}
