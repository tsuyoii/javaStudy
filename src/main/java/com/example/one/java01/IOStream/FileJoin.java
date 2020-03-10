package com.example.one.java01.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//文件合并
public class FileJoin {
    public static void main(String[] args){
        File f = new File("d:/xyz");
        //待合并的所有文件数组
        File[] fs = f.listFiles();
        Hebin(fs);
    }
    public static void Hebin(File[] fs) {
        //合并后的文件
        File ff = new File("d:/xyz/_set.dll");
        try (FileOutputStream fos = new FileOutputStream(ff)){
            //将文件数据读入字符数组
            FileInputStream fis =null;
            byte[] data = new byte[150*1024];
            for (int i = 0; i < fs.length; i++) {
                fis =  new FileInputStream(fs[i]);
                fis.read(data);
            }
            fis.close();
            fos.write(data);
            //不用fos.close();因为写在try()小括号中会自动关闭
        } catch (IOException t) {
            t.printStackTrace();
        }
    }
}
