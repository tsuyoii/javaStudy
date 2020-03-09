package com.example.one.java01.exception;
//练习使用Throwable
public class ThrowableLearn {
    public static void main(String[] args){
        try{
            method1();
        }catch(Throwable e){
            e.printStackTrace();
        }

    }
    public static void method1() throws Throwable{
        throw new RuntimeException();
    }
}
