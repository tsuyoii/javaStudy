package com.example.one.java00.Array;

//用增强型for循环找出最大那个数
public class zengqiangfor {
    public static void main(String[] args){
        int[] arr = new int[6];
        int max=0;
        for(int each:arr){
            //这里的each相当于只是for函数中的一个参数，each可以修改，但出了该函数就each被销毁，而这里
            //也相当于没有给arr赋值，只是给参数each赋值而已
            each = (int)(Math.random()*100);
            System.out.print(each+"  ");
            if(each>max){
                max=each;
            }
        }
        for(int each:arr){
            System.out.print(each+"  ");
        }
        System.out.println("最大"+max);
    }
}
