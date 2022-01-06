package com.careerdev.intro;

import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        //for each
        String[] fruits = {"apple","Mango","Orange"};

        for (String fruit : fruits)
            System.out.println(fruit);

        //for loops
        for (int i = 0;i < 5;i++){
           // System.out.println("Hello World" + i);
        }
        //while loop
        int j = 0;
        while (j > 0){
           // System.out.println("Hello World" + j);
            j--;
        }


        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            //while(true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            //break and continue
            if (!input.equals("quit"))
                break;
            System.out.println(input);
        }

        // do while
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

            System.out.println(input);

        } while (!input.equals("quit"));




        int temperature = 20;
        boolean isWarm = temperature > 20 && temperature < 30;
       // System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;


        // if statement
        int temp = 32;
        if (temp > 30) {
           // System.out.println("It's a hot day");
           // System.out.println("Drink water");
        } else if (temp > 20) {
            //System.out.println("Beautiful day");
        } else {
            //System.out.println("Cold day");
        }
        //simplifying if statement
        int income = 120_000;
        //boolean hasHighIncome1 = (income > 100_000);//
        String className = "Economy";//String hasHighIncome1 = (income > 100_000) ? "First"; "Economy"
        if (income > 100_000)
            className = "First";

        //switch statements
        String role = "admin";
        //int role =1;
        switch (role) {
            case "admin"://case 1
                //System.out.println("You're an admin");
                break;
            case "moderator":
                //System.out.println("You're a moderator");
                break;
            default:
                //System.out.println("You're a guest");

        }


        }
    }
