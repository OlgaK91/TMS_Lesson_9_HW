package com.tms.task1.worker;

import com.tms.task1.IPosition;

public class Worker implements IPosition {
    @Override
    public void printPosition() {
        System.out.println("Worker");
    }
}
