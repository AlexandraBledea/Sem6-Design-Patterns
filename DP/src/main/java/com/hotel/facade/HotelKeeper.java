package com.hotel.facade;

import com.hotel.facade.Dishes.NonVeganMenu;
import com.hotel.facade.Dishes.VeganMenu;
import com.hotel.facade.Dishes.Ordered;
import com.hotel.strategy.PaymentStrategy;

public interface HotelKeeper {

    VeganMenu getVeganMenu();
    NonVeganMenu getNonVeganMenu();
    long getCheck();
    void orderDish();
    void setPaymentStrategy(PaymentStrategy strategy);
    void executePaymentStrategy();
    void composeMeal(String firstComponent, String secondComponent, String saladComponent, String toppingComponent);
}
