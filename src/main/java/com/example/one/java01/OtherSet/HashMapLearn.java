package com.example.one.java01.OtherSet;

import com.example.one.java00.classandnew.Hero;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapLearn {
    public static void main(String[] args){
        ArrayList<Hero> heroes = new ArrayList<>();
        for(int i=0;i<3000000;i++){
            heroes.add(new Hero("hero-"+(int)(Math.random()*8999+1000)));
        }
        forFind(heroes);
        HashFind(heroes);
    }
    //不使用hashmap,仅用for循环
    public static void forFind(ArrayList<Hero> heros){
        long start = System.currentTimeMillis();
        for(int i=0;i<heros.size();i++){
            if(heros.get(i).name.equals("hero-5555")){
                System.out.println(heros.get(i));
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("for方法耗时："+(int)(end-start)+"毫秒");
    }
    //使用hashmap
    public static void HashFind(ArrayList<Hero> heros){

//        HashMap<Integer,String> hm = new HashMap<>();
//        for(int i=0;i<h.size();i++){
//            hm.put(i,h.get(i).name);
//        }
//        Iterator it = hm.values().iterator();
//        for(;it.hasNext();){
//            String name = (String)it.next();
//            if(name.equals("hero-5555")){
//                System.out.println(name);
//            }
//        }


        HashMap<String,ArrayList<Hero>> hm = new HashMap<>();
        for(Hero k:heros){
            //hashmap根据名字作为键获取的值放入ArrayList中，若名字相同，则值取到list中，若不同
            //则新建一个list,这时name和一个list为键值对
            ArrayList<Hero> list = hm.get(k.name);
            if(list == null){
                list = new ArrayList<>();
                hm.put(k.name,list);
            }
            list.add(k);
        }
        long start = System.currentTimeMillis();
        System.out.println("hashmap方法共找到"+hm.get("hero-5555").size());
        long end = System.currentTimeMillis();
        System.out.println("hashmap方法耗时："+(int)(end-start)+"毫秒");
    }
}
