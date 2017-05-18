package com.bigbox.b2csite.order.dao;

/**
 * Created by jsssn on 17-May-17.
 */
public class DataAccessException extends Exception {

    private static final long serialVersionUID = -5707009421152422584L;

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(String message) {
        super(message);
    }
}
