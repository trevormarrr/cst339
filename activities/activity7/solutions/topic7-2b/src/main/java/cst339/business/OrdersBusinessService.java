package cst339.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst339.data.entity.OrderEntity;
import cst339.data.repository.OrdersRepository;
import cst339.model.OrderModel;

@Service
public class OrdersBusinessService {

	@Autowired
	private OrdersRepository ordersRepository;

	/**
	 * Constructor Injection
	 */
	public OrdersBusinessService(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	/**
	 * Get all Orders from the database
	 */
	public List<OrderModel> getAllOrders() {
		// Get all the Entity Users
		List<OrderEntity> ordersEntity = ordersRepository.findAll();
		// Iterate over the Entity Users and create a list of Domain Users
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for (OrderEntity orderEntity : ordersEntity) {
			ordersDomain.add(new OrderModel(orderEntity.getId(), orderEntity.getOrderNo(), orderEntity.getProductName(),
					orderEntity.getPrice(), orderEntity.getQuantity()));
		}

		// Return list of Domain Users
		return ordersDomain;
	}
}
