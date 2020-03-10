package com.example.one.java01.IOStream;

import java.io.File;
import java.util.Arrays;

//文件常用方法及遍历练习
public class FileLearn {
    public static void main(String[] args){
        File f = new File("C:/Windows");
//        f.list();
        String[] sf = f.list();
        File[] fs = f.listFiles();
        File tempMax = fs[0];
        File tempMin = fs[0];
        for(int i=0;i<fs.length;i++){
            if(fs[i].isDirectory()){
                continue;
            }
            System.out.println("字符数组形式返回文件"+fs[i]);
            if(fs[i].length()!=0){
                if(fs[i].length()>tempMax.length()){
                    tempMax = fs[i];
                }
                if(fs[i].length()<tempMin.length()){
                    tempMin = fs[i];
                }
            }
        }
        System.out.println(Arrays.toString(sf));
        System.out.println("最长文件"+tempMax+"长度"+tempMax.length());
        System.out.println("最小文件"+tempMin+"长度"+tempMin.length());
//        System.out.println(Arrays.toString(fs));
    }
}
