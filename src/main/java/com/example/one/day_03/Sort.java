package com.example.one.day_03;
//选择排序
public class Sort {
    private static void sort(String[] in,int start){
        if(start>= in.length)
            return;
    //找到最小项
        int smallest = findSmallest(in,start);
    // 将其交换至前面
        swap(in,start,smallest);
    //其余项选择排序
        sort(in,start+1);
    }
    public static void sort(String[] in){
        sort(in,0);
    }
    public static int findSmallest(String[] x,int start){
        int smallest = start;
        for(int i=start;i<x.length;i++){
            smallest=(x[smallest].compareTo(x[i])<0? smallest:i);
        }
        return smallest;
    }
    public static void swap(String[] x,int a,int b){
        String temp= x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
