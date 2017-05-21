package com.jcsanchez.designpatterns.behavioral.template;

/**
 * Created by jsssn on 20-May-17.
 */
public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get items from cart,");
        System.out.println("Set gift preferences,");
        System.out.println("Set delivery address,");
        System.out.println("Set billing address.");
    }

    @Override
    public void doPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Ship the item to address");
    }
}
