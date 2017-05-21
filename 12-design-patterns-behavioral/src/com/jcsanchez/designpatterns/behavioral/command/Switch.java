package com.jcsanchez.designpatterns.behavioral.command;

/**
 * Created by jsssn on 20-May-17.
 */

// Invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
