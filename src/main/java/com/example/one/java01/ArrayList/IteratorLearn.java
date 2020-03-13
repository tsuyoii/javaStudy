package com.example.one.java01.ArrayList;

import com.example.one.java00.classandnew.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//迭代器的用法
public class IteratorLearn {
    public static void main(String[] args){
        List<Hero> heros = new ArrayList<>();
        for(int i=0;i<5;i++){
            heros.add(new Hero("hero"+i));
        }
        //------while写法的迭代器遍历--------
        Iterator<Hero> it = heros.iterator();//注意，这里不是new
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }


        //------for遍历-------------------

        for(Iterator<Hero> it2 = heros.iterator();it2.hasNext();){
            Hero h2 = (Hero)it2.next();
            System.out.println(h2);
        }
    }
}
