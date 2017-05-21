package com.jcsanchez.designpatterns.behavioral.visitor;

/**
 * Created by jsssn on 20-May-17.
 */
public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
