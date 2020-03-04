package com.example.one.java00.implents;


//多态的练习
interface Mortal{
    public void die();
}
public class DuoTai extends Hero{
    public static void main(String[] args){
        Hero garen =  new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);
    }
}
class Hero{
    public void kill(Mortal m){
        m.die();
    }
}
class ADHero implements Mortal{
    @Override
    public void die(){
        System.out.println("ADHero is die");
    }
}
class APHero implements Mortal{
    @Override
    public void die(){
        System.out.println("APHero is die");
    }
}
class ADAPHero implements Mortal{
    @Override
    public void die(){
        System.out.println("ADAPHero is die");
    }
}
