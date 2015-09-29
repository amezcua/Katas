import net.byteabyte.katas.romannumerals.CantConvertNumberException;
import net.byteabyte.katas.romannumerals.RomanNumerals;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRomanNumerals {

    @Test public void testNumberOne() throws CantConvertNumberException {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test public void testNumberTwo() throws CantConvertNumberException {
        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test public void testNumberThree() throws CantConvertNumberException {
        assertEquals("III", RomanNumerals.convert(3));
    }

    @Test public void testNumberFour() throws CantConvertNumberException {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test public void testNumberFive() throws CantConvertNumberException {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test public void testNumberSix() throws CantConvertNumberException {
        assertEquals("VI", RomanNumerals.convert(6));
    }

    @Test public void testNumberTen() throws CantConvertNumberException {
        assertEquals("X", RomanNumerals.convert(10));
    }

    @Test public void testNumberEleven() throws CantConvertNumberException {
        assertEquals("XI", RomanNumerals.convert(11));
    }

    @Test public void testNumberFifty() throws CantConvertNumberException {
        assertEquals("L", RomanNumerals.convert(50));
    }

    @Test public void testNumberOneHundred() throws CantConvertNumberException {
        assertEquals("C", RomanNumerals.convert(100));
    }

    @Test public void testNumberFiveHundred() throws CantConvertNumberException {
        assertEquals("D", RomanNumerals.convert(500));
    }

    @Test public void testNumberOneThousand() throws CantConvertNumberException {
        assertEquals("M", RomanNumerals.convert(1000));
    }

    @Test public void testRandomNumbers() throws CantConvertNumberException {
        assertEquals("XCVII", RomanNumerals.convert(97));
        assertEquals("XIV", RomanNumerals.convert(14));
        assertEquals("MX", RomanNumerals.convert(1010));
        assertEquals("MMI", RomanNumerals.convert(2001));
        assertEquals("MCDLII", RomanNumerals.convert(1452));
        assertEquals("MMDCCCXCVII", RomanNumerals.convert(2897));
        assertEquals("MCMXC", RomanNumerals.convert(1990));
        assertEquals("MMVIII", RomanNumerals.convert(2008));
        assertEquals("XCV", RomanNumerals.convert(95));
    }
}
