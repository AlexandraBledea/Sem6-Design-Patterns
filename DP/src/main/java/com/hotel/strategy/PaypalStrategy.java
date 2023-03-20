package com.hotel.strategy;

public class PaypalStrategy implements PaymentStrategy{

    private String email;
    private String password;

    public PaypalStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(long amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
