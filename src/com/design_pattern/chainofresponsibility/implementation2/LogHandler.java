package com.design_pattern.chainofresponsibility.implementation2;

public abstract class LogHandler {

    protected LogHandler next;


    public void setNextHandler(LogHandler logHandler) {
        this.next = logHandler;
    }

    public abstract boolean canHandle(LogLevel logLevel);

    public void logMessage(LogLevel logLevel, String message) {
        if (canHandle(logLevel)) {
            System.out.println("[" + logLevel + "] " + message);
        } else if (next != null) {
            next.logMessage(logLevel, message);
        }
    }


}
