package com.careerdev.intro;

import jdk.swing.interop.SwingInterOpUtils;

public class Inheritance {

    public static void main(String[] args) {
        //Polymorphism,//Abstract Classes and Methods
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls) {
            control.render();
        }
            //if control is TextBox
            //renderTextBox
            //else if it is a CheckBox
            //renderCheckBox
        }
       //comparing object
//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());
//        System.out.println(point1.equals(new TextBox()));//point1.equals(point2)//output false//


        //overriding
//        var textbox = new TextBox();
//        textbox.setText("Hello World");
//        System.out.println(textbox);
//        System.out.println(textbox.toString());

        //
//        var box1 = new TextBox();
//        var box2 = new TextBox();
//        System.out.println(box1.hashCode());
//        System.out.println(box1.equals(box2));
//        System.out.println(box2.hashCode());
//        System.out.println(box1.toString());
//
//        var control = new TextBox();
//
//        control.disable();
//        System.out.println(control.isEnabled());


        //upcasting and downcasting
//        var control1 = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);
//    }

//    public static void show(UIControl control) {
//        if (control instanceof TextBox) {
//
//            var textBox = (TextBox) control;
//        }
//
//    }
//}
}