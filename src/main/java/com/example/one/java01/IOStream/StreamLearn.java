package com.example.one.java01.IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//流的练习
public class StreamLearn {
    public static void main(String[] args){
        try{
            File f = new File("C:/Windows");
            FileOutputStream fis = new FileOutputStream(f);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
