package com.huajieyu.pattern.creator.builder.demo01;

public class OfoBuilder extends Builder {

    @Override
    public void builderFrame() {
        bike.setFrame("ofo frame");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("ofo seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
