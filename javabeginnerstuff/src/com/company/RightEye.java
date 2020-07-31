package com.company;

public class RightEye extends LeftEye{

    @Override
    public void open() {
        System.out.println("Opening Right eye...");
    }

    public RightEye(String name, String medCondition, String color) {
        super(name, medCondition, color);
    }
}
