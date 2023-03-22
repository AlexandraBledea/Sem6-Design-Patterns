package com.hotel.decorator;

public class Beef extends MealDecorator {

    public Beef(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithBeef();
    }

    private String composeWithBeef() {
        return "with beef, ";
    }
}
