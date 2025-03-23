package com.gcu.topic5_1.business;

import java.util.List;

import com.gcu.topic5_1.model.OrderModel;


public interface OrdersBusinessServiceInterface {

	
	
	public void test();
	public List<OrderModel> getOrders();
	public OrderModel getOrderById(String id);
	public void init();
	public void destroy();


}
