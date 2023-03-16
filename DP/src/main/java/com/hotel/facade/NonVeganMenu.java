package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.List;

public class NonVeganMenu extends Dishes{

    public NonVeganMenu(List<Dish> dishes) {
        super(dishes);
    }

}
