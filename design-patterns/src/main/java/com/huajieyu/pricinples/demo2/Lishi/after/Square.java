package com.huajieyu.pricinples.demo2.Lishi.after;

public class Square implements Quadrilateral{

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return this.side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }
}
