package com.roze.behavioral.strategyPattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy payStrategy;

    static {
        priceOnProducts.put(1, 2500);
        priceOnProducts.put(2, 3000);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 4500);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("Please,select a product: " + "\n" +
                        "1-Motherboard" + "\n" +
                        "2-CPU" + "\n" +
                        "3-HDD" + "\n" +
                        "4-Memory" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish to continue select products? Y/N: ");
                continueChoice = reader.readLine();

            } while (continueChoice.equalsIgnoreCase("Y"));
            if (payStrategy == null) {
                System.out.println("Please,select a payment method: " + "\n" +
                        "1-Dutch Bangla" + "\n" +
                        "2-EBL Credit Card");
                String paymentMethod = reader.readLine();
                if (paymentMethod.equals("1")) {
                    payStrategy = new DutchBanglaPay();
                } else {
                    payStrategy = new EBLCreditCardPay();
                }
            }
            order.processOrder(payStrategy);
            System.out.print("Pay " + order.getTotalCost() + " units or continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (payStrategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }

    }
}
