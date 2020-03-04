package com.example.one.java00.implents.Objects;
//Object作业练习
public class ItemObject {
    String name;
    double price;
    public ItemObject(String name,double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return this.name+this.price;
    }
    public void finalize(){
        System.out.println("当前对象正在被回收");
    }
    public boolean equals(Object o){
        if(o instanceof ItemObject){
            ItemObject i = (ItemObject) o;
            return this.price == i.price;
        }
        return false;
    }
    public static void main(String[] args){
        ItemObject h1;
//        for(int i=0;i<100000;i++){
            h1 = new ItemObject("h1",300);
            ItemObject h2 = new ItemObject("h2",300);
            System.out.println(h1.equals(h2));
            System.out.println(h1.toString());
            System.out.println(h1);
//        }
    }
}
