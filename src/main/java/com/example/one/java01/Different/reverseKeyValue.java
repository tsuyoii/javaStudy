package com.example.one.java01.Different;

import java.util.HashMap;
import java.util.Set;

//反转key和value
public class reverseKeyValue {
    public static void main(String[] args){
        HashMap<String,String> hm = new HashMap<>();
        HashMap<String,String> hm2 = new HashMap<>();
        hm.put("adc", "物理英雄");
        hm.put("apc", "魔法英雄");
        hm.put("t", "坦克");
        System.out.println(hm);
//        Iterator<String> it = hm.keySet().iterator();
//        Iterator<String> it2 = hm.values().iterator();
//        for(;it.hasNext();) {
//            String tempKey = it2.next();
//            String tempValue = it.next();
//            hm2.put(tempKey,tempValue);
//        }
//        System.out.println(hm2);

        Set<String> hs = hm.keySet();
        for(String s:hs){
            String value = hm.get(s);
            hm2.put(value, s);
        }
        System.out.println(hm2);
    }
}
