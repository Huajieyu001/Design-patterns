package com.huajieyu.pattern.creator.prototype;

public class Example implements Cloneable{

    public Example() {
        System.out.println("Example invoked");
    }

    @Override
    public Example clone() throws CloneNotSupportedException {
        return (Example) super.clone();
    }
}
