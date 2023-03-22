package com.hotel.decorator;

public class Pork extends MealDecorator{

    public Pork(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithPork();
    }

    private String composeWithPork() {
        return "with pork";
    }
}
