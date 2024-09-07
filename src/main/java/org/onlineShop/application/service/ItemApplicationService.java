package org.onlineShop.application.service;

import org.onlineShop.domain.order.model.Item;

import org.onlineShop.domain.order.repository.ItemRepository;
import org.onlineShop.domain.order.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemApplicationService implements ItemService {

    private final ItemRepository itemRepository;


    @Override
    public List<Item> findByOrderId(Long orderId) {
        return itemRepository.findByOrderId(orderId);
    }


}
