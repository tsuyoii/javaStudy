package com.example.one.java01.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//文件合并
public class FileJoin {
    public static void main(String[] args){
        File f = new File("d:/xyz");
        File[] fs = f.listFiles();
        Hebin(fs);
    }
    public static void Hebin(File[] f) {
        try {
            File ff = new File("d:/xyz/_set.dll");
            //将文件数据读入字符数组
            FileInputStream fis =null;
            FileOutputStream fos = new FileOutputStream(ff);
            byte[] data = new byte[150*1024];
            for (int i = 0; i < f.length; i++) {
                fis =  new FileInputStream(f[i]);
                fis.read(data);
            }
            fis.close();
            fos.write(data);
            fos.close();
        } catch (IOException t) {
            t.printStackTrace();
        }
    }
}
