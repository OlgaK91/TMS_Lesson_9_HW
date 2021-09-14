package com.tms.task0;

public class Circle extends Figure {
//    private static int countOfSides = 1;

    public Circle(double[] sidesLength) {
        super(sidesLength);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(sidesLength[0], 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * sidesLength[0];
    }
}
