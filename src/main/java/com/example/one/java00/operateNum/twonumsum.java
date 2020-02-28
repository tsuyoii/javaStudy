package com.example.one.java00.operateNum;

import java.util.Scanner;

public class twonumsum {
    public static void main(String[] args){
        System.out.println("请输入两个数");
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double sum = num1 + num2;
        System.out.println("计算结果为："+sum );
//        记得scan用过之后要关闭
        scan.close();
    }
}
