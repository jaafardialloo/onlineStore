package org.onlineShop.domain.order.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorDetails {
    private String msg;
    private String errorDetails;
}
