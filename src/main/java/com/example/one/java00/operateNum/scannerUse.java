package com.example.one.java00.operateNum;

import java.util.Scanner;

//scanner类的使用
public class scannerUse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        //读取一个int整数
//        scan.nextInt();
//        //判断是否还有输入整数，输入回车继续，输入非数字结束,当为hasNextInt()却输入一个小数时，也会终止
//        //但是，对于hasNextDouble(),如果输入一个整数，不会终止，而是将其强制转换为小数
//        while(scan.hasNextInt()){
//            System.out.println(scan.nextInt());
//        }
//        scan.close();



//        //读取一个小数
//        scan.nextDouble();
//        //判断是否还有输入整数时，输入回车继续，输入非数字结束,当为hasNextInt()却输入一个小数时，也会终止
//        //但是，对于hasNextDouble(),如果输入一个整数，不会终止，而是将其强制转换为小数
//        while(scan.hasNextDouble()){
//            System.out.println(scan.nextDouble());
//        }
//        scan.close();



//        输入        nes123   ijfjdvn  1234,回车表示结束
//        输出nes123
//        if(scan.hasNext()){
//            System.out.println(scan.next());
//        }




//        输入        erdfg   2345,  ,  .456$%6fgh回车表示结束
//        输出        erdfg   2345,  ,  .456$%6fgh
        if(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
