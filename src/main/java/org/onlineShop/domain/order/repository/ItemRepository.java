package org.onlineShop.domain.order.repository;

import org.onlineShop.domain.order.model.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> findByOrderId(Long orderId);
}
