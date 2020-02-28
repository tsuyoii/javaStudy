package com.example.one.prj1b;

public class Palindrome {
    //实现用Deque队列来顺序展示字符串word中的字符的签名
    public Deque<Character> wordToDeque(String word){
        ArrayDeque<Character> wordList = new ArrayDeque<>();
        for(int i=0;i<word.length();i++){
            //将char插入Deque<Character>,在字符串中获取第i个字符用.charAt(int index)方法
            wordList.addLast(word.charAt(i));
        }
        return wordList;
    }

    //具有带有签名的第二种方法
    //判断给定字符串是否是回文
    /**法一
    public boolean isPalindrome(String Word){
        for(int i=0;i<(Word.length()/2);i++){
            if(Word.charAt(i)!=Word.charAt(Word.length()-i))
                return false;
        }
        return true;
    }
     **/
    //判断回文法二，狭义回文：一个字符串从前到后与从后到前相同
    public boolean isPalindrome(String word){
        Deque<Character> wordList = wordToDeque(word);
        for(int i=0;i<wordList.size()-1;i++){
            if(wordList.removeFirst()!=wordList.removeLast())
                return false;
        }
        return true;
    }

    //使用以下签名添加一个重载的isPalindrome新方法，广义回文：一个字符串从前到后与从后到前依次取相邻或相差N相同
    public boolean isPalindrome(String word,CharacterComparator cc){
        Deque<Character> wordList = wordToDeque(word);
        for(int i=0;i<wordList.size()/2;i++){
            if(!(cc.equalChars(wordList.removeFirst(),wordList.removeLast())))
                return false;
        }
        return true;
    }
}
