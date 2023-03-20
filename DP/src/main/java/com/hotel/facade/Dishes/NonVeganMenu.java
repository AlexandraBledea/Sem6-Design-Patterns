package com.hotel.facade.Dishes;

import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Dishes;

import java.util.List;

public class NonVeganMenu extends Dishes {

    public NonVeganMenu(List<Dish> dishes) {
        super(dishes);
    }

}
