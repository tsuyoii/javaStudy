package com.example.one.day_02;

public interface List61B<Item> {
    public void addFirst(Item x);
    public void addLast(Item y);
    public Item getFirst();
    public Item getLast();
    public Item removeLast();
    public Item get(int i);
    public void insert(Item x,int position);
    public int size();
    //对于已经在接口中实现的方法，需要添加default关键字,之后实现List61B类的所有内容都可以实现此方法
   //不希望使用时，只需在具体实现方法的类中该重写该方法，@Override
    default public void print(){
        for(int i=0;i<size();i++){
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
