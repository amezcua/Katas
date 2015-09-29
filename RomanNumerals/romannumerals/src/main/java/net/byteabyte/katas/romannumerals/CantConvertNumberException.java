package net.byteabyte.katas.romannumerals;

public class CantConvertNumberException extends Throwable {
    public CantConvertNumberException(Throwable parent){
        super(parent);
    }
}
