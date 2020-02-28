/****
 *
 * SLList 表示单向链表
 *
 * *****/
package com.example.one.day_02;
//注意，要继承接口，一定要含有或实现接口中声明的方法
public class SLList<T> implements List61B<T>{
    /**
     * 当IntNode内部没有使用外部SLList类的任何变量和方法时，
     * 可以添加static关键字，表示永远不会向外看，即不需要用到外部的类的实例变量
     */
    private class Node {
        public T item;
        public Node next;

        public Node(T x, Node n){
            item = x;
            next = n;
        }
    }
//    //如果第一项存在，则位于sentinel.next
//    private IntNode first;
//    private IntNode last;
//    private int size1;//数据缓存使时间复杂度下降
//
//    public SLList(T x) {
//        first = new IntNode(x, null);
//        size1 = 1;
//    }
//
//    /**
//     * 重载，创建空列表
//     */
//    public SLList() {
//        first = null;
//        size1 = 0;
//    }
//
//    public static void main(String[] args) {
//        SLList L = new SLList(10);
//        L.addFirst(5);
//        L.addFirst(8);
//        int x = L.getFirst();
//        System.out.println(x);
//        L.addLast(12);
//        System.out.println(L.size());
//        System.out.println(L.size1);
//    }
//
//    public void addFirst(T x) {
//        first = new IntNode(x, first);
//        size1 += 1;
//    }
//
//    public int getFirst() {
//        return first.item;
//    }
//
//    public void addLast(int x) {
//        size1 += 1;
////        IntNode p;
//////        p=first;
//////        while(p.next!=null){
//////            p=p.next;
//////        }
//////        p.next=new IntNode(x,null);
//        last.next = new IntNode(x, null);
//        last = last.next;
//    }
//
//    //    public int size(){
////        IntNode p=first;
////        int size=0;
////        while(p.next!=null){
////            p=p.next;
////            size++;
////        }
////        return size+1;
////    }
//    public int size(IntNode p) {
//        while (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
//
//    /**
//     * 与前面的size()有不同的参数列表，叫做重载
//     */
//    public int size() {
//        return size(first);
//    }
//
//    public int get(int i) {
//        IntNode p = first;
//        while((i--)!=0)p = p.next;
//        return p.item;
//    }
//}



    //如果第一项存在，则位于sentinel.next
    private Node sentinel;
    private int size;//数据缓存使时间复杂度下降

    public SLList(T x) {
        sentinel = new Node(x, null);
        size = 1;
    }

    /**
     * 重载，创建空列表
     */
    public SLList() {
        sentinel = null;
        size = 0;
    }

    public static void main(String[] args) {
        SLList<Integer> L = new SLList<>(10);
        L.addFirst(5);
        L.addFirst(8);
        int x = L.getFirst();
        System.out.println(x);
        L.addLast(12);
        System.out.println(L.size());
        System.out.println(L.size);
    }

    public void addFirst(T x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    public T getFirst() {
        return sentinel.next.item;
    }

    @Override
    public T getLast() {
        Node p = sentinel;
        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public T removeLast() {
        Node p = sentinel;
        /* Advance p to the end of the list. */
        while (p.next.next != null) {
            p = p.next;
        }
        T x = p.item;
        p.next = null;
        return x;
    }

    public void addLast(T x) {
        size += 1;
        Node p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new Node(x, null);
    }

    public int size(Node p) {
        while (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    /**
     * 与前面的size()有不同的参数列表，叫做重载
     */
    public int size() {
        return size;
    }

    public T get(int i) {
        Node p = sentinel;
        while((i--)!=0)p = p.next;
        return p.item;
    }

    public void insert(T item,int position){
        Node p = sentinel;
        while(position>1&&p.next!=null){
            p = p.next;
            position--;
        }
        Node newNode = new Node(item,p.next);
        p.next = newNode;
    }
    //重写print方法，以实现与接口List61B中不同的print方法
    @Override
    public void print(){
        for(Node p = sentinel.next;p!=null;p=p.next){
            System.out.print(p.item +" ");
        }
    }
}
