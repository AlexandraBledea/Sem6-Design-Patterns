package com.hotel.decorator;

public class Falafel extends MealDecorator{

    public Falafel(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithFalafel();
    }

    private String composeWithFalafel() {
        return "with falafel, ";
    }
}
