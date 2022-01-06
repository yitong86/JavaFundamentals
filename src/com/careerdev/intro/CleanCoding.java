package com.careerdev.intro;

public class CleanCoding {
    public static void main(String[] args) {
       //greet
        String message = greetUser("Mosh","Hamedani");
    }
    public static String greetUser(String firstName,String lastName) {
        return "Hello " + firstName + " " + lastName;
    } 
}
