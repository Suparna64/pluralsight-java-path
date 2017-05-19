package com.jcsanchez.designpatterns.structural.composite;

/**
 * Created by jsssn on 19-May-17.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
