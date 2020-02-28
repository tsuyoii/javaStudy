package com.example.one.java00.controlstream;

import java.util.Scanner;

//break语句练习--百万富翁
public class breakMillion {
    public static void main(String[] args){

        //打印单数
        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                if(0==j%2)
                    break; //如果是双数，结束当前循环
                System.out.println(i+":"+j);
            }

        }



        System.out.println("请输入本金");
        Scanner scan = new Scanner(System.in);
        double p = scan.nextDouble();
        System.out.println("请输入年利率(小数形式)");
        double r = scan.nextDouble();
        System.out.println("请输入复利总收入");
        double ff = scan.nextDouble();
        double f=0;
        int n;
        for(n=1;;n++){
            if(f>=ff)
                break;
            f+=p*(Math.pow((1+r),n));
        }
        System.out.println("所存年数："+(n-1));
        System.out.println("所存总收入："+f);
    }
}
