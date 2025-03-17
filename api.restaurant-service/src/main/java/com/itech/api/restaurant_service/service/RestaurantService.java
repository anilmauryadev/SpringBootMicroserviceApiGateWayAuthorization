package com.itech.api.restaurant_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itech.api.restaurant_service.dao.RestaurantOrderDAO;
import com.itech.api.restaurant_service.dto.OrderResponseDTO;

@Service
public class RestaurantService {
	
    @Autowired
    private RestaurantOrderDAO orderDAO;

    public String greeting() {
        return "Welcome to Swiggy Restaurant service";
    }

    public OrderResponseDTO getOrder(String orderId) {
        return orderDAO.getOrders(orderId);
    }
}