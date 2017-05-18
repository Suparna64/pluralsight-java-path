package com.bigbox.b2csite.order.integration;

import com.bigbox.b2csite.order.model.message.OrderMessage;

/**
 * Created by jsssn on 17-May-17.
 */
public class WarehouseManagementService {

    public static boolean sendOrder(OrderMessage orderMessage) throws WMSUnavailableException {
        throw new WMSUnavailableException("WMS is currently down for unknown reason");
    }
}
