package com.tms.task1;

import com.tms.task1.accountant.Accountant;
import com.tms.task1.director.Director;
import com.tms.task1.worker.Worker;

public class Main {

    public static void main(String[] args) {
        String positionName = "Accountant";
        IPosition iPosition = getPosition(positionName);
        iPosition.printPosition();
    }

    private static IPosition getPosition(String positionName) {
        IPosition iPosition;
        if (positionName.equals("Accountant")) {
            iPosition = new Accountant();
        } else if (positionName.equals("Director")) {
            iPosition = new Director();
        } else {
            iPosition = new Worker();
        }
        return iPosition;
    }

}
