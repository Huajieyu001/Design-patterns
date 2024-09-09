package com.huajieyu.pattern.structure.adapter.byobject_hasinterface;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void test() {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        TFCardImpl tfCard = new TFCardImpl();
        computer.readSD(sdCard);
        computer.writeSD(sdCard);
        System.out.println("------------------------");
        SDAdapterTF adapter = new SDAdapterTF(tfCard);
        computer.readSD(adapter);
        computer.writeSD(adapter);
    }
}
