package com.gcu.topic4_1.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.topic4_1.data.entity.OrderEntity;



public class OrderRowMapper implements RowMapper<OrderEntity> {

	@Override
	public OrderEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		return new OrderEntity(resultSet.getLong("ID"), resultSet.getString("ORDER_NO"),
				resultSet.getString("PRODUCT_NAME"), resultSet.getFloat("PRICE"), resultSet.getInt("QUANTITY"));
	}
}
