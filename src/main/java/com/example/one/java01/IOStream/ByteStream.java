package com.example.one.java01.IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流
public class ByteStream {
    public static void main(String[] args){
        try{
            File f = new File("d:/xyz/lol2.txt");
            f.getParentFile().mkdir();
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            byte[] data = {35,33,58,97,88,89};
            fos.write(data);
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
