package com.roze.behavioral.chainOfResponsibilityDesignPattern;

public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void paymentAmount(Double amount) {
        //the condition for Credit Card payment
        if(amount<=1000){
            System.out.println("Paid using Credit Card: $"+amount);
        }else{
            //or it will move to next payment handler
            next.paymentAmount(amount);
        }
    }
}
