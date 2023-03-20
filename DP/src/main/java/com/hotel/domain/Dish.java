package com.hotel.domain;

public class Dish {

    private String name;

    private String description;

    private long price;

    private int quantity;

    public Dish(String name, String description, long price, int quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public long getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }
}


