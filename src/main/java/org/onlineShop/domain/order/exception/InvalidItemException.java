package org.onlineShop.domain.order.exception;

public class InvalidItemException extends RuntimeException{
    public InvalidItemException(String message) {
        super(message);
    }
}
