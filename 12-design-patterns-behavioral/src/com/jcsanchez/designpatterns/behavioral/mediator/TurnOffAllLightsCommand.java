package com.jcsanchez.designpatterns.behavioral.mediator;

/**
 * Created by jsssn on 20-May-17.
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
