package com.tms.task0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = getFigure(new double[]{2, 1});
        figures[1] = getFigure(new double[]{3, 1});
        figures[2] = getFigure(new double[]{3, 1, 2});
        figures[3] = getFigure(new double[]{3, 1, 1});
        figures[4] = getFigure(new double[]{5});
        System.out.println(Arrays.stream(Arrays.stream(figures).mapToDouble(x -> x.getPerimeter()).toArray()).sum());
    }

    public static Figure getFigure(double[] array) {
        Figure figure = null;
        try {
            if (array.length == 1) {
                figure = new Circle(array);
            } else if (array.length == 2) {
                figure = new Rectangle(array);
            } else if (array.length == 3) {
                figure = new Triangle(array);
            } else {
                throw new WrongDimensionException("Wrong lenght of Array. 1,2 or 3 are expected");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return figure;

    }

}
