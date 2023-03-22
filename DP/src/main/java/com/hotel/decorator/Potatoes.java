package com.hotel.decorator;

public class Potatoes extends MealDecorator{

    public Potatoes(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithPotatoes();
    }

    private String composeWithPotatoes() {
        return "with backed potatoes, ";
    }

}
