package com.jcsanchez.designpatterns.structural.bridge;

import java.util.List;

/**
 * Created by jsssn on 18-May-17.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
