package com.jcsanchez.designpatterns.behavioral.template;

/**
 * Created by jsssn on 20-May-17.
 */
public class StoreOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Ring up items from cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with card");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Bag items at counter");
    }
}
