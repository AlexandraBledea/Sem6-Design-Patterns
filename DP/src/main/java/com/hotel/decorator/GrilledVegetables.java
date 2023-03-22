package com.hotel.decorator;

public class GrilledVegetables extends MealDecorator{

    public GrilledVegetables(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithGrilledVegetables();
    }

    private String composeWithGrilledVegetables() {
        return "with grilled vegetables, ";
    }
}
