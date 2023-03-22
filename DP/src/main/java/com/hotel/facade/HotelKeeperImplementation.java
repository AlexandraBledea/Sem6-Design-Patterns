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
        logger.log("HotelKeeperImplementation - Vegan Menu displayed");
        return (VeganMenu) veganRestaurant.getDishes();
    }

    @Override
    public NonVeganMenu getNonVeganMenu() {
        logger.log("HotelKeeperImplementation - Non Vegan Menu displayed ");
        return (NonVeganMenu) nonVeganRestaurant.getDishes();
    }

    public long getCheck() {
        logger.log("HotelKeeperImplementation - Check returned");
        return orderedDishes.getCheck();
    }

    public void orderDish(){
        logger.log("HotelKeeperImplementation - Dish order to be made");
        this.orderedDishes.addOrderedDish();
        logger.log("HotelKeeperImplementation - Dish ordered");
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        logger.log("HotelKeeperImplementation - payment method to be set");
        this.paymentStrategy = strategy;
        logger.log("HotelKeeperImplementation - payment method set");
    }

    public void executePaymentStrategy(){
        logger.log("HotelKeeperImplementation - payment to be done");
        this.paymentStrategy.pay(getCheck());
        this.orderedDishes.pay();
        logger.log("HotelKeeperImplementation - payment made");
    }

}
