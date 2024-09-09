package com.huajieyu.pattern.structure.adapter.byobject_no_interface;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        System.out.println("TFCardImpl readTF");
        return "SDCardImpl readSD";
    }

    @Override
    public void writeTF() {
        System.out.println("TFCardImpl writeTF");
    }
}
