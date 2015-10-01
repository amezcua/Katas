package net.byteabyte.katas.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String forNumber(int number) {
        if(divisibleByThree(number) && divisibleByFive(number)){
            return FIZZ_BUZZ;
        }else if(divisibleByThree(number)) {
            return FIZZ;
        }else if(divisibleByFive(number)){
            return BUZZ;
        }else{
            return String.valueOf(number);
        }
    }

    private boolean divisibleByThree(int number){
        return (number % 3) == 0;
    }

    private boolean divisibleByFive(int number){
        return (number % 5) == 0;
    }

    public List<String> forRange(int start, int end) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=start; i<=end; i++) {
            result.add(forNumber(i));
        }
        return result;
    }
}
