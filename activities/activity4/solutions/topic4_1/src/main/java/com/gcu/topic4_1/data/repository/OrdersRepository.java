package com.gcu.topic4_1.data.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.gcu.topic4_1.data.entity.OrderEntity;


public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {

	@Override
	
	// Perform the Query on the database
	@Query(value = "SELECT * FROM ORDERS")
	
	// Returns a ResultSet of OrderEntities
	public List<OrderEntity> findAll();
}
