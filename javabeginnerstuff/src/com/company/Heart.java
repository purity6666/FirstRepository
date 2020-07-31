package com.company;

public class Heart extends Organ {

    private int heartRate;

    public void heartRateChangeOut(int newHeartRate) {
        System.out.println("New Heart rate is " + newHeartRate);
        if (newHeartRate <= 0) {
            System.out.println("The heart is no longer beeping... ");
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Heart rate: " + heartRate);
        System.out.println("    1. Change Heart Rate");
    }

    public Heart(String name, String medCondition, int heartRate) {
        super(name, medCondition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
