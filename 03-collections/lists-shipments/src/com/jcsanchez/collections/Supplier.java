package com.jcsanchez.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsssn on 25-Apr-17.
 */
public class Supplier {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public List<Product> products()
    {
        return products;
    }

    @Override
    public String toString()
    {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
