package com.example.one.java00.Array;
//冒泡法排序，冒泡比相邻，越大越后沉
public class maopao {
    public static void main(String[] args){
        int[] arr = new int[]{18,62,68,82,65,9};
        int temp;
        System.out.println("排序前");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
//        //冒泡排序
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[j]>arr[j+1]){
//                    temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }



        //冒泡排序改
        for(int i=0;i<arr.length;i++){
            //最后面已经排好的i个数就不用排了
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
