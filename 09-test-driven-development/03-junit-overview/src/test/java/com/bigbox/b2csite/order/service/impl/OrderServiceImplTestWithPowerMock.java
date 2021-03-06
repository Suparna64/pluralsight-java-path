package com.bigbox.b2csite.order.service.impl;

import com.bigbox.b2csite.order.dao.OrderDao;
import com.bigbox.b2csite.order.integration.WarehouseManagementService;
import com.bigbox.b2csite.order.model.domain.OrderCompletionAudit;
import com.bigbox.b2csite.order.model.entity.OrderEntity;
import com.bigbox.b2csite.order.model.entity.OrderItemEntity;
import com.bigbox.b2csite.order.model.message.OrderMessage;
import com.bigbox.b2csite.order.model.transformer.OrderEntityToOrderSummaryTransformer;
import com.bigbox.b2csite.order.service.OrderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.LinkedList;


/**
 * Created by jsssn on 17-May-17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(value = {WarehouseManagementService.class, OrderServiceImpl.class})
public class OrderServiceImplTestWithPowerMock {

    private final static long CUSTOMER_ID = 1;
    private final static long ORDER_ID = 2L;
    private final static String ORDER_NUMBER = "1234";

    private OrderServiceImpl target = null;

    protected @Mock OrderDao mockOrderDao;
    protected @Mock
    OrderEntityToOrderSummaryTransformer mockTransformer;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        this.target = new OrderServiceImpl();
        this.target.setOrderDao(mockOrderDao);
        this.target.setTransformer(mockTransformer);
    }

    @Test
    public void test_completeOrder_success() throws Exception {

        // Setup
        OrderItemEntity oiFixture1 = new OrderItemEntity();
        oiFixture1.setSku("SKU1");
        oiFixture1.setQuantity(1);

        OrderItemEntity oiFixture2 = new OrderItemEntity();
        oiFixture2.setSku("SKU2");
        oiFixture2.setQuantity(2);

        OrderEntity orderFixture = new OrderEntity();
        orderFixture.setOrderNumber(ORDER_NUMBER);
        orderFixture.setOrderItemList(new LinkedList<OrderItemEntity>());
        orderFixture.getOrderItemList().add(oiFixture1);
        orderFixture.getOrderItemList().add(oiFixture2);

        Mockito.when(mockOrderDao.findById(ORDER_ID))
                .thenReturn(orderFixture);

        // Add static mocking here
        PowerMockito.mockStatic(WarehouseManagementService.class);
        PowerMockito.when(WarehouseManagementService.sendOrder(Matchers.any(OrderMessage.class)))
                .thenReturn(true);

        // Constructor mocking
        OrderCompletionAudit auditFixture = new OrderCompletionAudit();
        PowerMockito.whenNew(OrderCompletionAudit.class).withNoArguments()
                .thenReturn(auditFixture);

        // Execution
        target.completeOrder(ORDER_ID);

        // Verification
        Mockito.verify(mockOrderDao).findById(ORDER_ID);

        PowerMockito.verifyStatic();
        ArgumentCaptor<OrderMessage> orderMessageCaptor =
                ArgumentCaptor.forClass(OrderMessage.class);

        WarehouseManagementService.sendOrder(orderMessageCaptor.capture());

        OrderMessage capturedOrderMessage = orderMessageCaptor.getValue();

        Assert.assertNotNull(capturedOrderMessage);
        Assert.assertEquals(ORDER_NUMBER, capturedOrderMessage.getOrderNumber());

        Assert.assertEquals(ORDER_NUMBER, auditFixture.getOrderNumber());
        Assert.assertNotNull(auditFixture.getCompletionDate());
    }
}
