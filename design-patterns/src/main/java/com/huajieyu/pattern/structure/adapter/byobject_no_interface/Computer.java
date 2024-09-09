package com.huajieyu.pattern.structure.adapter.byobject_no_interface;

public class Computer {

    String readSD(SDCardImpl sdCard) {
        return sdCard.readSD();
    }

    void writeSD(SDCardImpl sdCard) {
        sdCard.writeSD();
    }
}
