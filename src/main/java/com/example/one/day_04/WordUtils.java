package com.example.one.day_04;

import com.example.one.day_02.AList;
import com.example.one.day_02.SLList;

public class WordUtils {
    //计算SLList中最长字符串的方法
    public static String longest(SLList<String> L){
        int max = 0;
        String maxString,temp;
        for(int i=0;i<L.size();i++) {
            maxString = L.get(max);
            temp = L.get(i);
            max = temp.length()>maxString.length()?i:max;
        }
        return L.get(max);
    }
//重载，方法名相同
    public static String longest(AList<String> L){
        int max = 0;
        String maxString,temp;
        for(int i=0;i<L.size();i++) {
            maxString = L.get(max);
            temp = L.get(i);
            max = temp.length()>maxString.length()?i:max;
        }
        return L.get(max);
    }
}
