package com.company;

public class Organ {
    private String name;
    private String medCondition;

    public void displayInfo() {
        System.out.println("Organ: " + name);
        System.out.println("Medical condition: " + medCondition);
    }

    public Organ(String name, String medCondition) {
        this.name = name;
        this.medCondition = medCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedCondition() {
        return medCondition;
    }

    public void setMedCondition(String medCondition) {
        this.medCondition = medCondition;
    }
}
