package com.example.one.prj1b;

import org.junit.Test;

import static org.junit.Assert.*;

public class testPalindrome {
    /*法一
    public static void main(String args[]){
        testWordToDeque();
    }
    public static void testWordToDeque(){
        Palindrome testWord = new Palindrome();
        Deque wordList = testWord.wordToDeque("persiflage");
        checkStringToChar("persiflage",wordList);
    }
    public static void checkStringToChar(String expect,Deque d){
        String actual = "";
        for(int i=0;i<expect.length();i++){
            actual += d.get(i);
        }
        assertEquals(expect,actual);
    }
*/

/***@Test表示测试，可以不用写main方法***/
    static Palindrome palindrome = new Palindrome();
    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        /**具体使用可以参见jUnit使用文档，网页http://junit.sourceforge.net/javadoc/org/junit/Assert.html**/
        assertEquals("persiflage", actual);
    }


    //回文测试
    @Test
    public void testIsPalindrome(){
        //方法详情参见junit使用文档，网址同上
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome("AAAaAAA"));
        assertTrue(palindrome.isPalindrome("ABBA"));
        assertFalse(palindrome.isPalindrome("Aa"));
        assertFalse(palindrome.isPalindrome("ACDC"));
        assertFalse(palindrome.isPalindrome("yang"));
    }

    //广义回文测试
    @Test
    public void testIsPalindromeCC(){
        OffByOne offbyone = new OffByOne();
        assertTrue(palindrome.isPalindrome("",offbyone));
        assertTrue(palindrome.isPalindrome("a", offbyone));
        assertTrue(palindrome.isPalindrome("flake",offbyone));
        assertTrue(palindrome.isPalindrome("zyzy", offbyone));
        assertTrue(palindrome.isPalindrome("yyxz", offbyone));
        assertTrue(palindrome.isPalindrome("yyyxz", offbyone));
        assertFalse(palindrome.isPalindrome("aa", offbyone));
        assertFalse(palindrome.isPalindrome("xyz", offbyone));
        assertFalse(palindrome.isPalindrome("aa", offbyone));
        assertFalse(palindrome.isPalindrome("zxzx", offbyone));
    }
}
