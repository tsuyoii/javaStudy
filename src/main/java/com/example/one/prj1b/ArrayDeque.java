package com.example.one.prj1b;
//继承接口一定要实现接口中声明的所有方法
public class ArrayDeque<T> implements Deque<T>{
    private T[] items;
    private int size;
    private static final int INIT_CAPACITY = 8;
    public ArrayDeque(){
        items =(T[]) new Object[INIT_CAPACITY];
        size = 0;
    }
    public ArrayDeque(ArrayDeque other){
        items =(T[]) new Object[INIT_CAPACITY];
        size = 0;
        for(int i=0;i<other.size;i++){
            addLast((T)other.get(i));
        }
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public void addFirst(T x){
            resize(0,1,size+1);
        items[0] = x;
        size = size+1;
    }
    public void resize(int srcPos,int destPos,int capacity){
        T[] copy = (T[]) new Object[capacity];
        System.arraycopy(items,srcPos,copy,destPos,size);//复制数组，从items[0]开始复制到copy[0]-copy[size]中
        items = copy;
    }
    @Override
    public void addLast(T x){
        if(size==items.length){
            resize(0,0,size+1);
        }
        items[size] = x;
        size = size+1;
    }
    @Override
    public T removeFirst(){
        T t = items[0];
        for(int i=0;i<size-1;i++){
        items[i]= items[i+1];
        }
        size--;
        return t;
    }
    @Override
    public T removeLast(){
        T t = items[size-1];
        size--;
        return t;
    }
    public T getLast(){
        return items[size-1];
    }
    @Override
    public T get(int index){
        return items[index];
    }
    @Override
    public int size(){
        return size;
    }
    public void printDeque(){
        for(int i=0;i<items.length;i++) {
            System.out.print(items[i]+"    ");
        }
    }
    public static void main(String[] args){
        ArrayDeque<String> L = new ArrayDeque<>();
        L.addFirst("i am");
        L.addFirst("gong");
        System.out.println(L.removeFirst());//gong
        L.addLast("gong");
        L.addLast("men");
        System.out.println(L.removeLast());//men
        L.addLast("ml");
        System.out.println(L.size());//3
        L.printDeque();//i am gong ml
        System.out.println(L.get(2));//ml
    }
}
