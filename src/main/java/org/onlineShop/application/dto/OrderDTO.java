package org.onlineShop.application.dto;

import org.onlineShop.domain.order.enums.FulfilmentMethod;

import java.time.LocalDateTime;
import java.util.List;

public record OrderDTO(Long id, List<ItemDTO> items, FulfilmentMethod fulfillmentMethod,
                       LocalDateTime estimatedDeliveryDate) {
}
