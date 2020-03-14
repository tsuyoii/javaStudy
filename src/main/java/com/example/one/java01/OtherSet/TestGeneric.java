package com.example.one.java01.OtherSet;

import com.example.one.java00.classandnew.Hero;
import com.example.one.java00.implents.Item;

import java.util.ArrayList;

public class TestGeneric {

    public static void iterate(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<Hero> aphs = new ArrayList<>();
        ArrayList<Hero> adhs = new ArrayList<>();

        iterate(hs);
        iterate(aphs);
        iterate(adhs);

        ArrayList<Item> fulei = new ArrayList<>();
        ArrayList<Item> fulei2 = new ArrayList<>();
        fulei2.add(new Hero());
        //子类泛型不可以向父类泛型转型，父类泛型到子类泛型也不可以
//        hs = fulei;
//        fulei = hs;
    }

}
