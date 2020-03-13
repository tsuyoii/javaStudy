package com.example.one.java01.OtherSet;

import com.example.one.java00.classandnew.Hero;

import java.util.ArrayList;
import java.util.List;

//Hero二叉树
public class HeroNode {
    public HeroNode leftNode;
    public HeroNode rightNode;
    public Hero value;
    public void add(Hero h){
        if(value==null)
            value = h;
        else{
            if(h.hp<=value.hp){
                if(leftNode==null)
                    leftNode = new HeroNode();
                leftNode.add(h);
            }
            else{
                if(rightNode==null)
                    rightNode = new HeroNode();
                rightNode.add(h);
            }
        }
    }
    public List<Hero> MiddleOrder(){
        List<Hero> values = new ArrayList<>();
        if(leftNode!=null)
            values.addAll(leftNode.MiddleOrder());
        values.add(value);
        if(rightNode!=null)
            values.addAll(rightNode.MiddleOrder());
        return values;
    }
    public static void main(String[] args){
        Hero[] heros = new Hero[10];
        for(int i=0;i<10;i++){
            heros[i] = new Hero();
            heros[i].name = "hero"+i;
            heros[i].hp = (int)(Math.random()*899+100);
        }
        HeroNode root = new HeroNode();
        for(Hero h:heros){
            root.add(h);
        }
        System.out.println(root.MiddleOrder());
        System.out.println("倒排序后");
        for(int i=9;i>0;i--) {
            System.out.println(root.MiddleOrder().remove(i));
        }
    }
}
