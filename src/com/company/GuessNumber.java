package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello! I thought of a number from 1 to 200. Guess it: ");
        int inNum = in.nextInt();

        Random rn = new Random();
        int randomNum = rn.nextInt(200) + 1;

        for (int i = 1; i < 5; i++) {
            if (randomNum > inNum) {
                System.out.println("Oops! You did not guess right. My number is greater than yours.\n" +
                        "What number am I thinking?");
                int num = in.nextInt();
            } else if (randomNum < inNum) {
                System.out.println("Oops! You did not guess right. My number is less than yours.\n" +
                        "What number am I thinking?");
                int num = in.nextInt();
            } else {
                System.out.println("You're cool! You guessed!");
                break;
            }
        }
        System.out.println("Sorry, but you did not guess right. Try once more!");
    }
}


