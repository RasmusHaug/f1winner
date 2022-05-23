package com.pike;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class App 
{
    int[] racePoints = {25,18,15,12,10,8,6,4,2,1};
    int currentRace = 5;
    int maxRaces = 21;

    public static void main( String[] args ) {
        ArrayList<Driver> drivers = generateDrivers();
        for (Driver driver : drivers) {
            System.out.println(driver.toString());
        }
    }

    private static ArrayList<Driver> generateDrivers() {
        ArrayList<Driver> drivers = new ArrayList<Driver>();
        EnumSet.allOf(DriversEnum.class)
            .forEach(driver -> {
                drivers.add(new Driver(driver));
            });
        return drivers;
    }
}
