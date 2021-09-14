package com.tms.task0;

import java.util.Arrays;

public class Triangle extends Figure {
//    private static int countOfSides = 3;
    public Triangle(double[] sidesLength) {
        super(sidesLength);
    }

    @Override
    public double getSquare() {
        double halfPerimetr = super.getPerimeter() / 2;
        return Math.sqrt(halfPerimetr * getArrayProduct(Arrays.stream(sidesLength).map(x -> (halfPerimetr - x)).toArray()));

    }
}
