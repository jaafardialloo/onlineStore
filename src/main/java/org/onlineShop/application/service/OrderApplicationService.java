package org.onlineShop.application.service;

import org.onlineShop.application.dto.OrderDTO;
import org.onlineShop.application.mapper.OrderMapper;
import org.onlineShop.domain.order.model.Order;
import org.onlineShop.domain.order.repository.OrderRepository;
import org.onlineShop.domain.order.service.OrderService;
import org.onlineShop.domain.order.exception.InvalidItemException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderApplicationService implements OrderService {


    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Transactional
    @Override
    public List<Order> saveOrders(List<OrderDTO> ordersDtoes) {
        List<Order> orders = orderMapper.toModels(ordersDtoes);
        if (orders.stream().anyMatch(order -> !order.isValidOrder())) {
            throw new InvalidItemException("Invalid order, one of the required field is empty or negative");
        }
        orders.forEach(Order::addOrderToItems);
        return orderRepository.saveAll(orders);
    }

    @Override
    public Optional<Order> findOrderById(Long id) {
        return Optional.ofNullable(orderRepository.getById(id));
    }
}
