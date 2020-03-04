package com.example.one.java00.classandnew;

public class DanliItem {
    public static void main(String[] args){
        DanliItem_lan it1 = DanliItem_lan.getInstance("konan");
        DanliItem_lan it2 = DanliItem_lan.getInstance("sorari");
        System.out.println(it1);
        System.out.println(it2);
        System.out.println(it1.name);
        System.out.println(it2.name);
//        it1和it2是一样的，都是konan,因为第一次调用后instance就不再指向null,返回的永远是第一次实例化的结果
    }
}
//懒汉式模式
class DanliItem_lan{
    public String name;
    private DanliItem_lan(String name){
        this.name = name;
    }
    private static DanliItem_lan Instance;
    public static DanliItem_lan getInstance(String name){
        if(null==Instance){
            Instance = new DanliItem_lan(name);
        }
        return Instance;
    }
}
