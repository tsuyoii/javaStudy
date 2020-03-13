package com.example.one.java01.ArrayList;

import com.example.one.java00.classandnew.Hero;
import com.example.one.java00.implents.Item;

import java.util.ArrayList;
import java.util.List;


//设计一个ArrayList,使其既可以放Hero,又可以放Item,但不可以放其他对象
//思路，让其中一个继承另外一个，或两个同时继承某一个父类
public class GenericArrayList extends ArrayList{
    public static void main(String[] args){
        List T = new ArrayList();
        List<Item> genericheros = new ArrayList<>();
        genericheros.add(new Hero());
        genericheros.add(new Item());

        GenericArrayList gal = new GenericArrayList();
        gal.add(new Hero());
        gal.add(new Item());

    }
    //法二，重写ArrayList的add方法
    public boolean add(Object o){
        if((o instanceof Hero)||(o instanceof Item)) {
            super.add(o);
            return true;
        }
        else
            throw new IllegalArgumentException("不合法参数异常");
    }
}
