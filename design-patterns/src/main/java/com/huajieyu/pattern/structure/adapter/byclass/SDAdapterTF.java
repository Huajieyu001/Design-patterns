package com.huajieyu.pattern.structure.adapter.byclass;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        return super.readTF();
    }

    @Override
    public void writeSD() {
        super.writeTF();
    }
}
