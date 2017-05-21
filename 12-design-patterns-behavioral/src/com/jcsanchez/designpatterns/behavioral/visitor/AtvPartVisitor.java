package com.jcsanchez.designpatterns.behavioral.visitor;

/**
 * Created by jsssn on 20-May-17.
 */
public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(Fender fender);
    void visit(PartsOrder partsOrder);
}
