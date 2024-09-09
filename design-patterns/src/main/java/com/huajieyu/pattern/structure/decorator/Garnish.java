package com.huajieyu.pattern.structure.decorator;

public abstract class Garnish extends Food{

    private Food food;

    public Garnish(Food food, float price, String desc){
        super(price, desc);
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
