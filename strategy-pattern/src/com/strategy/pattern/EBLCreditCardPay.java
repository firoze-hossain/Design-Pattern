package com.strategy.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EBLCreditCardPay implements PayStrategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;


    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using credit card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = reader.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = reader.readLine();
            System.out.print("Enter the cvv code: ");
            String cvv = reader.readLine();
            card = new CreditCard(number, date, cvv);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
