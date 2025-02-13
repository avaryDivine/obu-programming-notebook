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

    @Test
    public void test_006() {
        Insurance i = new Insurance(15, 0.0);
        assertEquals(i.getPrice(), 0.0, 0.01);
    }

    @Test
    public void test_007() {
        Insurance i = new Insurance(45, 0.0);
        assertEquals(i.getPrice(), 2100.0, 0.01);
    }

    @Test
    public void test_008() {
        CableTVChannels c = new CableTVChannels();
        c.setUserChannel(399);
        assertEquals(c.getChannelType(), 's');
    }

    @Test
    public void test_009() {
        CableTVChannels c = new CableTVChannels();
        c.setUserChannel(1500);
        assertEquals(c.getChannelType(), 'e');
    }

    @Test
    public void test_010() {
        MovieTicketPrice m = new MovieTicketPrice(7, 0);
        assertEquals(m.getTicketPrice(), 11);
    }

    @Test
    public void test_011() {
        MovieTicketPrice m = new MovieTicketPrice(80, 0);
        assertEquals(m.getTicketPrice(), 12);
    }

    @Test
    public void test_012() {
        MovieTicketPrice m = new MovieTicketPrice(33, 0);
        assertEquals(m.getTicketPrice(), 14);
    }



}
