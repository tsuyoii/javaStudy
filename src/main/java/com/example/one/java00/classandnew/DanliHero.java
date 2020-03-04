package com.example.one.java00.classandnew;

public class DanliHero {
}
//饿汉式单例模式
class DanliHero_e{
    private DanliHero_e(){

    }
    private static DanliHero_e instance = new DanliHero_e();
    public static DanliHero_e getInstance(){
        return instance;
    }
}
class TestDanliHero_e{
    public static void main(String[] args){
//        DanliHero_e h2 = new DanliHero_e();
        DanliHero_e h2 = DanliHero_e.getInstance();
        DanliHero_e h1 = DanliHero_e.getInstance();
        System.out.println(h1);
        System.out.println(h2);
    }
}
