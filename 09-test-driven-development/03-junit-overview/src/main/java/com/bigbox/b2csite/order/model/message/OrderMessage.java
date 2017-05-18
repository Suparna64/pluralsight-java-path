package com.bigbox.b2csite.order.model.message;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jsssn on 17-May-17.
 */
public class OrderMessage implements Serializable {

    private static final long serialVersionUID = -7649320789062468612L;

    private String orderNumber;
    private List<ItemMessage> items;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ItemMessage> getItems() {
        return items;
    }

    public void setItems(List<ItemMessage> items) {
        this.items = items;
    }
}
