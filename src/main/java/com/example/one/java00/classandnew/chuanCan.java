package com.example.one.java00.classandnew;
//传递参数
public class chuanCan {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public chuanCan(){

    }
    //回血
    public void huixue(int xp){
        hp+=xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
    //复活
    public void revive(chuanCan h){
        //创建的是新的对象，
//        h = new chuanCan("teemo",383);
        //仍然引用原来的对象
        h.hp=383;
    }
    public chuanCan(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    public static void main(String[] args){
        chuanCan teemo = new chuanCan("提莫",383);
        //血瓶，其值是100
        int xueping = 100;
        //提莫通过这个血瓶回血
        teemo.huixue(xueping);
        System.out.println(xueping);
        System.out.println(teemo.hp);

        //受到了400点伤害，挂了
        teemo.hp-=400;
        System.out.println(teemo.hp);
        teemo.revive(teemo);
        System.out.println(teemo.hp);
    }
}
