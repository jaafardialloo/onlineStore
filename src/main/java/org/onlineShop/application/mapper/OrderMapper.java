package org.onlineShop.application.mapper;

import org.onlineShop.application.dto.OrderDTO;
import org.onlineShop.domain.order.model.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDTO(Order order);

    Order toModel(OrderDTO orderDTO);

    List<OrderDTO> toDTOs(List<Order> orders);

    List<Order> toModels(List<OrderDTO> orderDTOS);


}
