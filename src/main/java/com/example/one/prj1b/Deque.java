package com.example.one.prj1b;
public interface Deque<Item> {
    public void addFirst(Item x);
    public void addLast(Item y);
//    public Item getFirst();
//    public Item getLast();
    public Item removeFirst();
    public Item removeLast();
    public int size();
    public Item get(int index);
    default public boolean isEmpty(){
        return size()==0;
    }
}
