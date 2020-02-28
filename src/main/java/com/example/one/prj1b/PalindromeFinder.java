package com.example.one.prj1b;

import com.example.one.prj0.In;

//找出文件中字符数大于等于4并且是回文的单词并显示
public class PalindromeFinder {
    public static void main(String []args) {
        int minlength = 4;
        //这里我用相对路径“./words.txt”或“words.txt”都会报错无法找到文件，暂时用绝对路径，下次添加上相对路径方法
        In a = new In("D:/one/src/main/java/com/example/one/prj1b/words.txt");
        Palindrome palindrome = new Palindrome();
        while (!a.isEmpty()) {
            String word = a.readString();
            if (word.length() >= 4 && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}


//import com.example.one.prj0.In;
//
//public class PalindromeFinder {
//    public static void main(String[] args) {
//        int minLength = 4;
//        In in = new In("D:/one/src/main/java/com/example/one/prj1b/words.txt");
//        Palindrome palindrome = new Palindrome();
//
//        while (!in.isEmpty()) {
//            String word = in.readString();
//            if (word.length() >= minLength && palindrome.isPalindrome(word)) {
//                System.out.println(word);
//            }
//        }
//    }
//}