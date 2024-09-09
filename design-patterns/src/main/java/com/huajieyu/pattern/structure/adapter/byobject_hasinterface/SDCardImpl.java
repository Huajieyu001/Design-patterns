package com.huajieyu.pattern.structure.adapter.byobject_hasinterface;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("SDCardImpl readSD");
        return "SDCardImpl readSD";
    }

    @Override
    public void writeSD() {
        System.out.println("SDCardImpl writeSD");
    }
}