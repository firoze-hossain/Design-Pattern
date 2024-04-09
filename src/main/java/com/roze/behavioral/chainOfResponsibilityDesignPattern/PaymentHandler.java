package com.roze.behavioral.chainOfResponsibilityDesignPattern;

//this class has the properties of handling of next type of payment, if present payment type fails to handle pay
//and has a responsibility of payment
public abstract class PaymentHandler {
    protected PaymentHandler next;

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    public abstract void paymentAmount(Double amount);
}
