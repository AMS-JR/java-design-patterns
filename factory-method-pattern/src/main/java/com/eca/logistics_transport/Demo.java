package com.eca.logistics_transport;

import com.eca.logistics_transport.factory.AirLogistics;
import com.eca.logistics_transport.factory.Logistics;
import com.eca.logistics_transport.factory.RoadLogistics;
import com.eca.logistics_transport.factory.SeaLogistics;

public class Demo {
    public static void main(String[] args) {
        Logistics airLogistics = new AirLogistics();
        airLogistics.process();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.process();

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.process();
    }
}
