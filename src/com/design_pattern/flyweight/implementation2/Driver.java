package com.design_pattern.flyweight.implementation2;

public class Driver {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree("Neem", "Green", "Rough", 20, 10);
        forest.plantTree("Neem", "Green", "Rough", 30, 10);
        forest.plantTree("Mango", "DarkGreen", "Rough", 10, 10);
        forest.plantTree("Mango", "DarkGreen", "Rough", 25, 10);
        forest.plantTree("Mango", "DarkGreen", "Rough", 35, 10);
    }

}
