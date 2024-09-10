package com.huajieyu.pattern.structure.flyweight;

public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println(color + "色的" + getShape());
    }
}
