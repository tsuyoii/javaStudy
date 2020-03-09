package com.example.one.java01.exception;
//异常处理
public class ExceptionOpea {
    public static void main(String[] args){
//        ExceptionOpea eo = new ExceptionOpea();
        System.out.println(method());
    }
    public static int method(){
        try{
            System.out.println("try");
            return 1;
        }catch(Exception e){
            System.out.println("catch");
            return 2;
        }finally{
            System.out.println("finally");
//            return 3;
        }
    }
}
