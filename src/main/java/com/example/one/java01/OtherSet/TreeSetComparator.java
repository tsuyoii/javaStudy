package com.example.one.java01.OtherSet;

import java.util.Comparator;
import java.util.TreeSet;

//创建自己的TreeSet
public class TreeSetComparator {
    public static void main(String[] args){
        Comparator<Integer> cp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //因为TreeSet一定是升序，所以任何情况都返回负数即可倒序
                return o2-o1;
            }
        };

        TreeSet<Integer> ts = new TreeSet<>(cp);
        for(int i=0;i<10;i++){
            ts.add(i);
        }
        System.out.println(ts);
    }
}
