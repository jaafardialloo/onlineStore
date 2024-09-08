package org.onlineShop.domain.order.enums;

import java.time.LocalDateTime;

public enum FulfilmentMethod {
    PICKUP {
        @Override
        public LocalDateTime getEstimatedDeliveryDate() {
            return LocalDateTime.now().plusDays(10);
        }
    },
    STANDARD_SHIPPING {
        @Override
        public LocalDateTime getEstimatedDeliveryDate() {
            return LocalDateTime.now().plusMonths(1);
        }
    },
    EXPRESS_SHIPPING {
        @Override
        public LocalDateTime getEstimatedDeliveryDate() {
            return LocalDateTime.now().plusDays(2);
        }
    };


    public abstract LocalDateTime getEstimatedDeliveryDate();
}
