package com.strategy.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DutchBanglaPay implements PayStrategy {
    private static final Map<String, String> Data_Base = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        Data_Base.put("firoze89", "firoze.hossain@yahoo.com");
        Data_Base.put("firoze90", "firoze@gmail.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using DutchBangla.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = reader.readLine();
                System.out.print("Enter the password: ");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    private boolean verify() {
        setSignedIn(email.equals(Data_Base.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;

    }
}
