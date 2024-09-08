package org.onlineShop.application.repository;

import org.onlineShop.domain.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaOrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findOrderById(Long orderId);
}
