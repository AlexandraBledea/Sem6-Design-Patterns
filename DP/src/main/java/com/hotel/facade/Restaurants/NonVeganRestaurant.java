package com.hotel.facade.Restaurants;

import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Dishes;
import com.hotel.facade.Dishes.NonVeganMenu;

import java.util.ArrayList;
import java.util.List;

public class NonVeganRestaurant implements Hotel {

    List<Dish> dishList = new ArrayList<>();

    public Dishes getDishes(){
        initializeMenu();
        return new NonVeganMenu(dishList);
    }

    public void initializeMenu(){
        this.dishList.add(new Dish("Meat Balls", "250kcal/100g", 20, 150));
        this.dishList.add(new Dish("Sushi", "150kcal/100g", 20, 200));
        this.dishList.add(new Dish("Potato chips with chicken strips", "412kcal/100g", 20, 400));

    }
}
