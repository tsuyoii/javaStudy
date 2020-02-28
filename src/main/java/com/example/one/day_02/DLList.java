/****
 *
 * DLList 表示双向链表
 *
 * *****/
package com.example.one.day_02;

/**为了能够让DLList保存除了整数外的数据信息，例如要创建一个字符串列表
 * 我们可以使用泛型以此来创建包含任意引用类型的数据结构
 * <>表示占位符,此处的MyType也表示占位符？？用于后面声明String类型?????????
 * 在类名之后使用</>*/
public class DLList<MyType> {
    private IntNode first;
    private IntNode last;
    private int size1;//数据缓存使时间复杂度下降

    public class IntNode {
        public IntNode prev;
        public MyType item;
        public IntNode next;

        public IntNode(MyType x, IntNode n){
            item = x;
            next = n;
        }
    }

    public DLList(MyType x){
        last = new IntNode(x,null);
        size1 = 1;
    }
    public void addFirst(MyType x){
        first = new IntNode(x,first);
        size1+=1;
    }
    public void addLast(MyType x){
        size1+=1;
        last.next = new IntNode(x,null);
        last.next.prev=last;
        last = last.next;
    }
/**泛型声明期间将类型显示在<>内，
 * 实例化时可以写，也可以不写，仅显示空的<>*/
    public static void main(String[] args){
        DLList<String> L = new DLList<>("hello");
        L.addLast("i am");
        L.addLast("gong");
        L.addLast("men");
        System.out.println(L.size1);
    }
}
