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
}
