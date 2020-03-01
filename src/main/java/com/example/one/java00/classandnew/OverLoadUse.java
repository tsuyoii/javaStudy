package com.example.one.java00.classandnew;

import com.example.one.java00.classandnew.charactor1.Support;

//方法重载
public class OverLoadUse {
    String address;
    int age;
    public void method(OverLoadUse...overs){
        for(int i=0;i<overs.length;i++){
            System.out.println("地址"+overs[i].address+"  年龄"+overs[i].age);
        }
    }
    public static void main(String[] args){
        Support hero = new Support();
        hero.name = "我";
        Hero h1 = new Hero();
        h1.name = "小七";
        h1.hp = 0;
        Hero h2 = new Hero();
        h2.name = "小白";
        h2.hp=0;
        //可变参数的使用
        hero.heal(h1,h2);
        hero.heal(h1, 3.3);
        hero.heal(h2, 2.1);
        hero.heal(h2);
        hero.heal(h2, 5.3);

        OverLoadUse hh = new OverLoadUse();

        OverLoadUse k1 = new OverLoadUse();
        OverLoadUse k2 = new OverLoadUse();
        OverLoadUse k3 = new OverLoadUse();
        OverLoadUse k4 = new OverLoadUse();
        OverLoadUse k5 = new OverLoadUse();
        OverLoadUse k6 = new OverLoadUse();

        k1.address = "k111";
        k2.address = "k222";
        k3.address = "k333";
        k4.address = "k444";
        k5.address = "k555";
        k6.address = "k667";

        k1.age = 1;
        k2.age = 2;
        k3.age = 3;
        k4.age = 4;
        k5.age = 5;
        k6.age = 6;
        hh.method(k1,k2,k3,k4,k5,k6);

    }
}


//    /**
//     *  * 辅助英雄类
//     *  * @author Jai-Chong
//     *  *
//     *  
//     */
//    public class  OverLoadUse extends Hero {
//
//        public void heal() {
//        System.out.println(name + "为大家恢复了血量");
//        }
//
//
//        public void heal(int hp,Hero... heros) {
//            for(Hero each:heros){
////            for (int i = 0; i < heros.length; i++) {
////            System.out.println(name + "为" + heros[i].name + "恢复了"+hp+"血量");
//            System.out.println(name + "为" + each.name + "恢复了"+hp+"血量");
//            }
//        }
//
//
//        public static void main(String[] args) {
//            OverLoadUse nm = new  OverLoadUse();
//            nm.name = "奶妈";
//
//            Hero garen = new Hero();
//            garen.name = "盖伦";
//            Hero timer = new Hero();
//            timer.name = "提莫";
//
//            nm.heal();
//            nm.heal(3,garen);
//            nm.heal(5,garen, timer);
//        }
//    }
