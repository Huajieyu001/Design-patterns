package com.huajieyu.pricinples.demo2.Lishi.after;

public class Rectangle implements Quadrilateral{

    private double width;

    private double length;

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
