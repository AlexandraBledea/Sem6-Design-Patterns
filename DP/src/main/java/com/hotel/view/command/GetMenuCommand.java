package com.hotel.view.command;

import com.hotel.facade.HotelKeeperImplementation;

import java.util.Scanner;

public class GetMenuCommand extends Command{

    public GetMenuCommand(String key, String description) {
        super(key, description);
    }

    @Override
    public void execute() {
        HotelKeeperImplementation keeper = new HotelKeeperImplementation();

        System.out.println("Choose the restaurant: ");
        System.out.println("1. Vegan");
        System.out.println("2. Non Vegan");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> System.out.println(keeper.getVeganMenu().toString());
            case "2" -> System.out.println(keeper.getNonVeganMenu().toString());
            default -> System.out.println("Invalid option");
        }
    }
}
