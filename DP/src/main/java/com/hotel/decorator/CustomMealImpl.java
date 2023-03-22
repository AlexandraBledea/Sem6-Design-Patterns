package com.hotel.decorator;

public class CustomMealImpl implements CustomMeal{

    public CustomMealImpl(){

    }

    @Override
    public String composeMeal() {
        return "Meal ";
    }
}
