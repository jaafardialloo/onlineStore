package org.onlineShop.domain.order.repository;

import org.onlineShop.domain.order.model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> saveAll(List<Order> orders);

    Order getById(Long id);
}
