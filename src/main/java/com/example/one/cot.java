package com.example.one;

public class cot {
    //静态方法调用非静态函数会出错,打印*
    public static void DrawTriangle(int N){
        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    continue练习
public static void windowPosSum(int[] m, int n){
        for(int i=0;i<m.length;i++){
         if(i<m.length-n) {
             if (m[i] < 0)
                 continue;
             for (int j = 1; j <= n; j++) {
                 m[i] += m[i + j];
             }
         }
         else
             for (int j = 1; j < m.length-i; j++) {
                 m[i] += m[i + j];
             }
        }
        System.out.println(java.util.Arrays.toString(m));
//    for(int i=0;i<m.length;i++){System.out.print(m[i]+"  ");}
    System.out.println();
}
    //展示最大值
    public static int max(int[] m){
        for(int i=0;i<m.length;i++) {
            if (m[0] <= m[i])
                m[0] = m[i];
        }
        return m[0];
    }
    public static void main(String[] args){
        int[] num ={1,2,-3,4,5,4};
        windowPosSum(num,3);
//        for(int i=1;i<=5;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int[] number = new int[]{6,7,6,7};
        System.out.println(max(number));
        DrawTriangle(4);


//      continue用法
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (int i = 0; i < a.length; i += 1) {
            if (a[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }

//        break用法

        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                if (a[i].contains("horse")) {
                    break;
                }
                System.out.println(a[i]);
            }
        }


//          *
//         ***
//        *****
        for(int i=1;i<=5;i+=2){
                for (int k = (6 - i) / 2; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
