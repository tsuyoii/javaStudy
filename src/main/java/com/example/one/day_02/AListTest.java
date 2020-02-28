package com.example.one.day_02;

public class AListTest {
    public void SpeedAListTest(){
        int i=0;
        AList items = new AList();
        while(i<10000000){
            items.addLast(i);
            i++;
        }
    }
}
