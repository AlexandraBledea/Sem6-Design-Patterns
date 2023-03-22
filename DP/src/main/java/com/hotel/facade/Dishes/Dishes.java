package com.hotel.facade.Dishes;

import com.hotel.domain.Dish;

import java.util.List;

public class Dishes {

    public List<Dish> dishes;

    public Dishes(List<Dish> dishes){
        this.dishes = dishes;
    }


    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        for(Dish d: this.dishes){
            result.append("Name: " ).append(d.getName());
            result.append(", description: ").append(d.getDescription());
            result.append(", quantity: " ).append(d.getQuantity());
            result.append(", price: ").append(d.getPrice());
            result.append("\n");
        }

        return result.toString();
    }
}
