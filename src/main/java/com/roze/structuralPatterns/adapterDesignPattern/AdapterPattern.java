package com.roze.structuralPatterns.adapterDesignPattern;

//Client Class
public class AdapterPattern {

    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
