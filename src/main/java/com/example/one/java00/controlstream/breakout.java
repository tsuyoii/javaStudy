package com.example.one.java00.controlstream;
//通过break+其他方法来实现退出外部循环的功能
public class breakout {
    public static void main(String[] args){
        breakout bb = new breakout();
        bb.method1();
        bb.method2();
        bb.method3();
    }
    //break只能结束当前所在的一层循环
    public void method1(){
        for (int i = 0; i < 10; i++) {
            for(int j = 1; j < 10; j++){
                if(j%2==0)
//                    break;
                    continue;
                System.out.println("i:"+i+", j:"+j);
            }
        }
    }

    //使用boolean变量结束外部循环
    public void method2(){
        boolean breakout = false;//使用boolean变量作为是否终止外部循环的标记
        for (int i = 0; i < 10; ++i) {
            for (int j = 1; j < 10; j++) {
                if(j%3==0) {
                    breakout = true;
//                    break;
                    continue;
                }
                System.out.println("i:"+i+", j:"+j);
            }
            if(breakout)
                break;
        }
    }


    //使用标签结束外部循环
    public void method3(){
        outloop:    //这个只作为一个标签，名字，可以随便起名，其实类似于前面的breakout标记，也有点类似goto命令，但一般不推荐使用
        for (int i = 0; i < 10; ++i) {
            for (int j = 1; j < 10; j++) {
                if(j%4==0)
//                    break outloop;//外部循环终止，
                    continue outloop;//立马外部循环跳转下一次循环
                System.out.println("i:"+i+", j:"+j);
            }
        }
    }
}
