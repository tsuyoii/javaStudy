package com.example.one.day_02;

public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deleteItems;
    public void printLostItems(){
        deleteItems.print();
    }
}
