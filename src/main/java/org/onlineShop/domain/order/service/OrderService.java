package org.onlineShop.domain.order.service;

import org.onlineShop.application.dto.OrderDTO;
import org.onlineShop.domain.order.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> saveOrders(List<OrderDTO> orders);

    Optional<Order> findOrderById(Long id);
}
