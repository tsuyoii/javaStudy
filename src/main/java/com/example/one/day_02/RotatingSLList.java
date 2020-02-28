package com.example.one.day_02;
/*******
 继承允许子类重用已经定义的类中的代码
继承以后就可以直接使用父类SLList中的所有成员，包括所有实例和静态变量，所有方法已经所有嵌套类
但构造函数不是继承的，并且私有成员不能由子类直接访问
 ****/
/*
public class RotatingSLList<Item> extends SLList<Item> {
    public SLList rotateRight(SLList<Integer> L){
        int x = L.getLast();
        L.removeLast();
        L.addFirst(x);
        return L;
   }
}
*/
public class RotatingSLList<Item> extends SLList<Item> {
    public void rotateRight(){
        Item x = removeLast();
        addFirst(x);
   }
}