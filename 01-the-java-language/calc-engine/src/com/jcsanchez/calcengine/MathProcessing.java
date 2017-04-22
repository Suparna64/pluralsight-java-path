package com.jcsanchez.calcengine;

/**
 * Created by jsssn on 22-Apr-17.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
