package com.hotel.facade;

import com.hotel.facade.Dishes.NonVeganMenu;
import com.hotel.facade.Dishes.VeganMenu;
import com.hotel.facade.Dishes.Ordered;

public interface HotelKeeper {

    public VeganMenu getVeganMenu();
    public NonVeganMenu getNonVeganMenu();
}
