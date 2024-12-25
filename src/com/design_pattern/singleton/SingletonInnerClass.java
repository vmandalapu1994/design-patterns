package com.design_pattern.singleton;

public class SingletonInnerClass {


    private SingletonInnerClass() {
        System.out.println("Singleton inner class instance created");
    }

    private static class Singleton {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return Singleton.INSTANCE;
    }

}

