package com.example.one.java00.controlstream;

import java.util.Scanner;

enum season{
    spring,summer,autumn,winter
};

//用switch语句判断季节
public class switchseason {
    public static void main(String[] args){
        System.out.println("请输入月份,输入非数字结束");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int month = scan.nextInt();
            switch(month){
                case 1:
                case 2:
                case 3:
                    System.out.println(month + "月是春天");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println(month + "月是夏天");
                    break;
                case 7 :
                case 8 :
                case 9 :
                    System.out.println(month + "月是秋天");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println(month + "月是冬天");
                    break;
                default:
                    System.out.println("default");
            }
        }
        scan.close();
    }
}
