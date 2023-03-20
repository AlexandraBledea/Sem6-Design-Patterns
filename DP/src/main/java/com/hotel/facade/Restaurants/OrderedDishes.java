package com.hotel.facade.Restaurants;

import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Ordered;
import com.hotel.facade.Dishes.Dishes;

import java.util.ArrayList;
import java.util.List;

public class OrderedDishes{

    long totalPrice;

    public OrderedDishes(){
        this.totalPrice = 0;
    }

    public void addOrderedDish(){
        totalPrice += 20;
    }

    public long getCheck(){
        return totalPrice;
    }

    public void pay(){
        totalPrice = 0;
    }

}
