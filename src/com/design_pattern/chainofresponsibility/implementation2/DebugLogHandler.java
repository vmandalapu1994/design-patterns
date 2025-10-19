package com.design_pattern.chainofresponsibility.implementation2;

public class DebugLogHandler extends LogHandler {

    @Override
    public boolean canHandle(LogLevel logLevel) {
        return LogLevel.DEBUG.equals(logLevel);
    }

    public void logMessage(LogLevel logLevel, String message) {
        if (canHandle(logLevel)) {
            System.out.println("[DEBUG] " + message);
        } else if (next != null) {
            next.logMessage(logLevel, message);
        }
    }

}
