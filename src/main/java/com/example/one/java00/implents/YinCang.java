package com.example.one.java00.implents;
//隐藏的练习，类方法的复写
public class YinCang extends Hero1{
    public static void battleWin(){
        System.out.println("子类YinCang");
    }
    public static void main(String[] args){
        Hero1 h = new YinCang();
        h.battleWin();//父类Hero
    }
}
class Hero1{
    public static void battleWin(){
        System.out.println("父类Hero");
    }
}
