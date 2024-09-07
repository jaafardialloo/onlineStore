package org.onlineShop.application.repository;

import org.onlineShop.domain.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderRepository extends JpaRepository<Order, Long> {

    Order findByOrderId(Long orderId);
}
