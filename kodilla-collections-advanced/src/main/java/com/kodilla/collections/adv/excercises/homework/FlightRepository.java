package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight>flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Krakow","Berlin"));
        flightsTable.add(new Flight("Moscow","Warsaw"));
        flightsTable.add(new Flight("Warsaw","Paris"));
        flightsTable.add(new Flight("Warsaw","Rome"));
        flightsTable.add(new Flight("Rome","Warsaw"));
        return flightsTable;
    }
}
