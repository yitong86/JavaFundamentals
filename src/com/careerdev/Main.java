package com.careerdev;

import com.careerdev.intro.Console;
import com.careerdev.intro.MortgageCalculator;
import com.careerdev.intro.MortgageReport;

public class Main {


//    final static byte month = 12;
//    final static byte percent = 100;

    public static void main(String[] args) {
            int principal= (int) Console.readNumber("Principal: ",1000,1_000_000);
            float annualInterest = (float) Console.readNumber("Annual Interest Rate: ",1,30);
            byte years = (byte) Console.readNumber("Period (Years): ",1,30);

            MortgageCalculator calculator = new MortgageCalculator(principal,annualInterest,years);

            MortgageReport report = new MortgageReport(calculator);
            report.printMortgage();
            report.printPaymentSchedule();
//            MortgageReport.printMortgage(principal, annualInterest, years);
//            MortgageReport.printPaymentSchedule(principal, annualInterest, years);
    }


}
