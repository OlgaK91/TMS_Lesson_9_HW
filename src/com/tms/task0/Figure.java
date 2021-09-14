package com.tms.task0;

import java.util.Arrays;

public abstract class Figure {
//    protected int countOfSides;
    protected double[] sidesLength;

    public Figure(double[] sidesLength) {
        this.sidesLength = sidesLength;
    }

    public double getPerimeter() {
        return Arrays.stream(sidesLength).sum();
    }

    public abstract double getSquare();

    public double getArrayProduct(double[] array) {
        double product = 1;
        for (double i : array) {
            product *= i;
        }
        return product;
    }
}
