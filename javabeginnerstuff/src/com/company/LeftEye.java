package com.company;

public class LeftEye extends Organ{

    private String color;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Eye Color: " + color);
        System.out.println("    1. Inspect Eye");
    }

    public void open() {
        System.out.println("Opening Left Eye...");
    }

    public LeftEye(String name, String medCondition, String color) {
        super(name, medCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
