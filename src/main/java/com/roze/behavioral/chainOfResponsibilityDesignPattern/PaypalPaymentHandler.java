package com.roze.behavioral.chainOfResponsibilityDesignPattern;

public class PaypalPaymentHandler extends PaymentHandler {
    @Override
    public void paymentAmount(Double amount) {
        //the condition for paypal payment
        if (amount <= 1500) {
            System.out.println("Paid using Paypal: $" + amount);
        } else {
            //or it will move to next payment handler
            next.paymentAmount(amount);
        }
    }
}
