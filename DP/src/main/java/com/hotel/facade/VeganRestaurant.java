package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.ArrayList;
import java.util.List;

public class VeganRestaurant implements Hotel{

    public List<Dish> dishList = new ArrayList<>();

    public Dishes getMenus(){
        initializeMenu();
        return new VeganMenu(dishList);
    }

    public void initializeMenu(){
        this.dishList.add(new Dish("Falafel", "150kcal/100g", 20, 150));
        this.dishList.add(new Dish("Unfished fish", "204kcal/100g", 25, 200));
        this.dishList.add(new Dish("Potato chips", "200kcal/100g", 15, 300));

    }



}
