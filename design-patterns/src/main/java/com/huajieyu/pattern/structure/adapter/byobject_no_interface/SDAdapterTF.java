package com.huajieyu.pattern.structure.adapter.byobject_no_interface;

public class SDAdapterTF extends SDCardImpl {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD() {
        tfCard.writeTF();
    }
}
