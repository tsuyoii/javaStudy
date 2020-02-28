package com.example.one.java00.Array;
//数组最小值
public class arraymininum {
    public static void main(String[] args){
        int[] arr = new int[5];
        int min = 100;
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            if(min>arr[i]){
                min = arr[i];
            }
            System.out.println("数组"+i+"的值："+arr[i]);
        }
        System.out.println(min);
    }
}
