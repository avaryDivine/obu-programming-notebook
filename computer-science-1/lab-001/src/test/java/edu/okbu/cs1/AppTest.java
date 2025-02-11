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
        C1 c1 = new C1(1,2,3);
        assertEquals(3, c1.add2());
    }

    @Test
    public void test_002() {
        C1 c1 = new C1(1, 2,3);
        assertEquals(6, c1.add3());
    }

    @Test
    public void test_003() {
        C1 c1 = new C1(1,2,3);
        assertEquals(-1, c1.sub2());
    }

    @Test
    public void test_004() {
        C1 c1 = new C1(1,2,3);
        assertEquals(c1.add(3,4), 7);
    }

    @Test
    public void test_005() {
        HealthData healthData = new HealthData(10, 20);
        assertEquals(3650, healthData.ageInDays());
    }

    @Test
    public void test_006() {
        HealthData healthData = new HealthData(10, 20);
        assertEquals(28800, healthData.ageInMins());
    }

    @Test
    public void test_007() {
        HealthData healthData = new HealthData(10, 20);
        assertEquals(2073600, healthData.totalHeartBeats());
    }

    @Test
    public void test_008() {
        LAB2_25 lab2_25 = new LAB2_25(100, 2);
        assertEquals(50, lab2_25.do1x());
    }

    @Test
    public void test_009() {
        LAB2_25 lab2_25 = new LAB2_25(100, 2);
        assertEquals(25, lab2_25.do2x());
    }

    @Test
    public void test_010() {
        LAB2_25 lab2_25 = new LAB2_25(100, 2);
        assertEquals(12, lab2_25.do3x());
    }

    @Test
    public void test_011() {
        LAB2_27 l = new LAB2_27(1.0, 2.0, 3.0);
        assertEquals(l.xpowz(), (double) 1.0, (double) 0.0001);
    }

    @Test
    public void test_012() {
        LAB2_27 l = new LAB2_27(1.0, 2.0, 3.0);
        assertEquals(l.xpowypowz(), (double) 1.0, (double) 0.0001);
    }

    @Test
    public void test_013() {
        LAB2_27 l = new LAB2_27(1.0, 2.0, 3.0);
        assertEquals(l.absy(), (double) 2.0, (double) 0.0001);
    }

    @Test
    public void test_014() {
        LAB2_27 l = new LAB2_27(1.0, 2.0, 3.0);
        assertEquals(l.sqrtof(), (double) 2.8284, (double) 0.0001);
    }

    @Test
    public void sqftTest() {
        Carpet c = new Carpet(1.00, 15, 10);
        assertEquals(c.computeSquareFootage(), 150, (double) 0.01);
    }

    @Test
    public void costTest() {
        Carpet c = new Carpet(1.00, 15, 10);
        assertEquals(c.computeCarpetCost(), 180, (double) 0.01);
    }

    @Test
    public void laborTest() {
        Carpet c = new Carpet(1.00, 15, 10);
        assertEquals(c.computeLabor(), 112.5, (double) 0.01);
    }

    @Test
    public void taxTest() {
        Carpet c = new Carpet(1.00, 15, 10);
        assertEquals(c.computeTax(), 20.47, (double) 0.01);
    }

    @Test
    public void totalTest() {
        Carpet c = new Carpet(1.00, 15, 10);
        assertEquals(c.totalCost(), 312.97, (double) 0.01);
    }

    @Test
    public void afterSixTest() {
        CaffeineLevels a = new CaffeineLevels(200);
        assertEquals(a.afterSixHours(), 100, (double) 0.01);
    }

    @Test
    public void afterTwelveTest() {
        CaffeineLevels a = new CaffeineLevels(200);
        assertEquals(a.afterTwelveHours(), 50, (double) 0.01);
    }

    @Test
    public void afterTwentyFourTest() {
        CaffeineLevels a = new CaffeineLevels(200);
        assertEquals(a.afterTwentyFour(), 12.5, (double) 0.01);
    }

    @Test
    public void perimeterTest() {
        Triangle t = new Triangle();
        t.setSide1Lengths(2);
        t.setSide2Lengths(5);
        t.setSide3Lengths(3);
        assertEquals(t.computePerimeter(), 10, (double) 0.01);
    }

    @Test
    public void areaTest() {
        Triangle t = new Triangle();
        t.setSide1Lengths(2);
        t.setSide2Lengths(5);
        t.setSide3Lengths(3);
        assertEquals(t.computeArea(), 52.91, (double) 0.01);
    }

    @Test
    public void rollTest() {
        DieRoll d = new DieRoll(1,6);
        assertTrue(d.roll() >= 1 && d.roll() <= 6);
    }

}
