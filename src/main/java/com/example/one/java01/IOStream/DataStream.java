package com.example.one.java01.IOStream;

import java.io.*;

//数据流练习
public class DataStream {
    public static void main(String[] args){
        write();
        read();
    }
    private static void read(){
        File ff = new File("d:/lol3.txt");
        try(FileInputStream fis = new FileInputStream(ff);
            DataInputStream dis = new DataInputStream(fis)){
            int i1 = dis.readInt();
            int i2 = dis.readInt();
            System.out.println(i1+"@"+i2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void write(){
        File f = new File("d:/lol3.txt");
        try(FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos)){
            dos.writeInt(31);
            dos.writeInt(15);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
