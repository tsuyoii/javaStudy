package com.example.one.java00.controlstream.zonghepractice;
//小学算数题
public class mathwork {
    public static void main(String[] args){
//        outloop:
//        //a1<8,a2<8,a1<14,b1<14,a2<10,b1>6,b2<10
//        //a1<8,a2<8,6<b1<14,b2<10
//        for(int a1=0;a1<8;a1++){
//            for(int a2=0;a2<8;a2++){
//                for(int b1=14;b1>6;b1--){
//                    for(int b2=0;b2<10;b2++){
//                        if(a1+b1==14&&a2+b2==10&&a1+a2==8&&b1-b2==6) {
//                            System.out.println(a1);
//                            System.out.println(a2);
//                            System.out.println(b1);
//                            System.out.println(b2);
//                            break outloop;
//                        }
//                    }
//                }
//            }
//        }



        for(int a1=0;a1<8;a1++){
            int a2=8-a1;
            int b1=14-a1;
            int b2=10-(8-a1);
            if(b1-b2==6) {
                System.out.println(a1);
                System.out.println(a2);
                System.out.println(b1);
                System.out.println(b2);
                break;
            }
        }
    }
}
