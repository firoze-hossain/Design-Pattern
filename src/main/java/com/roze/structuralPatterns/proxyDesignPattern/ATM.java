package com.roze.structuralPatterns.proxyDesignPattern;
//this is the proxy of bank account
public class ATM implements Account{
    //all the validation is done here
    //before the creation of actual object all validation should be done
    //like pin number check then etc
    //then in last bank account object is created
    @Override
    public void withdraw() {
        //this is the actual object
        BankAccount bankAccount=new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
