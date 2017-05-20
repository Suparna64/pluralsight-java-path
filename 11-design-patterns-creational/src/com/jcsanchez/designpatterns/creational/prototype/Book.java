package com.jcsanchez.designpatterns.creational.prototype;

/**
 * Created by jsssn on 20-May-17.
 */
public class Book extends Item {

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
