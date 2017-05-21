package com.jcsanchez.designpatterns.behavioral.visitor;

/**
 * Created by jsssn on 20-May-17.
 */
public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
