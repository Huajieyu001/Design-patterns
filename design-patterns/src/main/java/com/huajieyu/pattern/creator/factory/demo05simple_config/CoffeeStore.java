package com.huajieyu.pattern.creator.factory.demo05simple_config;

public class CoffeeStore {

    /**
     * 如果增加了新的咖啡，这个方法不需要修改
     * @param name
     * @return
     */
    public Coffee orderCoffee(String name) {
        Coffee coffee = ConfigCoffeeFactory.createCoffee(name);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
