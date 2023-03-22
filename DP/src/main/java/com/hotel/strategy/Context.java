package com.hotel.strategy;

public class Context {

    private PaymentStrategy paymentStrategy;

    public Context(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(long amount){
        this.paymentStrategy.pay(amount);
    }

}
