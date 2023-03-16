package com.hotel.facade;

public interface HotelKeeper {

    public VeganMenu getVeganMenu();
    public NonVeganMenu getNonVeganMenu();

    public Bill getBill();
}
