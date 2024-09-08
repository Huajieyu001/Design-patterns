package com.huajieyu.pattern.creator.factory.demo02simple;

/**
 * 简单工厂模式
 */
public class SimpleCoffeeFactory {

    /**
     * 违背了开闭原则的“对修改关闭”，但是比之前修改具体代码要更便捷
     * @param name
     * @return
     */
    public static Coffee createCoffee(String name){
        Coffee coffee = null;
        if ("American".equalsIgnoreCase(name)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equalsIgnoreCase(name)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Not found Coffee");
        }
        return coffee;
    }
}
