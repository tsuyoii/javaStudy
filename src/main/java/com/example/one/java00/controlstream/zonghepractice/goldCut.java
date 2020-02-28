package com.example.one.java00.controlstream.zonghepractice;
//黄金分割点
public class goldCut {
    public static void main(String[] args){
        boolean breakout = false;
        int beichushu=1;
        int chushu=1;
        double min = 1;
        for(double i = 1; i <= 20; i++){
            for(double j = 1; j <= 20; j++){
                //不能这样，因为8是4的倍数，会排除了此答案
//                if((i*j)%4==0)
                if(i % 2 == 0 && j % 2 == 0)
                    continue;
                if(Math.abs(min) > Math.abs(i/j-0.618)) {
                    min = i / j-0.618;
                    //保存i,j
                    beichushu = (int) i;
                    chushu = (int) j;
                }
            }
        }
        System.out.println("这两个数分别为"+beichushu+", "+chushu);
    }
}
