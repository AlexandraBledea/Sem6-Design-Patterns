package com.hotel.facade.Dishes;

import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Dishes;

import java.util.List;

public class VeganMenu extends Dishes {

    public VeganMenu(List<Dish> dishes) {
        super(dishes);
    }
}
