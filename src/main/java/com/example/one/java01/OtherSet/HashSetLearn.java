package com.example.one.java01.OtherSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//通过hashset来统计字符串数组中重复的字符串有多少种
public class HashSetLearn {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        List<String> hs2 = new ArrayList<>();
        for(int i=0;i<100;i++){
            String temp = RandomString(2);
            if(hs.add(temp)==false)
//            if(hs.contains(temp))
                hs2.add(temp);
            hs.add(temp);
        }
        System.out.println("重复的字符串有"+hs2.size()+"种，分别是");
        for(int i=0;i<hs2.size();i++) {
            System.out.println(hs2.get(i));
        }
    }
    public static String RandomString(int len){
        String s="0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] cs = s.toCharArray();
        String s1 = String.valueOf(cs[(int)(Math.random()*cs.length)])+
                String.valueOf(cs[(int)(Math.random()*cs.length)]);
        return s1;
    }
}
