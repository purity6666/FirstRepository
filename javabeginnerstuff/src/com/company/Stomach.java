package com.company;

public class Stomach extends Organ {

    public void digestion() {
        System.out.println("Stomach digested...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("    1. Digest");
    }

    public Stomach(String name, String medCondition) {
        super(name, medCondition);
    }
}
