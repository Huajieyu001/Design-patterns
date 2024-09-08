package com.huajieyu.pattern.creator.factory.demo03factory_method;

public class CoffeeStore {

    private CoffeeFactory factory;


    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     *  工厂方法模式，成功避免了与具体Coffee耦合
     * @return
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
