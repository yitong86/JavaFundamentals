package com.careerdev.intro;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        //The Math Class
        int result = Math.round(1.1F);//1
        int result1 = (int)Math.ceil(1.1F);//greater than 1.1F output 2
        int result2 = (int)Math.floor(1.1F);// less than 1.1F


        //casting
        //byte > short > int >long
        short x1 = 1;
        int y1 = x1 + 2;

        double x2 = 1.1;
        int y = (int)x2 + 2;
        //string
        String x3 = "1";//String x = "1.1";
        int y3 = Integer.parseInt(x3) + 2;//double y = Double.parseDouble(x) + 2;

        //Arithmetic Expressions
        double result5 = (double)10 / (double)3;
        int x = 1;
        x += 2;//x = x + 2
        x -= 2;
        int y5 = x++;//int y = ++x
        System.out.println(x);//System.out.println(x);
        //output 2             //output 2
        System.out.println(y);//System.out.println(y);
        //output 1            //output 2


        //constants
        final float PI = 3.14F;

        //Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] =2;
        Arrays.toString(numbers);

        int[] numbers1 = { 2, 3, 5, 1, 4};
        Arrays.sort(numbers1);
        System.out.println(numbers1.length);

        //multi-dimensional array
        int[][] numbers2 = new int[2][3];
        numbers2[0][0] = 1;
        Arrays.deepToString(numbers2);

        int[][] numbers3 = {{1,2,3},{4,5,6}};


        //String
        String message2 = "c:\\Windows\\...";
        String message3 = "c:\nWindows\\...";
        String message4 = "c:\tWindows\\...";
        String message1 = "Hello \"Mosh\"";
        String message = "Hello World" + "!!";
        message.endsWith("!!");
        message.length();
        message.indexOf(0);
        message.trim();
        message.replace("!","*");
        //reference type
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        byte age = 30;
        Date now = new Date();
        now.getTime();
        //data type
        int myAge = 30;
        int herAge = myAge;
        int temperature = 20;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        //System.out.println(message4);
    }
}
