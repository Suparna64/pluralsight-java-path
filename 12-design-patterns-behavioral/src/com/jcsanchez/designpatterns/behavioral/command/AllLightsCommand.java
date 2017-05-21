package com.jcsanchez.designpatterns.behavioral.command;

import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */
public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
