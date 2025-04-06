package com.gcu.topic6_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.topic6_1.business.OrdersBusinessServiceInterface;
import com.gcu.topic6_1.model.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersBusinessServiceInterface ordersBusinessServiceInterface;

	@GetMapping("/display")
	public String display(Model model) {
		
		System.out.println(">>>>> OrdersController.display");

		// Get some Orders
		List<OrderModel> orders = ordersBusinessServiceInterface.getOrders();

		// Display the Orders View
		model.addAttribute("title", "MyOrders");
		model.addAttribute("orders", orders);
		return "orders";
	}
}
