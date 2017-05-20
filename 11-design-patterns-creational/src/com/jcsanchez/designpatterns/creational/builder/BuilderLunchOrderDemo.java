package com.jcsanchez.designpatterns.creational.builder;

/**
 * Created by jsssn on 20-May-17.
 */
public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Sourdough").condiments("Lettuce").dressing("Mayo").meat("Salami");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDrressing());
        System.out.println(lunchOrder.getMeat());
    }
}
