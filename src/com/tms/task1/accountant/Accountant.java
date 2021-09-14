package com.tms.task1.accountant;

import com.tms.task1.IPosition;

public class Accountant implements IPosition {
    @Override
    public void printPosition() {
        System.out.println("Accountant");
    }
}
