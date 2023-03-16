package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.ArrayList;
import java.util.List;

public class Bill extends Dishes{

    public Bill(List<Dish> dishes) {
        super(dishes);
    }
}
