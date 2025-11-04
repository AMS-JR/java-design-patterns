package main.java.logistics_transport;

import main.java.logistics_transport.factory.AirLogistics;
import main.java.logistics_transport.factory.Logistics;
import main.java.logistics_transport.factory.RoadLogistics;
import main.java.logistics_transport.factory.SeaLogistics;

public class LogisticsTransportApplication {
    public static void main(String[] args) {
        Logistics airLogistics = new AirLogistics();
        airLogistics.process();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.process();

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.process();
    }
}
