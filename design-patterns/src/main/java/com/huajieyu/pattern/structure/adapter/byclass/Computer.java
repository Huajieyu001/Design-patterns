package com.huajieyu.pattern.structure.adapter.byclass;

public class Computer {

    String readSD(SDCard sdCard) {
        return sdCard.readSD();
    }

    void writeSD(SDCard sdCard) {
        sdCard.writeSD();
    }
}
