package com.example.one.java00.implents;
//super关键字的学习
public class SuperLearn extends Fulei{
    //调用父类构造方法
    public SuperLearn(){
        System.out.println("子类无参构造方法");
    }
    public SuperLearn(String name){
        super(name);
        System.out.println("子类含一个参数构造方法");
    }


    //调用父类属性
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }


    public static void main(String[] args){
//        new SuperLearn();
        SuperLearn s = new SuperLearn("konan");
        System.out.println(s.getMoveSpeed());
        System.out.println(s.getMoveSpeed2());

        System.out.println(s.toString());
        System.out.println(s);
    }
}
class Fulei{
    int moveSpeed = 400;
    //无参的
    public Fulei(){
        System.out.println("父类无参的构造方法");
    }
    public Fulei(String name){
        System.out.println(name+"父类含一个参数的构造方法");
    }
}
