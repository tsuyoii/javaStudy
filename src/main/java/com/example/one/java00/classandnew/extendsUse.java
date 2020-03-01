package com.example.one.java00.classandnew;
//类的继承
public class extendsUse {
    public static void main(String[] args){
        Armor armor1 = new Armor();
        Armor armor2 = new Armor();
        armor1.name = "布甲";
        armor1.price = 300;
        armor1.ac = 15;
        armor2.name = "锁子甲";
        armor2.price = 500;
        armor2.ac = 40;
        System.out.println(armor1.name+" "+armor1.price+" "+armor1.ac);
        System.out.println(armor2.name+" "+armor2.price+" "+armor2.ac);
    }
}

class Item{
    String name;
    int price;
}
class Armor extends Item{
    int ac;//护甲等级
}
