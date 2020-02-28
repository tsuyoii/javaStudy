package com.example.one.day_02;

public class IntNode {
    public IntNode prev;
    public int item;
    public IntNode next;

    public IntNode(int x, IntNode n){
        item = x;
        next = n;
    }
}
