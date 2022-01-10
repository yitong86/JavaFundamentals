package com.careerdev.intro;

public class classes {
    public String text = "";//Field

    public static void main(String[] args) {
        //Procedural Programming
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//        int wage = calculateWage(baseSalary, extraHours,  hourlyRate);
//        System.out.println(wage);



        var textBox1 = new classes();
        //var textBox2 = textBox1;
        //textBox2.setText("Hello World");
       // System.out.println(textBox1.text);output Hello World
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new classes();
        textBox1.setText("Box 2");
        System.out.println(textBox2);
    }
    public void setText(String text){
        this.text = text;
    }
    public  void  clear(){
        text = "";
    }

//    public  static int calculateWage (
//            int baseSalary,
//            int extraHours,
//            int hourlyRate) {
//            return baseSalary + (extraHours * hourlyRate);
//    }

}
