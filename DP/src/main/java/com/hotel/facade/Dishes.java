package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.List;

public abstract class Dishes {

    public List<Dish> menu;

    public Dishes(List<Dish> dishes){
        this.menu = dishes;
    }

}
