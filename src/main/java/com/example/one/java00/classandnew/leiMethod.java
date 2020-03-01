package com.example.one.java00.classandnew;
//类方法
public class leiMethod {
    public String name;
    protected float hp;

    public void die(){
        hp= 0;
        System.out.println("die");
    }
    public static void battleWin(){
        leiMethod lei = new leiMethod();
        lei.die();//不能直接调用，静态方法不能调用非静态方法，但可以通过对象调用，在类方法中能直接调用对象方法

        System.out.println("battle win");
    }
    public static void main(String[] main){
        leiMethod lei = new leiMethod();
//        battleWin();//类方法，不报错，但一般都加上类名在前面
//        die();//对象方法会报错，需要对象
          leiMethod.battleWin();
    }
}
