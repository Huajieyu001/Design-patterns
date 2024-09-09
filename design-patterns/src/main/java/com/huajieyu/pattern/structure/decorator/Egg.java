package com.huajieyu.pattern.structure.decorator;

public class Egg extends Garnish{

    public Egg(Food food){
        super(food, 2, "加了蛋");
    }

    public float cost(){
        return getPrice() + getFood().cost();
    }

    public String getDesc(){
        return super.getDesc() + getFood().getDesc();
    }
}