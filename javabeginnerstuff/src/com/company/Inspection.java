package com.company;

import java.util.Scanner;

public class Inspection {

    public static void main(String[] args){

        LeftEye lefteye = new LeftEye("Left Eye", "Short sighted", "blue");
        RightEye righteye = new RightEye("Right Eye", "Normal", "blue");
        Heart heart = new Heart("Heart", "Increased Cholesterol", 65);
        Stomach stomach = new Stomach("Stomach", "Normal");
        Skin skin = new Skin("Skin", "Burned");

        int answer = 0;

        while (answer != 6) {
            System.out.println("Organs:");
            System.out.println("    1. Left Eye");
            System.out.println("    2. Right Eye");
            System.out.println("    3. Heart");
            System.out.println("    4. Stomach");
            System.out.println("    5. Skin");
            System.out.println("    6. Exit");

            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            if(answer == 1) {

                lefteye.displayInfo();

                Scanner scanner1 = new Scanner(System.in);
                int input = scanner1.nextInt();
                if (input == 1) {
                    lefteye.open();
                } else {
                    System.out.println("Wrong input, returning to the start");
                }
            }

            if (answer == 2) {

                righteye.displayInfo();

                Scanner scanner1 = new Scanner(System.in);
                int input1 = scanner1.nextInt();
                if (input1 == 1) {
                    righteye.open();
                } else {
                    System.out.println("Wrong input, returning to the start");
                }
            }

            if (answer == 3) {

                heart.displayInfo();

                Scanner scanner1 = new Scanner(System.in);
                int input2 = scanner1.nextInt();
                if (input2 == 1) {

                    System.out.print("Changing heart rate to: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int newRate = scanner2.nextInt();
                    heart.heartRateChangeOut(newRate);
                } else {
                    System.out.println("Wrong input, returning to the start");
                }

            }

            if (answer == 4) {

                stomach.displayInfo();

                Scanner scanner3 = new Scanner(System.in);
                int input3 = scanner3.nextInt();
                if (input3 == 1) {
                    stomach.digestion();
                } else {
                    System.out.println("Wrong input, returning to the start");
                }
            }
            if (answer == 5) {

                skin.displayInfo();

                Scanner scanner4 = new Scanner(System.in);
                int input4 = scanner4.nextInt();
                if (input4 == 1) {
                    skin.peeling();
                } else {
                    System.out.println("Wrong input, returning to the start");
                }
            }

        }
    }
}
