package com.example.one.java01.OtherSet;

import java.util.LinkedHashSet;

//LinkedHashSet,按Math.PI的每个数字出现的顺序排序，无重复
public class LinkedHashSetLearn {
    public static void main(String[] args){
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        double pi = Math.PI;
        for(;ls.size()<10;) {
            ls.add((int)pi);
            pi*=10;
            pi%=10;
        }
        System.out.println(ls);
    }
}
