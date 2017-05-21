package com.jcsanchez.designpatterns.behavioral.template;

/**
 * Created by jsssn on 20-May-17.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println();

        System.out.println("Store Order:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
