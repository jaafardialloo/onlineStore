package org.onlineShop.application.controller;

import lombok.AllArgsConstructor;
import org.onlineShop.application.dto.ItemDTO;
import org.onlineShop.application.dto.OrderDTO;
import org.onlineShop.application.mapper.ItemMapper;
import org.onlineShop.domain.order.model.Order;
import org.onlineShop.domain.order.service.ItemService;
import org.onlineShop.domain.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    private final ItemService itemService;

    private final ItemMapper itemMapper;

    @PostMapping
    public ResponseEntity<List<Order>> saveAll(@RequestBody List<OrderDTO> orders) {

        return ResponseEntity.of(Optional.ofNullable(orderService.saveOrders(orders)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> getById(@PathVariable Long id) {

        return ResponseEntity.of(Optional.ofNullable(orderService.findOrderById(id)));
    }

    @GetMapping("/{id}/items")
    public ResponseEntity<List<ItemDTO>> getItemsByOrder(@PathVariable Long id) {
        return ResponseEntity.of(Optional.ofNullable(
                itemMapper.toDTOs(itemService.findByOrderId(id))));
    }
}
