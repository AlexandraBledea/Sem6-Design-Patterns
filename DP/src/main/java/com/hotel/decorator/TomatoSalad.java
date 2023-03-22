package com.hotel.decorator;

public class TomatoSalad extends MealDecorator{

    public TomatoSalad(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithTomatoSalad();
    }

    private String composeWithTomatoSalad() {
        return "with tomato salad, ";
    }

}
