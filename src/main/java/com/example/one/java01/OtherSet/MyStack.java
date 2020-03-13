package com.example.one.java01.OtherSet;


import com.example.one.java00.classandnew.Hero;

import java.util.LinkedList;

interface Stack{
    //把英雄推入到最后位置
    public void push(Hero h);
    //把最后一个英雄取出来
    public Hero pull();
    //查看最后一个英雄
    public Hero peek();
}

//根据接口Stack实现类MyStack;(用LinkedList实现的栈结构)
public class MyStack implements Stack {
    LinkedList<Hero> ll = new LinkedList<>();
    //把英雄推入到最后位置
    public void push(Hero h){
        ll.addLast(h);
    }
    //把最后一个英雄取出来
    public Hero pull(){
        return ll.removeLast();
    }
    //查看最后一个英雄
    public Hero peek(){
        return ll.getLast();
    }

    public static void main(String[] args){
        MyStack ms = new MyStack();
        for(int i=0;i<5;i++) {
            ms.push(new Hero("hero"+i));
        }
        System.out.println(ms);
        System.out.println(ms.peek());
        for(int i=0;i<5;i++){
            System.out.println(ms.pull());
        }
    }
}
