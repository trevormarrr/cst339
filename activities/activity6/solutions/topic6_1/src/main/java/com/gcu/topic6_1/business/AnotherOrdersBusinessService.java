package com.gcu.topic6_1.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.topic6_1.model.OrderModel;


public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void init() {
		System.out.println("AnotherOrdersBusinessService.init()");

	}

	@Override
	public void destroy() {
		System.out.println("AnotherOrdersBusinessService.destroy()");

	}

	@Override
	public void test() {

		System.out.println("AnotherOrdersBusinessService.test()");

	}

	@Override
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		return orders;
	}

	@Override
	public OrderModel getOrderById(String id) {
		return null;
	}
}
