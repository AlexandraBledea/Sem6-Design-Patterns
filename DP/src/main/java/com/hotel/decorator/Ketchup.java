package com.hotel.decorator;

public class Ketchup extends MealDecorator{

    public Ketchup(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithKetchup();
    }

    private String composeWithKetchup() {
        return "with ketchup as topping.";
    }
}
