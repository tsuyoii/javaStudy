package com.example.one.java00.Array;
//选择法排序，每次都取最精华的到最前
public class xuanze {
    public static void main(String[] args){
//        int min;//可以不用min,而直接用arr[i]
//        int temp;
//        int[] arr = new int[]{18,62,68,82,65,9};
//        int brr[] = new int[6];
//        for(int i=0;i<arr.length;i++){
//            System.out.println("排序前数组"+arr[i]);
//            min = arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                if(min>arr[j]){
//                    temp = min;
//                    min=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            brr[i] = min;
//        }
//        for(int i=0;i<brr.length;i++){
//            System.out.println("排序后的数组"+brr[i]);
//        }



        //法二
        int[] arr = new int[]{18,62,68,82,65,9};
        int temp;
        System.out.println("排序前");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "  ");
        }
        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +"  ");
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("排序后");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
