package com.gcu.topic4_1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.topic4_1.model.OrderList;
import com.gcu.topic4_1.model.OrderModel;



@RestController

// Provides the URL path to the server, e.g. server:port/service
@RequestMapping("/service")
public class OrdersRestService {

	@Autowired
	private OrdersBusinessServiceInterface ordersBusinessServiceInterface;

	// Appends the service path with /getjson, e.g. server:port/service/getjson
	// Returns a JSON Payload response
	@GetMapping(path = "/getjson", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<OrderModel> getOrdersAsJson() {
		return ordersBusinessServiceInterface.getOrders();
	}

	// Appends the service path with /getxml, e.g. server:port/service/getxml
	// Returns an XML Payload response
	@GetMapping(path = "/getxml", produces = { MediaType.APPLICATION_XML_VALUE })
	public OrderList getOrdersAsXml() {
		OrderList orderList = new OrderList();
		orderList.setOrders(ordersBusinessServiceInterface.getOrders());
		return orderList;
	}
}
