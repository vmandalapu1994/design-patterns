package com.design_pattern.flyweight.implementation1;

public class Demo {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Font font1 = fontFactory.getFont("Arial");

        font1.render("I am vamsikrishna");
        Font font2 = fontFactory.getFont("Arial");

        System.out.println("are equals? " + (font1 == font2));

        font2.render("I am vamsikrishna");

        Font font3 = fontFactory.getFont("Times New Roman");
        font3.render("I am from Hyderabad");

    }
}
