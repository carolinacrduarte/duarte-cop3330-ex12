/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise12 {
    public static void main(String[] args) {
        double principal;
        double interest;
        double years;
        Scanner scan = new Scanner(System.in); //Double scanner.
        System.out.print("Enter the principal: ");
        principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        interest = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        years = scan.nextDouble();

        //Calculations:
        double investment = principal * (1 + (interest/100) * years);

        //Rounding up to two decimal places:
        double roundOff = Math.round(investment * 100.0) / 100.0;

        //Printing:
        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(roundOff));

    }
}
