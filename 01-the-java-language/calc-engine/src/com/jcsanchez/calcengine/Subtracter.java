package com.jcsanchez.calcengine;

/**
 * Created by jsssn on 21-Apr-17.
 */
public class Subtracter extends CalculateBase {
    public Subtracter() {}
    public  Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
