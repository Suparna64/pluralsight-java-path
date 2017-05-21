package com.jcsanchez.designpatterns.behavioral.command;

/**
 * Created by jsssn on 20-May-17.
 */
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
