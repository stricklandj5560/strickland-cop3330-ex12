import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double principal, interestRate, numberOfYears, simpleInt = 0;
            System.out.print("Enter the principal: ");
            principal = scan.nextDouble();
            System.out.print("Enter the rate of interest (%): ");
            interestRate = scan.nextDouble() / 100;
            System.out.print("Enter the number of years: ");
            numberOfYears = scan.nextDouble();
            // calculate A = P(1 + rt) and round to 2 decimal places.
            simpleInt = Math.round(100 * (principal + (principal * interestRate * numberOfYears))) / 100;
            System.out.println("After " + numberOfYears + " at " + (interestRate * 100) + "%, the investment will be worth $"
                                + simpleInt);
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
