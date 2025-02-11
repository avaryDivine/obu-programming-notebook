package edu.okbu.cs1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test_001()
    {
        HotelReservation r = new HotelReservation();
        r.setHotelRate(50);
        assertEquals(r.getHotelRate(), 50.0, 0.001);
    }

    @Test
    public void test_002() {
        HotelReservation r = new HotelReservation();
        r.setNumYears(30);
        assertEquals(r.getNumYears(), 30);
    }

    @Test
    public void test_003() {
        HotelReservation r = new HotelReservation();
        r.setNumYears(50);
        assertEquals(r.getHotelRate(), 75.0, 0.001);
    }

    @Test
    public void test_004() {
        AnniversaryMessage a = new AnniversaryMessage(25);
        assertEquals(a.getAnniversaryMessage(), "Your silver anniversary -- enjoy.");
    }

    @Test
    public void test_005() {
        AnniversaryMessage a = new AnniversaryMessage(1);
        assertEquals(a.getAnniversaryMessage(), "Your first year -- great!");
    }
}
