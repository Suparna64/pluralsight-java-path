package com.jcsanchez.designpatterns.creational.AbstractFactory;

/**
 * Created by jsssn on 20-May-17.
 */
public abstract class CreditCard {

    protected int cardNumberLength;
    protected int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
