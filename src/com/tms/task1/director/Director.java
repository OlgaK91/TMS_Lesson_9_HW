package com.tms.task1.director;

import com.tms.task1.IPosition;

public class Director implements IPosition {
    @Override
    public void printPosition() {
        System.out.println("Director");
    }
}
