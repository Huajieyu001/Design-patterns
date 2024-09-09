package com.huajieyu.pattern.structure.adapter.byclass;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void test() {
        Computer computer = new Computer();
        SDCardImpl sdCard = new SDCardImpl();
        TFCardImpl tfCard = new TFCardImpl();
        SDAdapterTF adapter = new SDAdapterTF();
        computer.readSD(sdCard);
        computer.writeSD(sdCard);
        System.out.println("------------------------");
        computer.readSD(adapter);
        computer.writeSD(adapter);
    }
}
