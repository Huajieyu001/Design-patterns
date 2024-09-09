package com.huajieyu.pattern.structure.decorator;

public class Bacon extends Garnish{

    public Bacon(Food food){
        super(food, 3, "加了培根");
    }

    public float cost(){
        return getPrice() + getFood().cost();
    }

    public String getDesc(){
        return super.getDesc() + getFood().getDesc();
    }
}
