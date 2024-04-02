package com.design_pattern.proxy.implementation2;

import java.lang.reflect.Proxy;

public class Main {


    public static void main(String[] args) {
        MyInterface realObject = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Doing something");
            }
        };

        MyInvocationHandler handler = new MyInvocationHandler(realObject);
        MyInterface proxyInstance = (MyInterface) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{MyInterface.class}, handler);
        proxyInstance.doSomething();
    }

}
