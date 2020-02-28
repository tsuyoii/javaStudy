/****
 *
 * 使用数组构建列表类
 *
 * *****/
package com.example.one.day_02;

//       0 1 2 3 4 5 6 ...n
//items:[1 -7 0 0 0 0 0 ....0]
//size : 2;

//保证通用性，我们使用泛型,,,,,,,,implements是表示实现接口List61B，并承诺一定包含或实现接口中指定的所有属性和行为
public class AList<MyType> implements List61B <MyType>{
    MyType[] items;
    int size;
    public AList(){
        items = (MyType[]) new Object[100];//JAVA不允许创建泛型对象的数组
        size = 0;
    }
    public void resize(int capacity){
        MyType[] copy = (MyType[]) new Object[capacity];
        System.arraycopy(items,0,copy,0,size);//复制数组，从items[0]开始复制到copy[0]-copy[size]中
        items = copy;
    }
//实现接口中的功能的标记
   @Override
    public void addFirst(MyType x) {

    }
    @Override
    public void addLast(MyType x){
        if(size==items.length){
            resize(size+1);
        }
        items[size] = x;
        size = size+1;
    }
    @Override
    public MyType getFirst() {
        return null;
    }

    public void insertBack(MyType x){
        if(size==items.length){
            resize(size*2);//换为乘一个调整大小因子后，不用每次复制容量只能加1，以此来提高运行速度
        }
        items[size] = x;
        size = size+1;
    }
    @Override
    public MyType removeLast(){
        MyType t = items[size-1];
        items[size-1]=null;//可以，但没必要
        size--;
        return t;
    }
    @Override
    public MyType getLast(){
        return items[size-1];
    }
    public MyType get(int i){
        return items[i];
    }
    @Override
    public void insert(MyType x, int position) {

    }
    @Override
    public int size(){
        return size;
    }
}
