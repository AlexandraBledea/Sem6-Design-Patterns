package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.List;

public class VeganMenu extends Dishes{

    public VeganMenu(List<Dish> dishes) {
        super(dishes);
    }
}
