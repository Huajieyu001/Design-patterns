package com.huajieyu.pattern.structure.adapter.byobject_hasinterface;

public class Computer {

    String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }

    void writeSD(SDCard sdCard) {
        sdCard.writeSD();
    }
}
