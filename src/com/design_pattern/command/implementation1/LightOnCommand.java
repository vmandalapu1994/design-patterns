package com.design_pattern.command.implementation1;

public class LightOnCommand implements Command {

    private final Light light;


    public LightOnCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
