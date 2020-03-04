package com.example.one.java00.implents.Objects;
//finaliza垃圾回收方法，由JVM调用
public class finalize_junk {
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
    public static void main(String[] args){
        finalize_junk h;//只有一个引用，后面多次指向对象，上一次的对象就会被回收
        for(int i=0;i<1000000;i++){
            h = new finalize_junk();
        }
    }
}
