package com.huajieyu.pattern.creator.factory.demo01;

public class CoffeeStore {

    /**
     * 如果增加了新的咖啡，那这个方法就需要修改。违背了开闭原则的“对修改关闭”
     * @param name
     * @return
     */
    public Coffee orderCoffee(String name) {
        Coffee coffee = null;
        if ("American".equalsIgnoreCase(name)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equalsIgnoreCase(name)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Not found Coffee");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
