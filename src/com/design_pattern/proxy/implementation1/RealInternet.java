package com.design_pattern.proxy.implementation1;

public class RealInternet implements Internet {
    @Override
    public void access(String url) {
        System.out.println("Accessing " + url);
    }
}
