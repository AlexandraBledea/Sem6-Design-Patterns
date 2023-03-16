package com.hotel.facade;

import com.hotel.domain.Dish;

import java.util.ArrayList;
import java.util.List;

public class NonVeganRestaurant implements Hotel{

    public List<Dish> dishList = new ArrayList<>();

    public Dishes getMenus(){
        initializeMenu();
        return new NonVeganMenu(dishList);
    }

    public void initializeMenu(){
        this.dishList.add(new Dish("Meat Balls", "250kcal/100g", 15, 150));
        this.dishList.add(new Dish("Sushi", "150kcal/100g", 25, 200));
        this.dishList.add(new Dish("Potato chips with chicken strips", "412kcal/100g", 27, 400));

    }
}
