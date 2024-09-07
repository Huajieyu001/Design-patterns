package com.huajieyu.pricinples.demo4.interfaceIsolation.after;

public class MySafetyDoor implements AntiTheft, Fireproof, Waterproof {
    @Override
    public void antiTheft() {
        System.out.println("after antiTheft");
    }

    @Override
    public void fireproof() {
        System.out.println("after fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("after waterproof");
    }
}
