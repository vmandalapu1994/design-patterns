package com.design_pattern.cor.implementation2;

public class LogClient {

    public static void main(String[] args) {
        DebugLogHandler debugLogHandler = new DebugLogHandler();
        InfoLogHandler infoLogHandler = new InfoLogHandler();
        infoLogHandler.setNextHandler(debugLogHandler);

        infoLogHandler.logMessage(LogLevel.DEBUG, "Some debug message");
        infoLogHandler.logMessage(LogLevel.ERROR, "Some error occurred");

    }

}
