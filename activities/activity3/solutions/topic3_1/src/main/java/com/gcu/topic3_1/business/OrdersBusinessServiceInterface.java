package com.gcu.topic3_1.business;

import java.util.List;

import com.gcu.topic3_1.model.OrderModel;

public interface OrdersBusinessServiceInterface {

	public void init();
	public void destroy();
	public void test();
	public List<OrderModel> getOrders();
}
