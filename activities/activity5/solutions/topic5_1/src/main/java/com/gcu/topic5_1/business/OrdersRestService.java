package com.gcu.topic5_1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.topic5_1.model.OrderList;
import com.gcu.topic5_1.model.OrderModel;

@RestController
@RequestMapping("/service")
public class OrdersRestService {

    @Autowired
    private OrdersBusinessServiceInterface ordersBusinessServiceInterface;

    @GetMapping(path = "/getjson", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<OrderModel> getOrdersAsJson() {
        return ordersBusinessServiceInterface.getOrders();
    }

    @GetMapping(path = "/getxml", produces = { MediaType.APPLICATION_XML_VALUE })
    public OrderList getOrdersAsXml() {
        OrderList orderList = new OrderList();
        orderList.setOrders(ordersBusinessServiceInterface.getOrders());
        return orderList;
    }

    @GetMapping(path = "/getorder/{id}")
    public ResponseEntity<?> getOrder(@PathVariable("id") String id) {
        try {
            OrderModel order = ordersBusinessServiceInterface.getOrderById(id);
            if (order == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}