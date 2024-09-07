package org.onlineShop.application.repository;

import org.onlineShop.domain.order.model.Item;
import org.onlineShop.domain.order.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryAdapter implements ItemRepository {

    private final JpaItemRepository jpaItemRepository;


    @Override
    public List<Item> findByOrderId(Long orderId) {
        return jpaItemRepository.findByOrderId(orderId);
    }
}
