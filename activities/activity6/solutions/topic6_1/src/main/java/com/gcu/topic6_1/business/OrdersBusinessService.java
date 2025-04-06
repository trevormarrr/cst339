package com.gcu.topic6_1.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.topic6_1.data.OrdersDataService;
import com.gcu.topic6_1.data.entity.OrderEntity;
import com.gcu.topic6_1.model.OrderModel;



public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Autowired
	private OrdersDataService service;

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

		System.out.println("OrdersBusinessService.getOrders()");

		// Get all of the Entity orders
		List<OrderEntity> ordersEntity = service.findAll();

		// Iterate over the Entity Orders and create a list of Domain Orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for (OrderEntity entity : ordersEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(),
					entity.getPrice(), entity.getQuantity()));
		}

		return ordersDomain;
	}

	@Override
	public OrderModel getOrderById(String id) {
		OrderEntity orderEntity = service.findById(id);
		if (orderEntity == null) {
			return null;
		}
		return new OrderModel(orderEntity.getId(), orderEntity.getOrderNo(), orderEntity.getProductName(),
				orderEntity.getPrice(), orderEntity.getQuantity());
	}

}
