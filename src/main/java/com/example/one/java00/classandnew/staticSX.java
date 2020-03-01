package com.example.one.java00.classandnew;
//类属性
public class staticSX {
     String name;//对象属性
    static String copyright;//类属性

    public static void main(String[] args){
        staticSX garen = new staticSX();
        staticSX teemo = new staticSX();
        staticSX.copyright = "版权由Riot Games公司所有";
        System.out.println(teemo.copyright);
        garen.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);
    }
}

class zilei extends staticSX{
    public static void main(String[] args){
        staticSX.copyright = "我是子类中继承的类属性";
        zilei z = new zilei();
        staticSX teemo = new staticSX();
        teemo.copyright = "8号打假赛";
        System.out.println(z.copyright);
        System.out.println(teemo.copyright);
    }
}
