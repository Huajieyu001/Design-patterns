package com.huajieyu.pattern.structure.decorator;

public class Noodles extends Food{

    public Noodles(){
        super(15, "这是一碗面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
