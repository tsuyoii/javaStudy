package com.example.one.prj1b;

public class OffByN implements CharacterComparator{
    //由用户自己输入参数N
    private int offset;
    public OffByN(int N){
        this.offset = N;
    }
    @Override
     public boolean equalChars(char x, char y) {
        return Math.abs(x-y)==offset;
    }
}
