package com.jcsanchez.designpatterns.creational.builder;

/**
 * Created by jsssn on 20-May-17.
 */
public class LunchOrderTeleDemo {

    public static void main(String[] args) {
        LunchOrderTele lunchOrderTele = new LunchOrderTele("White", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }
}
