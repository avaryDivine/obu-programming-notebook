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

    @Test
    public void test_013() {
        Toll t =  new Toll(5,0,2);
        assertEquals(t.getTollAmount(), 1.55, 0.01);
    }

    @Test
    public void test_014() {
        Toll t =  new Toll(16,0,1);
        assertEquals(t.getTollAmount(), 2.35, 0.01);
    }

    @Test
    public void test_015() {
        Toll t =  new Toll(13,1,2);
        assertEquals(t.getTollAmount(), 3.45, 0.01);
    }

    @Test
    public void test_016() {
        Toll t =  new Toll(20,1,1);
        assertEquals(t.getTollAmount(), 3.05, 0.01);
    }

    @Test
    public void test_017() {
        Toll t =  new Toll(9,0,7);
        assertEquals(t.getTollAmount(), 2.32, 0.01);
    }

    @Test
    public void test_018() {
        Toll t =  new Toll(15,1,5);
        assertEquals(t.getTollAmount(), 0.0, 0.01);
    }

    @Test
    public void test_019() {
        Toll t =  new Toll(5,0,6);
        assertEquals(t.getTollAmount(), 0.0, 0.001);
    }

    @Test
    public void test_020() {
        InterstateHighway i = new InterstateHighway(90);
        assertEquals(i.isAuxiliary(), false);
    }

    @Test
    public void test_021() {
        InterstateHighway i = new InterstateHighway(290);
        assertEquals(i.isAuxiliary(), true);
    }

    @Test
    public void test_022() {
        InterstateHighway i = new InterstateHighway(90);
        assertEquals(i.direction(), "east/west");
    }

    @Test
    public void test_023() {
        InterstateHighway i = new InterstateHighway(95);
        assertEquals(i.direction(), "north/south");
    }

    @Test
    public void test_024() {
        InterstateHighway i = new InterstateHighway(290);
        assertEquals(i.primaryNumber(), 90);
    }

    @Test
    public void test_025() {
        InterstateHighway i = new InterstateHighway(324);
        assertEquals(i.primaryNumber(), 24);
    }

    @Test
    public void test_026() {
        InterstateHighway i = new InterstateHighway(85);
        assertEquals(i.primaryNumber(), 85);
    }

    @Test
    public void test_027() {
        ExactChange e = new ExactChange(147);
        assertEquals(e.getNumDollars(), 1);
        assertEquals(e.getNumQuarters(), 1);
        assertEquals(e.getNumDimes(), 2);
        assertEquals(e.getNumNickels(), 0);
        assertEquals(e.getNumPennies(), 2);
    }

    @Test
    public void test_028() {
        ExactChange e = new ExactChange(46);
        assertEquals(e.getNumDollars(), 0);
        assertEquals(e.getNumQuarters(), 1);
        assertEquals(e.getNumDimes(), 2);
        assertEquals(e.getNumNickels(), 0);
        assertEquals(e.getNumPennies(), 1);
    }

    @Test
    public void test_029() {
        Season s = new Season("April", 11);
        assertEquals(s.getSeasonString(), "Spring");
    }

    @Test
    public void test_030() {
        Season s = new Season("June", 25);
        assertEquals(s.getSeasonString(), "Summer");
    }

    @Test
    public void test_031() {
        Season s = new Season("October", 2);
        assertEquals(s.getSeasonString(), "Autumn");
    }

    @Test
    public void test_032() {
        Season s = new Season("Blue", 11);
        assertEquals(s.getSeasonString(), "Invalid");
    }

    @Test
    public void test_033() {
        Season s = new Season("April", 0);
        assertEquals(s.getSeasonString(), "Invalid");
    }

    @Test
    public void test_034() {
        Season s = new Season("September", 40);
        assertEquals(s.getSeasonString(), "Invalid");
    }

    @Test
    public void test_035() {
        Season s = new Season("Green", 0);
        assertEquals(s.getSeasonString(), "Invalid");
    }

    @Test
    public void test_036() {
        Year y = new Year(1712);
        y.setTheYear(1712);
        assertEquals(y.getTheYear(), 1712);
    }

    @Test
    public void test_037() {
        Year y = new Year(1712);
        y.setTheYear(1712);
        assertEquals(y.isLeapYear(), true);
    }

    @Test
    public void test_038() {
        Year y = new Year(1913);
        y.setTheYear(1913);
        assertEquals(y.isLeapYear(), false);
    }

    @Test
    public void test_039() {
        Year y = new Year(1700);
        y.setTheYear(1700);
        assertEquals(y.isLeapYear(), false);
    }

    @Test
    public void test_040() {
        Year y = new Year(1600);
        y.setTheYear(1600);
        assertEquals(y.isLeapYear(), true);
    }

}