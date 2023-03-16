package com.hotel.facade;

public class HotelKeeperImplementation implements HotelKeeper{
    OrderedDishes o = new OrderedDishes();

    @Override
    public VeganMenu getVeganMenu() {
        VeganRestaurant v = new VeganRestaurant();

        return (VeganMenu) v.getMenus();
    }

    @Override
    public NonVeganMenu getNonVeganMenu() {
        NonVeganRestaurant nv = new NonVeganRestaurant();

        return (NonVeganMenu) nv.getMenus();
    }

    @Override
    public Bill getBill() {
        return (Bill) o.getMenus();
    }

    public void orderDish(int number,){

    }

}
