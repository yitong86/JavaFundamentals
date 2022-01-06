package com.careerdev.intro;

public class Debugging {
    public static void main(String[] args) {
        String name = "Mosh";
        System.out.println("Hello World");
        int i = 0;
        if (i == 2){

        }
            //debugging java applications
            System.out.println("Start");
            printNumbers(4);
            System.out.println("Finish");
    }
    public static  void printNumbers(int limit) {
        for (int i = 0; i < limit;i+=2) {
            System.out.println(i);
        }
    }
}
