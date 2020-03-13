package com.example.one.java01.OtherSet;
//二叉树插入数据
public class Node {
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;
    //值
    public Object value;

    public void add(Object o){
        //如果当前节点的值为空，则插入当前节点
        if(value==null)
            value = o;
        //否则，就进入判断
        else{
            if((Integer)o<=(Integer)value){
                //如果左子节点没有引用对象，就new一个对象
                if(leftNode==null)
                    leftNode = new Node();
                leftNode.add(o);
            }
            else{
                if(rightNode==null)
                    rightNode = new Node();
                rightNode.add(o);
            }
        }
    }
    public static void main(String[] args){
        int[] random = new int[]{67,7,30,73,10,0,78,81,10,74};

        Node roots = new Node();
        for(int i:random){
            roots.add(i);
        }
    }
}
