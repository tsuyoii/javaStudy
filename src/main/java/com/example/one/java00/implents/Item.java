package com.example.one.java00.implents;

public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("父类方法");
    }
    public static void main(String[] args){
        Item i = new Item();
        i.effect();//父类方法

        LifeOption lp = new LifeOption();
        lp.effect();//子类方法

        MagicPotion mp = new MagicPotion();
        mp.effect();
    }
}
//子类
class LifeOption extends Item{
    public void effect(){
        System.out.println("子类方法");
    }
}

class MagicPotion extends Item{
    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
