package net.byteabyte.katas.romannumerals;

import java.util.Arrays;

public class RomanNumeralsConverter {

    private static final char[] EMPTY_SYMBOLS = new char[0];

    public String convert(int number){

        StringBuilder output = new StringBuilder();

        char[] digits = String.valueOf(number).toCharArray();
        int digitPlace = digits.length;

        for (char digit : digits) {
            output.append(getSymbolForDigitAtPlace(Character.getNumericValue(digit), DigitPlace.values()[digitPlace - 1]));
            digitPlace--;
        }

        return output.toString();
    }

    private char[] getSymbolForDigitAtPlace(int digit, DigitPlace place){
        char[] validSymbolsForPlace = getValidSymbolsForPlace(place);

        char[] outputSymbols = EMPTY_SYMBOLS;

        if(digit != 0) {
            if (digit <= 3) {
                outputSymbols = getSymbolsForDigitLessThanThree(digit, validSymbolsForPlace);
            } else if (digit == 4) {
                outputSymbols = getSymbolsForDigitFour(validSymbolsForPlace);
            } else if (digit == 5) {
                outputSymbols = getSymbolsForDigitFive(validSymbolsForPlace);
            } else if (digit > 5 && digit < 9) {
                outputSymbols = getSymbolsForDigitsBetweenFiveAndNine(digit, validSymbolsForPlace);
            } else if (digit == 9) {
                outputSymbols = getSymbolsForDigitNine(validSymbolsForPlace);
            }
        }
        return outputSymbols;
    }

    private char[] getSymbolsForDigitNine(char[] validPlaceSymbols) {
        return new char[] { validPlaceSymbols[0], validPlaceSymbols[2] };
    }

    private char[] getSymbolsForDigitsBetweenFiveAndNine(int digit, char[] validPlaceSymbols) {
        StringBuilder b = new StringBuilder();
        b.append(validPlaceSymbols[1]);

        int repeatCount = digit-5;

        char[] repeatDigits = new char[repeatCount];
        Arrays.fill(repeatDigits, validPlaceSymbols[0]);

        b.append(repeatDigits);

        char[] outputSymbols = new char[repeatCount+1];
        b.getChars(0, outputSymbols.length, outputSymbols, 0);
        return outputSymbols;
    }

    private char[] getSymbolsForDigitFive(char[] validPlaceSymbols) {
        return new char[] { validPlaceSymbols[1] };
    }

    private char[] getSymbolsForDigitFour(char[] validPlaceSymbols) {
        return new char[] { validPlaceSymbols[0], validPlaceSymbols[1] };
    }

    private char[] getSymbolsForDigitLessThanThree(int digit, char[] validPlaceSymbol) {
        char[] outputSymbols = new char[digit];
        Arrays.fill(outputSymbols, validPlaceSymbol[0]);
        return outputSymbols;
    }

    private char[] getValidSymbolsForPlace(DigitPlace place){
        char[] symbols = new char[3];

        switch (place){
            case ONES:{
                symbols[0] = RomanNumeral.I.symbol();
                symbols[1] = RomanNumeral.V.symbol();
                symbols[2] = RomanNumeral.X.symbol();

                break;
            }
            case TENS:{
                symbols[0] = RomanNumeral.X.symbol();
                symbols[1] = RomanNumeral.L.symbol();
                symbols[2] = RomanNumeral.C.symbol();

                break;
            }
            case HUNDREDS:{
                symbols[0] = RomanNumeral.C.symbol();
                symbols[1] = RomanNumeral.D.symbol();
                symbols[2] = RomanNumeral.M.symbol();

                break;
            }
            case THOUSANDS:{
                symbols[0] = RomanNumeral.M.symbol();
                symbols[1] = RomanNumeral.M.symbol();
                symbols[2] = RomanNumeral.M.symbol();

                break;
            }
            default:{
                symbols[0] = RomanNumeral.M.symbol();
                symbols[1] = RomanNumeral.M.symbol();
                symbols[2] = RomanNumeral.M.symbol();
                break;
            }
        }

        return symbols;
    }
}
