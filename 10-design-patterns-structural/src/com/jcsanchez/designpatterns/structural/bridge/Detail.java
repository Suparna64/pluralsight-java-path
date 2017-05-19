package com.jcsanchez.designpatterns.structural.bridge;

/**
 * Created by jsssn on 18-May-17.
 */
public class Detail {

    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
