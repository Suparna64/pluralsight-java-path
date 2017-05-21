package com.jcsanchez.designpatterns.behavioral.template;

/**
 * Created by jsssn on 20-May-17.
 */
public abstract class OrderTemplate {

    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    protected abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }
}
