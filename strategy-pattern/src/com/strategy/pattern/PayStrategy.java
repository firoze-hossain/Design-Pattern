package com.strategy.pattern;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
