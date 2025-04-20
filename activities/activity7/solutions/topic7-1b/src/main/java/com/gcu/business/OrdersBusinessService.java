package com.gcu.business;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import com.gcu.model.OrderModel;

@Service
public class OrdersBusinessService {
    private OrdersRepository ordersRepository;

    public OrdersBusinessService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<OrderModel> getAllOrders() {
        List<OrderModel> orderModels = new ArrayList<>();
        List<OrderEntity> orderEntities = ordersRepository.findAll();
        
        for(OrderEntity entity : orderEntities) {
            orderModels.add(new OrderModel(
                entity.getId(),
                entity.getOrderNo(),
                entity.getProductName(),
                entity.getPrice(),
                entity.getQuantity()
            ));
        }
        return orderModels;
    }
}