import net.byteabyte.katas.romannumerals.RomanNumerals;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRomanNumerals {

    @Test public void testNumberOne() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test public void testNumberTwo() {
        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test public void testNumberThree() {
        assertEquals("III", RomanNumerals.convert(3));
    }

    @Test public void testNumberFour() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test public void testNumberFive() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test public void testNumberSix() {
        assertEquals("VI", RomanNumerals.convert(6));
    }

    @Test public void testNumberTen() {
        assertEquals("X", RomanNumerals.convert(10));
    }

    @Test public void testNumberEleven() {
        assertEquals("XI", RomanNumerals.convert(11));
    }

    @Test public void testNumberFifty() {
        assertEquals("L", RomanNumerals.convert(50));
    }

    @Test public void testNumberOneHundred() {
        assertEquals("C", RomanNumerals.convert(100));
    }

    @Test public void testNumberFiveHundred() {
        assertEquals("D", RomanNumerals.convert(500));
    }

    @Test public void testNumberOneThousand() {
        assertEquals("M", RomanNumerals.convert(1000));
    }

    @Test public void testRandomNumbers() {
        assertEquals("XCVII", RomanNumerals.convert(97));
        assertEquals("XIV", RomanNumerals.convert(14));
        assertEquals("MX", RomanNumerals.convert(1010));
        assertEquals("MMI", RomanNumerals.convert(2001));
        assertEquals("MCDLII", RomanNumerals.convert(1452));
        assertEquals("MMDCCCXCVII", RomanNumerals.convert(2897));
        assertEquals("MCMXC", RomanNumerals.convert(1990));
        assertEquals("MMVIII", RomanNumerals.convert(2008));
        assertEquals("XCV", RomanNumerals.convert(95));
        assertEquals("MCMXCIX", RomanNumerals.convert(1999));

    }
}
