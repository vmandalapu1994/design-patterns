package com.design_pattern.chainofresponsibility.implementation2;

public class InfoLogHandler extends LogHandler {

    @Override
    public boolean canHandle(LogLevel logLevel) {
        return LogLevel.INFO.equals(logLevel);
    }

    public void logMessage(LogLevel logLevel, String message) {
        if (canHandle(logLevel)) {
            System.out.println("[INFO] " + message);
        } else if (next != null) {
            next.logMessage(logLevel, message);
        }
    }

}
