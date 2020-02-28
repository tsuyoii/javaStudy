package com.example.one.java00.controlstream;
//一个for循环的案例
public class forMoney {
    public static void main(String[] args){
        int money = 1;
        int total = 1;
        //第10天
        for(int i=2;i<=10;i++){
            money *= 2;
            total += money;

//            total += Math.pow(2,(i-1));
        }
        System.out.println("总收入为"+total);
    }
}
