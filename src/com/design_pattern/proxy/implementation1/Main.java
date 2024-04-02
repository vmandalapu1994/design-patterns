package com.design_pattern.proxy.implementation1;

public class Main {


    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        internet.access("www.google.com");
        internet.access("www.facebook.com");
    }

}
