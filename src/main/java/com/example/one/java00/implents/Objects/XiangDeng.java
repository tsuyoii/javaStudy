package com.example.one.java00.implents.Objects;
//equals和==的对比
public class XiangDeng {
    int hp;
    public boolean equals(Object o){
        if(o instanceof XiangDeng){
            XiangDeng x = (XiangDeng) o;
            return this.hp == x.hp;
        }
        return false;
    }
    public static void main(String[] args){
        XiangDeng x1 = new XiangDeng();
        x1.hp = 300;
        XiangDeng x2 = new XiangDeng();
        x2.hp = 400;
        XiangDeng x3 = new XiangDeng();
        x3.hp = 300;
        XiangDeng x4 = x2;

        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x4.equals(x2));


        System.out.println(x1==x2);
        System.out.println(x1==x3);
        System.out.println(x2==x4);
    }
}
