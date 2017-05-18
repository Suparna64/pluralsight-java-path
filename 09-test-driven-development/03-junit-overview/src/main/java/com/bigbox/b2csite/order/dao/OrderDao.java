package com.bigbox.b2csite.order.dao;

import java.util.List;

import com.bigbox.b2csite.common.DataAccessException;
import com.bigbox.b2csite.order.model.entity.OrderEntity;

public interface OrderDao {

	OrderEntity findById(long id) throws DataAccessException;
	OrderEntity insert(OrderEntity order) throws DataAccessException;
	OrderEntity update(OrderEntity order) throws DataAccessException;
	void remove(OrderEntity order) throws DataAccessException;
	
	List<OrderEntity> findByCustomerId(long customerId) throws DataAccessException;
	List<OrderEntity> findByOrderSource(String orderSourceCode) throws DataAccessException;
}