package com.example.one.java01.IOStream;

import java.io.*;

//对象序列化，对象流
class HeroW implements Serializable {
    private static final long serialVersionUID = 1L;
    public int name;
    public int hp;
}
public class ObjectStreamOder {
    public static void main(String[] args){
        HeroW[] h = new HeroW[10];
//        for(int i=0;i<10;i++){
//            h[i].name = 1;
//            h[i].hp=0;
//        }

        File f = new File("d:/garen.lol");
        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)
           ){
            HeroW[] hh = new HeroW[10];
            for(int i=0;i<h.length;i++) {
                h[i] = new HeroW();
                h[i].name = i;
                oos.writeObject(h[i]);
                hh[i]=(HeroW)ois.readObject();
                System.out.println("hero:"+hh[i].name);
            }

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
