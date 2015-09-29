package net.byteabyte.katas.romannumerals;

public class RomanNumerals {
    public static String convert(int i){

        String output = "";
        char[] digits = String.valueOf(i).toCharArray();
        int place = digits.length;

        for (char digit1 : digits) {
            int digit = Integer.valueOf(String.valueOf(digit1));
            output += getSymbolForDigitPlace(digit, place);

            place--;
        }

        return output;
    }

    private static String getSymbolForDigitPlace(int digit, int place){
        String[] symbols = new String[3];
        switch (place){
            case 1:{
                symbols[0] = "I";
                symbols[1] = "V";
                symbols[2] = "X";

                break;
            }
            case 2:{
                symbols[0] = "X";
                symbols[1] = "L";
                symbols[2] = "C";

                break;
            }
            case 3:{
                symbols[0] = "C";
                symbols[1] = "D";
                symbols[2] = "M";

                break;
            }
            case 4:{
                symbols[0] = "M";
                symbols[1] = "M";
                symbols[2] = "M";

                break;
            }
            default:{
                return "";
            }
        }

        if(digit == 0){
            return "";
        }else if(digit <= 3){
            return new String(new char[digit]).replace("\0", symbols[0]);
        }else if(digit == 4){
            return symbols[0] + symbols[1];
        }else if(digit == 5){
            return symbols[1];
        }else if(digit > 5 && digit < 9){
            return symbols[1] + new String(new char[digit-5]).replace("\0", symbols[0]);
        }else if(digit == 9){
            return symbols[0] + symbols[2];
        }else{
            return "";
        }
    }
}
