package com.hotel.view.command;

import com.hotel.facade.HotelKeeperImplementation;

public class GetCheckCommand extends Command{

    public GetCheckCommand(String key, String description, HotelKeeperImplementation keeper){
        super(key, description, keeper);
    }

    @Override
    public void execute() {

        System.out.println("Here is the check: " + this.getKeeper().getCheck() + "$");
    }


}
