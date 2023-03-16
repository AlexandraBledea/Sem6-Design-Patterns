package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.ArrayList;
import java.util.List;

public class OrderedDishes{

    List<Dish> orderedDishes = new ArrayList<>();

    public Dishes getMenus(){
        return new Bill(orderedDishes);
    }

    public void addOrderedDish(Dish d){
        orderedDishes.add(d);
    }

}
