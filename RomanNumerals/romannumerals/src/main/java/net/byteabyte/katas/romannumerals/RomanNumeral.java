package net.byteabyte.katas.romannumerals;

public enum RomanNumeral {
    I('I'),
    V('V'),
    X('X'),
    L('L'),
    C('C'),
    D('D'),
    M('M');

    private char value;

    RomanNumeral(char value){
        this.value = value;
    }

    public char symbol(){
        return value;
    }
}
