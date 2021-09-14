/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;

import java.util.Scanner;
import java.lang.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Height in Inches: ");
        double height = checkNumber(scanner.nextLine());
        System.out.print("Enter the weight in pounds: ");
        double weight = checkNumber(scanner.nextLine());


        // bmi = (weight / (height × height)) * 703

        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f", BMI) + ".");


        if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else if (BMI > 25) {
            System.out.println("You are Overweight, You should consult with your doctor.");
        } else if (BMI < 18.5) {
            System.out.println("You are underweight, You should consult with your doctor.");

        }
    }
//checkNumber
    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    private static int checkNumber(String inputStr) {
        Scanner scanner = new Scanner(System.in);
        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while (!completed) {
            if (isNum(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            } else {
                System.out.print("Error! Please enter numerical values: ");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;


    }
}
