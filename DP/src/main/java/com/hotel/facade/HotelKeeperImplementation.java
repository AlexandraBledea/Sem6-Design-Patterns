package com.hotel.facade;

import com.hotel.facade.Dishes.NonVeganMenu;
import com.hotel.facade.Dishes.VeganMenu;
import com.hotel.facade.Dishes.Ordered;
import com.hotel.facade.Restaurants.NonVeganRestaurant;
import com.hotel.facade.Restaurants.OrderedDishes;
import com.hotel.facade.Restaurants.VeganRestaurant;
import com.hotel.logger.Logger;
import com.hotel.strategy.CreditCardStrategy;
import com.hotel.strategy.PaymentStrategy;

public class HotelKeeperImplementation implements HotelKeeper{
    private final VeganRestaurant veganRestaurant;
    private final NonVeganRestaurant nonVeganRestaurant;
    private final OrderedDishes orderedDishes;

    private final Logger logger = Logger.getInstanceOf();

    private PaymentStrategy paymentStrategy;

    public HotelKeeperImplementation(){
        veganRestaurant = new VeganRestaurant();
        nonVeganRestaurant = new NonVeganRestaurant();
        orderedDishes = new OrderedDishes();
    }

    @Override
    public VeganMenu getVeganMenu() {
        logger.log("Vegan Menu displayed");
        return (VeganMenu) veganRestaurant.getDishes();
    }

    @Override
    public NonVeganMenu getNonVeganMenu() {
        logger.log("Non Vegan Menu displayed ");
        return (NonVeganMenu) nonVeganRestaurant.getDishes();
    }

    public long getCheck() {
        return orderedDishes.getCheck();
    }

    public void orderDish(){
        this.orderedDishes.addOrderedDish();
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void executePaymentStrategy(){
        this.orderedDishes.pay();
        this.paymentStrategy.pay(getCheck());
    }

}
