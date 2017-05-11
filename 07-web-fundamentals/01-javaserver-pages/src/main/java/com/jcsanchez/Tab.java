package com.jcsanchez;

/**
 * Created by jsssn on 11-May-17.
 */
public class Tab {
    public String name;
    public String url;

    Tab(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Tab{" +
                "name'" + name + '\'' +
                ", url='" + '\'' +
                '}';
    }
}
