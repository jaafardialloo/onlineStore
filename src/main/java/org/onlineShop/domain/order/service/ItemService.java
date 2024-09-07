package org.onlineShop.domain.order.service;

import org.onlineShop.domain.order.model.Item;

import java.util.List;

public interface ItemService {

    List<Item> findByOrderId(Long orderId);
}
