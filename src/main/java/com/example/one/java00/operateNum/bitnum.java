package com.example.one.java00.operateNum;

import static java.lang.Math.*;

//位操作符
public class bitnum {
//    一个整数的二进制表达
    public static void Binary(int i){
        String str = Integer.toBinaryString(i);
        System.out.println(str);
    }
//    进行乘法运算
    public static void multiply(int num1,int num2){
        //乘以2^num2即为左移num2
        //floor向下取整，舍小数点，是整数则返回本身，log()计算以10为底的对数，log(num2)/log(2)表示以2为底的对数
        int n = (int)floor(log2(num2));
        int mult = num1 << n;
        while(log2(num2)!=n) {
            num2 = num2 - (int) pow(2, n);
            n = (int)floor(log2(num2));
            mult += num1 << n;
        }
        System.out.println(num1 << n);
        System.out.println(mult);
    }
    public static double log2(int num){
        return log(num)/log(2);
    }
    public static void main(String[] args){
        Binary(8);
        Binary(9);
    //位或|
        System.out.println(8 | 9);
    //位与&
        System.out.println(8 & 9);
    //异或^
        System.out.println(8 ^ 9);
    //取非~
        System.out.println( ~8 );
    //左移<<
        System.out.println(8 << 2);
    //右移>>(带符号)
        System.out.println(8 >> 3);
    //右移>>>(无符号)
        System.out.println(8 >>> 3);

    //乘法
        multiply(2, 17);
    }
}
