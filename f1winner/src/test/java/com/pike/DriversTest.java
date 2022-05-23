package com.pike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class DriversTest {

    TeamEnum teamEnum;
    DriversEnum driversEnum;
    Driver ver, lec, per, merc, rus;

    @Test
    public void testConstructor1() {
        teamEnum = TeamEnum.RED_BULL;
        driversEnum = DriversEnum.VERSTAPPEN;
        int points = 110;
        ver = new Driver(teamEnum, driversEnum, points);
        assertEquals("RED_BULL", ver.getTeam());
        assertEquals("VERSTAPPEN", ver.getName());
        assertEquals(110, ver.getPoints());
    }

    @Test
    public void testConstructor2() {
        teamEnum = TeamEnum.FERRARI;
        driversEnum = DriversEnum.LECLERC;
        lec = new Driver(teamEnum, driversEnum);
        assertEquals("FERRARI", lec.getTeam());
        assertEquals("LECLERC", lec.getName());
        assertEquals(104, lec.getPoints());
    }

    @Test
    public void testConstructor3() {
        driversEnum = DriversEnum.PEREZ;
        per = new Driver(driversEnum);
        assertEquals("RED_BULL", per.getTeam());
        assertEquals("PEREZ", per.getName());
        assertEquals(85, per.getPoints());
    }

    @Test
    public void testConstructor4() {
        teamEnum = TeamEnum.MERCEDES;
        merc = new Driver(teamEnum);
        assertEquals("MERCEDES", merc.getTeam());
        assertEquals(120, merc.getPoints());
    }

    @Test
    public void testToString() {
        driversEnum = DriversEnum.RUSSELL;
        rus = new Driver(driversEnum);
        assertEquals("MERCEDES | RUSSELL | 74", rus.toString());
    }

    // @Test
    // public void testHam() {

    // }
}
