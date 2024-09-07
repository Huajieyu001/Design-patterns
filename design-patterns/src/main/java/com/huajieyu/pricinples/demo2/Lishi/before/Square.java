package com.huajieyu.pricinples.demo2.Lishi.before;

public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
