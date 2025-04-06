package com.gcu.topic6_1.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gcu.topic6_1.data.entity.OrderEntity;


public interface OrdersRepository extends MongoRepository<OrderEntity, String> {

	OrderEntity getOrderById(String id);

	@Override
	
	// Perform the Query on the database
	@Query(value = "SELECT * FROM ORDERS")
	
	// Returns a ResultSet of OrderEntities
	public List<OrderEntity> findAll();
}
