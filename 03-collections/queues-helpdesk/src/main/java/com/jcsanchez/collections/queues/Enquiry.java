package com.jcsanchez.collections.queues;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by jsssn on 29-Apr-17.
 */
public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(final Customer customer, final Category category) {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "customer='" + customer + '\'' +
                ", category=" + category + '}';
    }
}