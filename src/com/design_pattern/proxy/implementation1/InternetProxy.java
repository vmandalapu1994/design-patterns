package com.design_pattern.proxy.implementation1;

public class InternetProxy implements Internet {

    private Internet realInternet;

    public InternetProxy() {
        realInternet = new RealInternet();
    }

    @Override
    public void access(String url) {
        if (isBlocked(url)) {
            throw new RuntimeException("Access to " + url + " is blocked");
        }
        realInternet.access(url);
        logAccess(url);
    }

    public boolean isBlocked(String url) {
        return url.contains("facebook");
    }

    public void logAccess(String url) {
        System.out.println(url + " is accessed");
    }
}
