package com.example.one.java00.implents;
//抽象类的学习
public abstract class AbsLearn {
    public abstract boolean disposable();
    public static void main(String[] args){
        //报错，抽象类不能直接实例化
//        AbsLearn a = new AbsLearn();
        LifePotion lp = new LifePotion();
        Weapon wp = new Weapon();
        Armor ar = new Armor();

        System.out.println(lp.disposable());
        System.out.println(wp.disposable());
        System.out.println(ar.disposable());
    }
}
class LifePotion extends AbsLearn{
    @Override
    public boolean disposable(){
        return true;
    }
}
class Weapon extends AbsLearn{
    @Override
    public boolean disposable(){
        return false;
    }
}
class Armor extends AbsLearn{
    @Override
    public boolean disposable(){
        return false;
    }
}
