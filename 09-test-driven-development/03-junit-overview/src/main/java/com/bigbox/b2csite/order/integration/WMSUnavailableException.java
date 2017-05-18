package com.bigbox.b2csite.order.integration;

/**
 * Created by jsssn on 17-May-17.
 */
public class WMSUnavailableException extends Exception {

    private static final long serialVersionUID = -6118793265317370209L;

    public WMSUnavailableException(String message) {
        super(message);
    }
}
