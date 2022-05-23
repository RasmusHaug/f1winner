package com.pike;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class DriversEnumTest {
    
    DriversEnum driver1, driver2, driver3, driver4, driver5;

    @Test
    public void testEnumVer() {
        driver1 = DriversEnum.VERSTAPPEN;
        assertEquals(DriversEnum.VERSTAPPEN, driver1);
    }
    
    @Test
    public void testEnumLec() {
        driver1 = DriversEnum.VERSTAPPEN;
        driver2 = DriversEnum.LECLERC;
        assertEquals(DriversEnum.LECLERC, driver2);
        assertEquals(DriversEnum.VERSTAPPEN, driver1);
    }
}
