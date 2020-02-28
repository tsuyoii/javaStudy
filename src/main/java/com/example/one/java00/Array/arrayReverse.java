package com.example.one.java00.Array;
//数组翻转
public class arrayReverse {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println("原数组"+arr[i]);
        }
        for (int i = arr.length-1; i >=0;i--){
            System.out.println("反转数组"+arr[i]);
        }
    }
}
