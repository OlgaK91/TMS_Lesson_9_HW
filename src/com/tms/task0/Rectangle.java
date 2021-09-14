package com.tms.task0;

import java.util.Arrays;

public class Rectangle extends Figure {
//    private static int countOfSides = 2;

    public Rectangle(double[] sidesLength) {
        super(sidesLength);
    }

    @Override
    public double getSquare() {
        return getArrayProduct(sidesLength);

    }
}
