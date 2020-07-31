package com.company;

public class Skin extends Organ {

    public void peeling() {
        System.out.println("Skin peeled... That hurts");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("    1. Peel skin");
    }

    public Skin(String name, String medCondition) {
        super(name, medCondition);
    }
}
