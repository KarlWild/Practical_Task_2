package com.company.fourthtask;

public class TwoNumbersImpl implements TwoNumbers {
    private double X;
    private double Y;

    @Override
    public void setX(double X) {
        this.X = X;
    }

    @Override
    public void setY(double Y) {
        this.Y = Y;
    }

    @Override
    public void getDifference() {
        System.out.println(Math.abs(X - Y));
    }
}
