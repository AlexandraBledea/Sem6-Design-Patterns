package com.hotel.decorator;

public class Chicken extends MealDecorator{

    public Chicken(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithChicken();
    }

    private String composeWithChicken() {
        return "with chicken, ";
    }
}
