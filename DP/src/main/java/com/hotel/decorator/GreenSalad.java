package com.hotel.decorator;

public class GreenSalad extends MealDecorator{

    public GreenSalad(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithGreenSalad();
    }

    private String composeWithGreenSalad() {
        return "with green salad, ";
    }
}
