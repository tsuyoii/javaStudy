package com.example.one.java01.OtherSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//用容器的工具类collections来统计概率
public class CollectionsProbability {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        int count=0;
        for(int i=0;i<10;i++){
            nums.add(i);
        }
        for(int i=0;i<1000000;i++){
            Collections.shuffle(nums);
            if((nums.get(0)==3)&&(nums.get(1)==1)&&(nums.get(2)==4)){
                count++;
                System.out.println(nums);
            }
        }
        System.out.println(count);
        System.out.println((double)count/1000000);

    }
}
