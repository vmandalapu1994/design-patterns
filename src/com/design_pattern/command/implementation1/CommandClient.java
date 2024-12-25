package com.design_pattern.command.implementation1;

public class CommandClient {


    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.pressButton("LIGHTON");
        remoteControl.pressButton("LIGHTOFF");

    }

}
