package com.jcsanchez.designpatterns.creational.factory;

/**
 * Created by jsssn on 20-May-17.
 */
public class Shop extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
