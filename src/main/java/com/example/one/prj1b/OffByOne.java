package com.example.one.prj1b;
//相差1的回文，例如flake中f与e，l与k，都只相差1个,所以“flake”是一个OffByOne的回文
public class OffByOne implements CharacterComparator{
    @Override
    //注意一个小知识点：java中的字符串用“”表示，字符用‘’表示，但我在用''-''格式计算时产生了错误，强制转换也不行
    public boolean equalChars(char x, char y) {
//        int diff = x-y;
//        System.out.print(diff);
//        System.out.println();
//        System.out.print(Math.abs(diff));
        return Math.abs(x-y)==1;
    }
}
