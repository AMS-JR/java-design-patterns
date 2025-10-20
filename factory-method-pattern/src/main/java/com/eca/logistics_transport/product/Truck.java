package com.eca.logistics_transport.product;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by Truck!");
    }
}
