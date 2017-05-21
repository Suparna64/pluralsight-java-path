package com.jcsanchez.designpatterns.behavioral.mediator;

/**
 * Created by jsssn on 20-May-17.
 */
public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
