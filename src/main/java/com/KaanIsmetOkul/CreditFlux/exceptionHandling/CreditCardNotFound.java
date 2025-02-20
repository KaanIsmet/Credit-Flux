package com.KaanIsmetOkul.CreditFlux.exceptionHandling;

public class CreditCardNotFound extends RuntimeException {
    public CreditCardNotFound(String message) {
        super(message);
    }
}
