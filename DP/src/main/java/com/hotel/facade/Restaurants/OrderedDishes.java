package com.hotel.facade.Restaurants;

import com.hotel.decorator.*;
import com.hotel.domain.Dish;
import com.hotel.facade.Dishes.Ordered;
import com.hotel.facade.Dishes.Dishes;

import java.util.ArrayList;
import java.util.List;

public class OrderedDishes{

    long totalPrice;

    public OrderedDishes(){
        this.totalPrice = 0;
    }

    public void addOrderedDish(){
        totalPrice += 20;
    }

    public long getCheck(){
        return totalPrice;
    }

    public void pay(){
        totalPrice = 0;
    }

    public void composeMeal(String firstComponent, String secondComponent, String saladComponent, String toppingComponent){
        CustomMeal first;

        CustomMeal second;

        CustomMeal third;

        CustomMeal finalMeal;

        switch (firstComponent){
            case "1" -> first = new Rice(new CustomMealImpl());
            case "2" -> first = new GrilledVegetables(new CustomMealImpl());
            case "3" -> first = new Potatoes(new CustomMealImpl());
            default -> first = new CustomMealImpl();
        }

        switch (secondComponent){
            case "1" -> second = new Chicken(first);
            case "2" -> second = new Beef(first);
            case "3" -> second = new Pork(first);
            case "4" -> second = new Falafel(first);
            default -> second = first;
        }

        switch (saladComponent){
            case "1" -> third = new GreenSalad(second);
            case "2" -> third = new TomatoSalad(second);
            default -> third = second;
        }

        switch (toppingComponent){
            case "1" -> finalMeal = new Mayonnaise(third);
            case "2" -> finalMeal = new Ketchup(third);
            default -> finalMeal = third;
        }

        System.out.println("The meal you composed and ordered: " + finalMeal.composeMeal());
    }

}
