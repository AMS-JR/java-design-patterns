package com.eca.logistics_transport.product;

public class Plane implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Plane!");
    }
}
