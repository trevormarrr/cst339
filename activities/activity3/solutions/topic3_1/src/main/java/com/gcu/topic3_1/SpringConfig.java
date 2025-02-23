package com.gcu.topic3_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.topic3_1.business.OrdersBusinessService;
import com.gcu.topic3_1.business.AnotherOrdersBusinessService;
import com.gcu.topic3_1.business.OrdersBusinessServiceInterface;


@Configuration
public class SpringConfig {

	@Bean(name="ordersBusinessServce", initMethod="init", destroyMethod="destroy")
//	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
//	@RequestScope
	@SessionScope
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		
		return new OrdersBusinessService();
		// return new AnotherOrdersBusinessService();
	}
}
