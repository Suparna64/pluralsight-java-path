package com.jcsanchez.designpatterns.creational.AbstractFactory;

/**
 * Created by jsssn on 20-May-17.
 */
public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
