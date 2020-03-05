package com.example.one.java00.implents;
//默认方法
//public class DefaultFunc implements AD,Ap{报错
public class DefaultFunc implements AD{
    public static void main(String[] args){
//        public void attack1(){
//            System.out.println("AP.attack");
//        }报错
        DefaultFunc dc = new DefaultFunc();
        dc.attack();
    }
}
interface AD{
    default public void attack(){
        System.out.println("AD.attack");
    }
}
interface Ap{
    default public void attack(){
        System.out.println("AP.attack");
    }
}
