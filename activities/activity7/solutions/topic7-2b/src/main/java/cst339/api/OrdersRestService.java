package cst339.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst339.business.OrdersBusinessService;
import cst339.model.OrderModel;

@RestController
@RequestMapping("/service")
public class OrdersRestService {

	@Autowired
	OrdersBusinessService ordersBusinessService;

	@GetMapping(path = "/orders")
	public ResponseEntity<?> getOrders() {
		try {
			List<OrderModel> orders = ordersBusinessService.getAllOrders();
			if (orders.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(orders, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
