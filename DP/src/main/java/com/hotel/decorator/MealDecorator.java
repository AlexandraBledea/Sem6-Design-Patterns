package com.hotel.decorator;

public abstract class MealDecorator implements CustomMeal{

    protected CustomMeal customMeal;

    public MealDecorator(CustomMeal customMeal){
        this.customMeal = customMeal;
    }

    @Override
    public String composeMeal(){
        return customMeal.composeMeal();
    }

}
