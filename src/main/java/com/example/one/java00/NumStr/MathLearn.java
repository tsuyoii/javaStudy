package com.example.one.java00.NumStr;

//Math方法
public class MathLearn {
    public static void main(String[] args){
        MathLearn m = new MathLearn();
        m.math_e();
        m.zhishu(10000000);
    }
    //计算自然对数e并与Math.E对比
    public void math_e(){
        int n = Integer.MAX_VALUE;
        double e = (double) Math.pow((1+1d/n), n);
        System.out.println("计算e的结果"+e);
        System.out.println("Math取到的自然常数"+Math.E);
    }

    //统计10000000以内共有多少质数
    public void zhishu(int x){
        long start = System.currentTimeMillis();
        boolean isPrime;
        int count = 1;
        for(int i=3;i<=x;i+=2){
            isPrime = false;
            for(int j=3;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = true;
                    break;
                }
            }
            if(!isPrime)count++;
        }
//        2,3都算作质数，先排除，然后可以直接跳过2的倍数，在剩余数中查找
        System.out.println(x+"以内的质数共有"+count+"个");
        long end = System.currentTimeMillis();
        System.out.println("共耗费时间"+(int)(end-start)+"毫秒");
    }
}
