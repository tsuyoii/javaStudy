package com.example.one.java00.controlstream;

import java.util.Scanner;

//判断是否是闰年
public class isRunYear {
    public static void main(String[] args){
        System.out.println("请输入一个年份，不需要加‘份’字,按回车继续，输入任意非数字结束");
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()) {
            int year = scan.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + "年是闰年");
            } else if (year % 400 == 0) {
                System.out.println(year + "年是闰年");
            } else {
                System.out.println(year + "年不是闰年");
            }
        }
    }
}
