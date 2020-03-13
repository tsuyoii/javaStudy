package com.example.one.java00.classandnew;
//引用和对象的练习
public class Hero {
    public String name;
//    protected double hp;
    public double hp;
    public Hero(){

    }
    public Hero(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero h3;
        Hero h4;
        h3 = h1;
        h4 = h3;
        h1.hp=80;
        System.out.println("h2:"+h2);
        System.out.println("h4"+h4);
    }
}
