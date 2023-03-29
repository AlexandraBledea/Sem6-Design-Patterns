package com.hotel.facade.Restaurants;

import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Dishes;
import com.hotel.facade.Dishes.VeganMenu;

import java.util.ArrayList;
import java.util.List;

public class VeganRestaurant implements Hotel {

    List<Dish> dishList = new ArrayList<>();

    public Dishes getDishes(){
        initializeMenu();
        return new VeganMenu(dishList);
    }

    private void initializeMenu(){
        this.dishList.add(new Dish("Falafel", "150kcal/100g", 20, 150));
        this.dishList.add(new Dish("Unfished fish", "204kcal/100g", 20, 200));
        this.dishList.add(new Dish("Potato chips", "200kcal/100g", 20, 300));

    }



}
