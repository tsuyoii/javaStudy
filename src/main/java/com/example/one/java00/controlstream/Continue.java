package com.example.one.java00.controlstream;
//continue练习
public class Continue {
    public static void main(String[] args){
        for(int i=1;i<=101;i++){
            if(i%3==0 || i%5==0)
                continue;
            System.out.println(i);
        }
    }
}
