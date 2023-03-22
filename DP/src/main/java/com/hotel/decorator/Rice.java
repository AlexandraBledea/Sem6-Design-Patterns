package com.hotel.decorator;

public class Rice extends MealDecorator{

    public Rice(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithRice();
    }

    private String composeWithRice() {
        return "with rice, ";
    }
}
