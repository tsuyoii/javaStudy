package com.example.one.java00.implents;

import com.example.one.java00.classandnew.Hero;

public interface Healer {
    public void heal();
}
class Support extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println(":稳住，我们能赢");
    }
}
