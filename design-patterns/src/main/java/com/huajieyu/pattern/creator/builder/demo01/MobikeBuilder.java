package com.huajieyu.pattern.creator.builder.demo01;

import java.io.Serializable;

public class MobikeBuilder extends Builder {

    @Override
    public void builderFrame() {
        bike.setFrame("mobike frame");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("mobike seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
