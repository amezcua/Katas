import net.byteabyte.katas.romannumerals.RomanNumeralsConverter;
import org.junit.*;
import static org.junit.Assert.*;

public class TestRomanNumerals {

    private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test public void testNumberOne() {
        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test public void testNumberTwo() {
        assertEquals("II", romanNumeralsConverter.convert(2));
    }

    @Test public void testNumberThree() {
        assertEquals("III", romanNumeralsConverter.convert(3));
    }

    @Test public void testNumberFour() {
        assertEquals("IV", romanNumeralsConverter.convert(4));
    }

    @Test public void testNumberFive() {
        assertEquals("V", romanNumeralsConverter.convert(5));
    }

    @Test public void testNumberSix() {
        assertEquals("VI", romanNumeralsConverter.convert(6));
    }

    @Test public void testNumberTen() {
        assertEquals("X", romanNumeralsConverter.convert(10));
    }

    @Test public void testNumberEleven() {
        assertEquals("XI", romanNumeralsConverter.convert(11));
    }

    @Test public void testNumberFifty() {
        assertEquals("L", romanNumeralsConverter.convert(50));
    }

    @Test public void testNumberOneHundred() {
        assertEquals("C", romanNumeralsConverter.convert(100));
    }

    @Test public void testNumberFiveHundred() {
        assertEquals("D", romanNumeralsConverter.convert(500));
    }

    @Test public void testNumberOneThousand() {
        assertEquals("M", romanNumeralsConverter.convert(1000));
    }

    @Test public void testRandomNumbers() {
        assertEquals("XCVII", romanNumeralsConverter.convert(97));
        assertEquals("XIV", romanNumeralsConverter.convert(14));
        assertEquals("MX", romanNumeralsConverter.convert(1010));
        assertEquals("MMI", romanNumeralsConverter.convert(2001));
        assertEquals("MCDLII", romanNumeralsConverter.convert(1452));
        assertEquals("MMDCCCXCVII", romanNumeralsConverter.convert(2897));
        assertEquals("MCMXC", romanNumeralsConverter.convert(1990));
        assertEquals("MMVIII", romanNumeralsConverter.convert(2008));
        assertEquals("XCV", romanNumeralsConverter.convert(95));
        assertEquals("MCMXCIX", romanNumeralsConverter.convert(1999));

    }
}
