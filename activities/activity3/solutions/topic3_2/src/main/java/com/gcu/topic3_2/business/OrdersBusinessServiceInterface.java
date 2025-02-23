package com.gcu.topic3_2.business;

import java.util.List;

import com.gcu.topic3_2.model.OrderModel;

public interface OrdersBusinessServiceInterface {

	public void init();
	public void destroy();
	public void test();
	public List<OrderModel> getOrders();
}
