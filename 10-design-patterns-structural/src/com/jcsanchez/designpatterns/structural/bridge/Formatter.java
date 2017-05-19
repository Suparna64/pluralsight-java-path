package com.jcsanchez.designpatterns.structural.bridge;

import java.util.List;

/**
 * Created by jsssn on 18-May-17.
 */
public interface Formatter {

    String format(String header, List<Detail> details);
}
