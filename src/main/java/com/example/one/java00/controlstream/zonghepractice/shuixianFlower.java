package com.example.one.java00.controlstream.zonghepractice;
//练习水仙花数
public class shuixianFlower {
    public static void main(String[] args){
        for(int i=100;i<=999;i++){
            int ge = i%10;
//            不能这样写，因为右移2是指除以2^2=4,不是10^2
//            int shi = (i>>1)%10;
//            int bai = i >> 2;
            int shi = (i/10)%10;
            int bai = i/100;
            if(i==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai, 3))
//                System.out.println("水仙花数"+bai+shi+ge);
                System.out.println("水仙花数"+i);
        }
    }
}
