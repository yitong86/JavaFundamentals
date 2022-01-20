package com.careerdev.intro;

public interface TaxCalculator {
    float minimumTax = 100;
    double calculateTax();

    static double getTaxabaleIncome(double income, double expenses) {
        return income - expenses;
    }
}
