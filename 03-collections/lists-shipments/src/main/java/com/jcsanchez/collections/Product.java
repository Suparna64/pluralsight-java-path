package com.jcsanchez.collections;

import java.util.Comparator;
import static java.util.Comparator.comparing;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class Product {
    public static final Comparator<Product> BY_WEIGHT
            = comparing(Product::getWeight);

    public static final Comparator<Product> BY_NAME
            = comparing(Product::getName);

    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }

    public int getWeight() {return weight; }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }
}
