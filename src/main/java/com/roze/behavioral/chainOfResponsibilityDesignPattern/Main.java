package com.roze.behavioral.chainOfResponsibilityDesignPattern;
//this is the design patterns of gangs of four
//this is a behavioural design pattern
public class Main {
    public static void main(String[] args) {
        //bank payment is base of payment
        PaymentHandler bankPayment = new BankPaymentHandler();
        PaymentHandler creditCardPayment = new CreditCardPaymentHandler();
        PaymentHandler paypalPayment = new PaypalPaymentHandler();
        bankPayment.setNext(creditCardPayment);
        creditCardPayment.setNext(paypalPayment);
        bankPayment.paymentAmount(700.00);
        bankPayment.paymentAmount(400.00);
        bankPayment.paymentAmount(1100.00);
        bankPayment.paymentAmount(600.00);
    }
}
