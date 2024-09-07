package org.onlineShop.application.repository;

import org.onlineShop.domain.order.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JpaItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByOrderId(Long id);
}
