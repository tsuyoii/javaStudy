package com.example.one.day_03;

public class testSort {
    public static void main(String[] args){
        testSort();
        testFindSmallest();
        testSwap();
    }
    public static void testSort(){
        String[] input = {"i","have","an","egg"};
        String[] expect = {"an","egg","have","i"};
        com.example.one.day_03.Sort.sort(input);
        //也可以使用内置方法java.util.Array.equals代替循环比较
        //或可以将循环改为org.junit.Assert.assertArrayEquals(expected,input);
//        for(int i=0;i<input.length;i++) {
//            if (!input[i].equals(expect[i])) {
//                System.out.println("Mismatch in position " + i + ", expected: " + expect[i] + ", but got: " + input[i] + ".");
//                break;
//            }
//        }
        org.junit.Assert.assertArrayEquals(expect,input);
    }
    public static void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int expect =2;

        int actual = com.example.one.day_03.Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expect,actual);


        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;

        int actual2 = com.example.one.day_03.Sort.findSmallest(input2,2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }
    public static void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};

        int a = 0;
        int b = 2;
        com.example.one.day_03.Sort.swap(input,a,b);
        org.junit.Assert.assertArrayEquals(expected,input);
    }
}
