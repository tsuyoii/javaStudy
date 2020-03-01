package com.example.one.java00.classandnew;
//属性初始化
public class varInit {
    public int age = 11;
    static int hp;
    public varInit(){
        //构造函数初始化
        age = 12;
//        static int hp;//报错。类属性不能在构造方法中声明
//        varInit.hp=69;
    }
    {
        //初始化块
        age = 13;
        varInit.hp=33;
    }
    public static void main(String[] args){
        varInit v = new varInit();
        System.out.println(v.age);
        System.out.println(varInit.hp);
    }
}
