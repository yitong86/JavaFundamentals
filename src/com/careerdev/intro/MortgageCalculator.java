package com.careerdev.intro;


import jdk.swing.interop.SwingInterOpUtils;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class MortgageCalculator {
    final static byte month = 12;
    final static byte percent = 100;
    public static void main(String[] args) {
        int principal= (int) readNumber("Principal: ",1000,1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte) readNumber("Period (Years): ",1,30);

        double mortgage = calculateMortgage(principal,annualInterest,years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("------");
        System.out.println("Mortgage: " + mortgageFormatted);
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-------");
        for (short months = 1 ;months <= years * month;months++) {
            double balance = calculateBalance(principal,annualInterest,years,months);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + "and" + max);
        }
        return value;
    }

    public static  double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numbersOfPaymentsMade)
    {

        float monthlyInterest = annualInterest / percent / month;
        short numberOfPayments = (short) (years * month);
        double balance = principal * (Math.pow(1 + monthlyInterest,numberOfPayments)- Math.pow(1 + monthlyInterest,numbersOfPaymentsMade))
                                    / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);
        return balance;
    }

    public static  double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / percent / month;
        short numberOfPayments = (short) (years * month);
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        return mortgage;

    }
}
