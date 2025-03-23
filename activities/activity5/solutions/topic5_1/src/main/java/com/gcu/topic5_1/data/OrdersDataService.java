package com.gcu.topic5_1.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.topic5_1.data.entity.OrderEntity;
import com.gcu.topic5_1.data.repository.OrdersRepository;

@Service
public class OrdersDataService implements DataAccessInterface<Object> {

	@Autowired
	private OrdersRepository ordersRepository;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	public OrdersDataService(OrdersRepository ordersRepository, DataSource dataSource) {
		this.ordersRepository = ordersRepository;
		this.dataSource = dataSource;

	}

	public OrdersDataService(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	public OrdersDataService() {
		super();
	}

	@Override
	public List findAll() {

		List<OrderEntity> orders = new ArrayList<>();

		try {
			// Get all of the Entity Orders
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();

			// Convert to a List and return the List
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return orders;

	}

	@Override
	public OrderEntity findById(String id) {
		
		return ordersRepository.getOrderById(id);
	}

	@Override
	public boolean update(Object t) {
		
		return false;
	}

	@Override
	public boolean delete(Object t) {
		
		return false;
	}

	@Override
	public boolean create(OrderEntity order) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'create'");
	}

	


}
