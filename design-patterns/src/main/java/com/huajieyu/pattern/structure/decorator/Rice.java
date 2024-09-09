package com.huajieyu.pattern.structure.decorator;

public class Rice extends Food{

    public Rice(){
        super(10, "这是一份饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
