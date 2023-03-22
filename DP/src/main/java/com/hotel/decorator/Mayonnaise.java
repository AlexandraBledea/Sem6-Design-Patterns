package com.hotel.decorator;

public class Mayonnaise extends MealDecorator{

    public Mayonnaise(CustomMeal customMeal) {
        super(customMeal);
    }

    public String composeMeal() {
        return super.composeMeal() + composeWithMayonnaise();
    }

    private String composeWithMayonnaise() {
        return "with mayonnaise as topping.";
    }

}
