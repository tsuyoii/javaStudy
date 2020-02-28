package com.example.one.java00.Array;
//先用选择法正排序（从小到大），再用冒泡法倒排序（从大到小）
public class paixu {
    public static void main(String[] args){
        int[] arr = new int[5];
        int temp;
        System.out.println("原数组");
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+"  ");
        }
        //选择法正排序
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("选择法正排序");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        //冒泡法倒排序
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("冒泡法倒排序");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
