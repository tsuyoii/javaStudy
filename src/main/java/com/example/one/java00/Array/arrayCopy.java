package com.example.one.java00.Array;
//合并数组
public class arrayCopy {
    public static void main(String[] args){
        int[] arr =new int[(int)(Math.random()*5+5)];
        int[] brr =new int[(int)(Math.random()*5+5)];
        int[] crr = new int[20];
        System.out.println("arr数组：");
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+"  ");
        }
        System.out.println("brr数组：");
        for(int i=0;i<brr.length;i++){
            brr[i] = (int)(Math.random()*100);
            System.out.print(brr[i]+"  ");
        }
        System.out.println("crr数组：");
        System.arraycopy(arr,0,crr,0,arr.length);
        System.arraycopy(brr,0,crr, arr.length, brr.length);
        for(int each:crr){
            System.out.print(each+"  ");
        }
    }

}
