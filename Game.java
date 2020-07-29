package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome player!");

        System.out.print("Please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);

        String name = nameScanner.next();

        System.out.println("Hello " + name);

        Random randomGuess = new Random();
        int numberToGuess = randomGuess.nextInt(20) + 1;

        System.out.println("Guess a random number between 1 and 20");
        int numOfGuesses = 0;
        while (numOfGuesses < 5) {
            numOfGuesses++;

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput < numberToGuess) {
                System.out.println("the number is higher");
            } else if (userInput > numberToGuess){
                System.out.println("the number is lower");
            } else {
                System.out.println("You won in " + numOfGuesses + " guesses!");
                break;
            }
            if (numOfGuesses == 5) {
                System.out.println("You lost");
            }

            }
        }
    }

