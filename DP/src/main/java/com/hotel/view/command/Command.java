package com.hotel.view.command;

import com.hotel.facade.HotelKeeperImplementation;
import com.hotel.facade.Restaurants.Hotel;

/**
 * Command design pattern (behavioral)
 */
public abstract class Command {
    private String key;
    private String description;

    private HotelKeeperImplementation keeper;

    Command(String key, String description, HotelKeeperImplementation keeper) {
        this.key = key;
        this.description = description;
        this.keeper = keeper;
    }

    public abstract void execute();

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public HotelKeeperImplementation getKeeper(){
        return keeper;
    }
}