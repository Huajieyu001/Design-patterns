package com.huajieyu.pricinples.demo4.interfaceIsolation.before;

public class MySafetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("antiTheft");
    }

    @Override
    public void fireproof() {
        System.out.println("fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("waterproof");
    }
}
