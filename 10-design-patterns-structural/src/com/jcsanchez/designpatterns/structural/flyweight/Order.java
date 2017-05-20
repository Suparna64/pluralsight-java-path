package com.jcsanchez.designpatterns.structural.flyweight;

/**
 * Created by jsssn on 19-May-17.
 */
public class Order {
    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
