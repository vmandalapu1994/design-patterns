package com.design_pattern.command.implementation1;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

    private Map<String, Command> commandMap;

    public RemoteControl() {
        commandMap = new HashMap<>();
        commandMap.put("LIGHTON", new LightOnCommand());
        commandMap.put("LIGHTOFF", new LightOffCommand());
    }

    public void pressButton(String buttonName) {
        if (commandMap.containsKey(buttonName)) {
            commandMap.get(buttonName).execute();
        }
    }


}
