package com.roze.behavioral.chainOfResponsibilityDesignPattern;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void paymentAmount(Double amount) {
        //the condition for bank payment
        if (amount <= 500) {
            System.out.println("Paid using bank payment: $" + amount);
        } else {
            //or it will move to next payment handler
            next.paymentAmount(amount);
        }
    }
}
