package com.example.one.java01.Different;

import java.util.ArrayList;
import java.util.HashSet;

//比较List(ArrayList)与Set(HashSet)的区别
//1、List按插入有序，Set无序
//2、List数据可重复，Set不能
public class ListSet {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0;numSet.size()<50;i++){
            int ii = (int)(Math.random()*9999);
            numSet.add(ii);
        }
        System.out.println("得到"+numSet.size()+"个不重复的随机数");
        for(int i:numSet){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println(numSet);
        System.out.print(numSet.size());
    }
}
