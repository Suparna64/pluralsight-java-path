package com.jcsanchez.designpatterns.behavioral.command;

/**
 * Created by jsssn on 20-May-17.
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
