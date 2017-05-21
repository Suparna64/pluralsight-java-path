package com.jcsanchez.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by jsssn on 21-May-17.
 */
public class Goal {

    @Range(min = 1, max = 120)
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
