package com.example.one.java01.ArrayList;

import com.example.one.java00.classandnew.Hero;
import java.util.ArrayList;
//集合与框架；ArrayList是一种容器类，可以不断往里面加对象，不会超界
public class TestArrayList {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args){
        ArrayList dd = new ArrayList();//容器类用于存放对象
        dd.add(new Hero("garen"));
        System.out.println(dd.size());
        dd.add(new Hero("yalun"));
        System.out.println(dd.size());
        dd.add(new Hero("yalun"));
        System.out.println(dd.size());
        dd.add(new Hero("garen"));
        System.out.println(dd.size());
        dd.add(new Hero("teemo"));
        System.out.println(dd.size());
        dd.add(new Hero("gar"));
        System.out.println(dd.size());
        dd.add(new Hero("ren"));
        System.out.println(dd);
        System.out.println(dd.size());
        Hero[] hs = (Hero[])dd.toArray(new Hero[]{});
        for(int i=0;i<dd.size();i++){
            if(hs[i].name.equals("gar"))//普通类型可以用==，但字符串属于引用类型，equals表示值相等
                System.out.println("找到了gar,下标为:"+i);
        }
    }
}
