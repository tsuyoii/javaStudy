package com.example.one.java01.ArrayList;

import com.example.one.java00.NumStr.IStringBuffer;

import java.util.ArrayList;

//用Arraylist写的
public class MyArrayStringBuffer implements IStringBuffer {
    ArrayList aalt;
    public MyArrayStringBuffer(){
        aalt = new ArrayList();
    }
    public MyArrayStringBuffer(String str){
        this();
        if(str!=null){
            char[] cs = str.toCharArray();
            for(char c:cs){
                aalt.add(c);
            }
        }
        else
            return;
    }
    @Override
    public void append(String str){
        insert(aalt.size()+1, str);
    }
    @Override
    public void append(char c){
        insert(aalt.size()+1, c);
    }
    @Override
    public void insert(int pos,char b){
        insert(pos,String.valueOf(b));
    }
    @Override
    public void insert(int pos,String b){
        if(pos<0){
            return;
        }
        if(pos>aalt.size()){
            return;
        }
        if(b==null){
            return;
        }
        char[] cs = b.toCharArray();
        for(char c:cs){
            aalt.add(c);
        }
    }
    @Override
    public void delete(int start){
        delete(start, aalt.size());
    }
    @Override
    public void delete(int start,int end){
        if(start<0){
            return;
        }
        if(end>aalt.size()){
            end=aalt.size();
        }
        if(start>=end){
            return;
        }
        if(start>aalt.size()){
            return;
        }
        for(int i=start;i<=end;i++){
            aalt.remove(i);
        }
    }
    @Override
    public void reverse(){

    }
    @Override
    public int length(){
        return aalt.size();
    }
    public String toString(){
        char[] cs = new char[aalt.size()];
        for(int i=0;i<aalt.size();i++){
            cs[i] = (char)aalt.get(i);
        }
        return new String(cs);
    }

    public static void main(String[] args){
        MyArrayStringBuffer masb = new MyArrayStringBuffer("there light");
        System.out.println(masb);
        masb.insert(0,"let");
        System.out.println(masb);
        masb.insert(10,"be ");
        System.out.println(masb);
        masb.append('a');
        System.out.println(masb);
        masb.append("boy");
        System.out.println(masb);
    }
}
