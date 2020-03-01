package com.example.one.java00.classandnew;
//构造方法
public class gouzaoFunc {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public gouzaoFunc() {
//        System.out.println("this"+this);
        System.out.println("当没有手动创建时，系统会隐式的构造一个无参构造方法，当手动创建后，系统就不会帮你自动创建隐式构造方法了");
    }
    public gouzaoFunc(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
        name = heroName;
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
        System.out.println("构造");
    }
    public  static void main(String[] args){
        gouzaoFunc teemo = new gouzaoFunc();
        //this不能在static方法中调用
//        System.out.println("this"+this+"  teemo"+teemo);
//        参数不匹配，报错
//        gouzaoFunc garen = new gouzaoFunc("盖伦",383);
        gouzaoFunc garen = new gouzaoFunc("盖伦",383,500,320);
    }
}
