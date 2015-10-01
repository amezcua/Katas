import net.byteabyte.katas.fizzbuzz.FizzBuzz;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestFizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test public void oneIsOne(){
        assertEquals("1", fizzBuzz.forNumber(1));
    }

    @Test public void threeisFizz(){
        assertEquals(FIZZ, fizzBuzz.forNumber(3));
    }

    @Test public void fiveIsBuzz(){
        assertEquals(BUZZ, fizzBuzz.forNumber(5));
    }

    @Test public void sixIsFizz(){
        assertEquals(FIZZ, fizzBuzz.forNumber(6));
    }

    @Test public void tenIsBuzz(){
        assertEquals(BUZZ, fizzBuzz.forNumber(10));
    }

    @Test public void fifteenIsFizzBuzz(){
        assertEquals(FIZZ_BUZZ, fizzBuzz.forNumber(15));
    }

    @Test public void testRangeOneToTen(){

        List<String> rangeResult = fizzBuzz.forRange(1, 10);

        assertArrayEquals(getExpectedForRange1To10().toArray(), rangeResult.toArray());
    }

    @Test public void testRangeOneToOneHundred(){
        List<String> rangeResult = fizzBuzz.forRange(1, 100);

        assertArrayEquals(getExpectedForRangeOneToOneHundred().toArray(), rangeResult.toArray());
    }

    private List<String> getExpectedForRange1To10(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("1");
        expected.add("2");
        expected.add(FIZZ);
        expected.add("4");
        expected.add(BUZZ);
        expected.add(FIZZ);
        expected.add("7");
        expected.add("8");
        expected.add(FIZZ);
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange11To20(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("11");
        expected.add(FIZZ);
        expected.add("13");
        expected.add("14");
        expected.add(FIZZ_BUZZ);
        expected.add("16");
        expected.add("17");
        expected.add(FIZZ);
        expected.add("19");
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange21To30(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add(FIZZ);
        expected.add("22");
        expected.add("23");
        expected.add(FIZZ);
        expected.add(BUZZ);
        expected.add("26");
        expected.add(FIZZ);
        expected.add("28");
        expected.add("29");
        expected.add(FIZZ_BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange31To40(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("31");
        expected.add("32");
        expected.add(FIZZ);
        expected.add("34");
        expected.add(BUZZ);
        expected.add(FIZZ);
        expected.add("37");
        expected.add("38");
        expected.add(FIZZ);
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange41To50(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("41");
        expected.add(FIZZ);
        expected.add("43");
        expected.add("44");
        expected.add(FIZZ_BUZZ);
        expected.add("46");
        expected.add("47");
        expected.add(FIZZ);
        expected.add("49");
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange51To60(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add(FIZZ);
        expected.add("52");
        expected.add("53");
        expected.add(FIZZ);
        expected.add(BUZZ);
        expected.add("56");
        expected.add(FIZZ);
        expected.add("58");
        expected.add("59");
        expected.add(FIZZ_BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange61To70(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("61");
        expected.add("62");
        expected.add(FIZZ);
        expected.add("64");
        expected.add(BUZZ);
        expected.add(FIZZ);
        expected.add("67");
        expected.add("68");
        expected.add(FIZZ);
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange71To80(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("71");
        expected.add(FIZZ);
        expected.add("73");
        expected.add("74");
        expected.add(FIZZ_BUZZ);
        expected.add("76");
        expected.add("77");
        expected.add(FIZZ);
        expected.add("79");
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange81To90(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add(FIZZ);
        expected.add("82");
        expected.add("83");
        expected.add(FIZZ);
        expected.add(BUZZ);
        expected.add("86");
        expected.add(FIZZ);
        expected.add("88");
        expected.add("89");
        expected.add(FIZZ_BUZZ);

        return expected;
    }

    private List<String> getExpectedForRange91To100(){
        ArrayList<String> expected = new ArrayList<>();

        expected.add("91");
        expected.add("92");
        expected.add(FIZZ);
        expected.add("94");
        expected.add(BUZZ);
        expected.add(FIZZ);
        expected.add("97");
        expected.add("98");
        expected.add(FIZZ);
        expected.add(BUZZ);

        return expected;
    }

    private List<String> getExpectedForRangeOneToOneHundred() {
        ArrayList<String> expected = new ArrayList<>();

        expected.addAll(getExpectedForRange1To10());
        expected.addAll(getExpectedForRange11To20());
        expected.addAll(getExpectedForRange21To30());
        expected.addAll(getExpectedForRange31To40());
        expected.addAll(getExpectedForRange41To50());
        expected.addAll(getExpectedForRange51To60());
        expected.addAll(getExpectedForRange61To70());
        expected.addAll(getExpectedForRange71To80());
        expected.addAll(getExpectedForRange81To90());
        expected.addAll(getExpectedForRange91To100());

        return expected;
    }
}
