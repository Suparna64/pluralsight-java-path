package com.bigbox.b2csite.order.service.impl;

import com.bigbox.b2csite.order.dao.OrderDao;
import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;
import com.bigbox.b2csite.order.model.transformer.OrderEntityToOrderSummaryTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jsssn on 14-May-17.
 */
public class OrderServiceImplTest {

    private final static long CUSTOMER_ID = 1L;

    @Test
    public void test_getOrderSummary_success() throws Exception {
        // Setup
        OrderServiceImpl target = new OrderServiceImpl();

        OrderDao mockOrderDao = mock(OrderDao.class);
        target.setOrderDao(mockOrderDao);

        OrderEntityToOrderSummaryTransformer mockTransformer =
                mock(OrderEntityToOrderSummaryTransformer.class);
        target.setTransformer(mockTransformer);

        OrderEntity orderEntityFixture = new OrderEntity();
        List<OrderEntity> orderEntityListFixture = new LinkedList<>();
        orderEntityListFixture.add(orderEntityFixture);

        when(mockOrderDao.findOrdersByCustomer(CUSTOMER_ID))
                .thenReturn(orderEntityListFixture);

        OrderSummary orderSummaryFixture = new OrderSummary();
        when(mockTransformer.transform(orderEntityFixture))
                .thenReturn(orderSummaryFixture);

        // Execution
        List<OrderSummary> result = target.getOrderSummary(CUSTOMER_ID);

        // Verification
        verify(mockOrderDao).findOrdersByCustomer(CUSTOMER_ID);
        verify(mockTransformer).transform(orderEntityFixture);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertSame(orderSummaryFixture, result.get(0));
    }
}