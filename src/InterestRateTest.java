import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterestRateTest {

    @Test
    public void test1() {
        int month = 0;
        String expectedInterestRate = "invalid";
        String actualInterestRate = InterestRate.findInterestRate(false, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test2() {
        int month = 2;
        String expectedInterestRate = "3%";
        String actualInterestRate = InterestRate.findInterestRate(false, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test3() {
        int month = 5;
        String expectedInterestRate = "3.5%";
        String actualInterestRate = InterestRate.findInterestRate(false, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test4() {
        int month = 11;
        String expectedInterestRate = "4.5%";
        String actualInterestRate = InterestRate.findInterestRate(false, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test5() {
        int month = 12;
        String expectedInterestRate = "5.5%";
        String actualInterestRate = InterestRate.findInterestRate(false, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test6() {
        int month = 0;
        String expectedInterestRate = "invalid";
        String actualInterestRate = InterestRate.findInterestRate(true, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test7() {
        int month = 2;
        String expectedInterestRate = "2.7%";
        String actualInterestRate = InterestRate.findInterestRate(true, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test8() {
        int month = 5;
        String expectedInterestRate = "3.5%";
        String actualInterestRate = InterestRate.findInterestRate(true, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test9() {
        int month = 11;
        String expectedInterestRate = "4.4%";
        String actualInterestRate = InterestRate.findInterestRate(true, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

    @Test
    public void test10() {
        int month = 12;
        String expectedInterestRate = "5.2%";
        String actualInterestRate = InterestRate.findInterestRate(true, month);
        assertEquals(expectedInterestRate, actualInterestRate);
    }

}