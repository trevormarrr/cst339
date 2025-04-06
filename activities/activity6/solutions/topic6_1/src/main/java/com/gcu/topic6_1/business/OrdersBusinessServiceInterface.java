package com.gcu.topic6_1.business;

import java.util.List;

import com.gcu.topic6_1.model.OrderModel;


public interface OrdersBusinessServiceInterface {

	
	
	public void test();
	public List<OrderModel> getOrders();
	public OrderModel getOrderById(String id);
	public void init();
	public void destroy();


}
