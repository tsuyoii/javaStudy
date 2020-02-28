package com.example.one.day_02;

public class IntList{
    public int first;
    public IntList rest;

    public IntList(int f,IntList r){
        first = f;
        rest = r;
    }
    public static void main(String[] args){
//        IntList origin = new IntList(1,new IntList(2,null));
        IntList origin = IntList.of(1,2);
        IntList origin1 = IntList.of(1,2);
        dSquareList(origin);
        IntList L =IntList.catenate(origin,origin1);
    }

    public static IntList of(int... a) {
        int i=a.length-1;
        IntList L=new IntList(a[i], null);;
        while(i>0){
            L= new IntList(a[--i], L);
        }
        return L;
    }

    //修改列表，使元素平方
    public static void dSquareList(IntList L){
        while(L!=null){
            L.first*=L.first;
            L=L.rest;
        }
    }
    //连接两个IntList
    public  static IntList catenate(IntList A,IntList B){
        IntList L;
        L=A;
        while(A.rest!=null){
            A=A.rest;
        }
            A.rest = B;
        return L;
    }
}
