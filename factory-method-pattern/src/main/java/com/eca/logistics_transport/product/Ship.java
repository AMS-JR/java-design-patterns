package com.eca.logistics_transport.product;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Ship!");
    }
}
