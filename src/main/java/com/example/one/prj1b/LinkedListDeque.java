package com.example.one.prj1b;
/***
 *
 * 尝试使用哨兵节点sentinel
 *sentinel可以看做是一个随任务变化而变化的节点，临时充当first或last或其他，whatever????的节点，哪里需要就去哪里
 * 例如在需要在头部插入节点，则sentinel可以看做是在first节点之前的一个指示节点
 * 只需将新节点插入到sentinel与first之间即可
 * 即只需变为sentinel--->new--->first即可
 *
 *
 * 同样也可设置成last节点之后的一个节点，要在尾部插入，
 * 只需变为last--->new--->sentinel即可
 *
 * ****/
public class LinkedListDeque<T> implements Deque<T>{
    private IntNode sentinel;
//    private IntNode last;//last也相当于一个sentinel?????
    private int size1;//数据缓存使时间复杂度下降

    public class IntNode {
        public IntNode prev;
        public T item;
        public IntNode next;

        public IntNode(T x, IntNode n){
            item = x;
            next = n;
        }
    }
    public LinkedListDeque(){
        sentinel = new IntNode(null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size1 = 0;
    }
    public LinkedListDeque(LinkedListDeque other){
        sentinel = new IntNode(null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size1 = 0;
        for(int i=0;i<other.size1;i++){
            addLast((T)other.get(i));
        }
    }
    @Override
    public boolean isEmpty(){
        if(size1==0)return true;
        else return false;
    }
    @Override
    public void addFirst(T item){
//        sentinel = first;
        IntNode p=new IntNode(item,sentinel.next);
        sentinel.next.prev = p;
        sentinel.next=p;
        p.prev = sentinel;
        size1+=1;
    }
    @Override
    public void addLast(T x){
        size1+=1;
        IntNode p=new IntNode(x,sentinel);
        p.prev=sentinel.prev;
        sentinel.prev.next=p;
        sentinel.prev=p;
    }
    @Override
    public T removeFirst(){
        if(isEmpty()){
            return null;
        }
        T firstItem = sentinel.next.item;
        sentinel.next =sentinel.next.next;
        sentinel.next.prev=sentinel;
        size1-=1;
        return firstItem;
    }
    @Override
    public T removeLast(){
        if(isEmpty()){
            return null;
        }
        T lastItem = sentinel.prev.item;
        sentinel.prev =sentinel.prev.prev;
        sentinel.prev.next=sentinel;
        size1-=1;
        return lastItem;
    }
    @Override
    public int size(){
        return size1;
    }
    public void printDeque(){
        for(IntNode p=sentinel.next;p!=sentinel;p=p.next){
            System.out.print(p.item+" ");
        }
        System.out.println();
    }
    @Override
    /*使用迭代方法，效率更高*/
    public T get(int index){
        if (index>size1){
            return null;
        }
        IntNode p =sentinel.next;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        return p.item;
    }
    /*使用递归方法的get函数*/
    public T getRecursive(int index){
        if (index>=size1){
            return null;
        }
        else if(index==0){
            return sentinel.next.item;
        }
        else {
//            index--;
            sentinel=sentinel.next;
        }
        return getRecursive(index-1);
    }
    /**泛型声明期间将类型显示在<>内，
     * 实例化时可以写，也可以不写，仅显示空的<>*/
    public static void main(String[] args){
        LinkedListDeque<String> L = new LinkedListDeque<>();
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
        System.out.println(L.getRecursive(2));//ml
    }
}

