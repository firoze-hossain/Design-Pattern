package com.roze.behavioral.strategyPattern;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
