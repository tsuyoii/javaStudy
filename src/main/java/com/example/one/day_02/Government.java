package com.example.one.day_02;
/**static 练习
 * 如果不使用外部类的任何实例成员，则使嵌套类为static*/
public class Government {
    /**private定义的变量只能在同一个.java文件中被使用*/
    private int treasury = 5;

    private void spend() {
        treasury -= 1;
    }

    private void tax() {
        treasury += 1;
    }

    public void report() {
        System.out.println(treasury);
    }
/**没有使用外部Government类的实例成员，可以发现这里是通过传参实现的调用*/
    public static Government greaterTreasury(Government a, Government b) {
        if (a.treasury > b.treasury) {
            return a;
        }
        return b;
    }
 /**没有使用外部Government类的实例成员*/
    public static class Peasant {
        public void doStuff() {
            System.out.println("hello");
        }
    }
/**使用了spend(),即使用了外部Government类的实例成员*/
    public class King {
        public void doStuff() {
            spend();
        }
    }

    public class Mayor {
        public void doStuff() {
            tax();
        }
    }

    public  class Accountant {
        public void doStuff() {
            report();
        }
    }

    public  class Thief {
        public void doStuff() {
            treasury = 0;
        }
    }

    public static class Explorer {
        public void doStuff(Government a, Government b) {
            Government favorite = Government.greaterTreasury(a, b);
            System.out.println("The best government has treasury " + favorite.treasury);
        }
    }
}