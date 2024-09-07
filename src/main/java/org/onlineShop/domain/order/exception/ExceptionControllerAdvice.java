package org.onlineShop.domain.order.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {


    @ExceptionHandler(InvalidItemException.class)
    public ResponseEntity<ErrorDetails> invalidItemHandler(InvalidItemException e) {
        return handleException(e.getMessage(), e.getCause().getMessage());
    }


    private ResponseEntity<ErrorDetails> handleException(String message, String errorDetails) {
        ErrorDetails error = new ErrorDetails();
        error.setMsg(message);
        error.setErrorDetails(errorDetails);
        return ResponseEntity.badRequest().body(error);
    }


}
