package com.gcu.topic3_1.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.topic3_1.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void init() {
		System.out.println("OrdersBusinessService.init()");

	}

	@Override
	public void destroy() {
		System.out.println("OrdersBusinessService.destroy()");

	}

	@Override
	public void test() {

		System.out.println("OrdersBusinessService.test()");

	}

	@Override
	public List<OrderModel> getOrders() {

		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000000", "Product 0", 0.00f, 0));
		orders.add(new OrderModel(1L, "0000000001", "Product 1", 1.00f, 1));
		orders.add(new OrderModel(2L, "0000000002", "Product 2", 2.00f, 2));
		orders.add(new OrderModel(3L, "0000000003", "Product 3", 3.00f, 3));
		orders.add(new OrderModel(4L, "0000000004", "Product 4", 4.00f, 4));
		return orders;
	}

}
