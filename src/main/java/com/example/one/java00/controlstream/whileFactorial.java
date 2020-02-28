package com.example.one.java00.controlstream;

import java.util.Scanner;

//计算阶乘，注意当基数超过20时，如20!会发生数据溢出，因此需要使用long
//但使用long时，计算到21!也会发生溢出
public class whileFactorial {
    public static void main(String[] args){
        System.out.println("please input a Integer");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            //用long代替int,防止基数过大，发生溢出
            long num = scan.nextInt();
            long fac = 1;
            long temp = num;

            while(num>0){
                fac*=num;
                num--;
            }
            if(temp<0)
                System.out.println("您输入了负数，我还不会的嘞，您重新输吧");
            else
                System.out.println(temp + "的阶乘为: "+ fac);
        }
        scan.close();
    }
}
