package org.onlineShop.application.repository;

import lombok.RequiredArgsConstructor;
import org.onlineShop.domain.order.model.Order;
import org.onlineShop.domain.order.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryAdapter implements OrderRepository {

    private final JpaOrderRepository jpaOrderRepository;


    @Override
    public List<Order> saveAll(List<Order> orders) {
        return jpaOrderRepository.saveAll(orders);
    }

    @Override
    public Order getById(Long id) {
        return jpaOrderRepository.findOrderById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }
}
