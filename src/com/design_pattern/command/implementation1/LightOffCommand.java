package com.design_pattern.command.implementation1;

public class LightOffCommand implements Command {

    private final Light light;


    public LightOffCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
