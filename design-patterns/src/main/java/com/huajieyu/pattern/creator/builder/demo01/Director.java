package com.huajieyu.pattern.creator.builder.demo01;

public class Director {

    private Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
