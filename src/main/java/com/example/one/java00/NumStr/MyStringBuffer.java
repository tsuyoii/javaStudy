package com.example.one.java00.NumStr;

public class MyStringBuffer implements IStringBuffer{
    //value用于存放字符数组
    char[] value;
    int capacity = 19;
    int len = 0;
    public MyStringBuffer(){
        //根据容量初始化value
        value = new char[capacity];
    }
    public MyStringBuffer(String str){
        this();
        if(str==null){
            return;
        }
        if(str.length()>capacity){
            capacity = value.length*2;
            value = new char[capacity];
        }
        if(capacity>=str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
        len = str.length();
    }
    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0, "let ");
        System.out.println(sb);

        sb.insert(10, "be ");
        System.out.println(sb);
        sb.insert(0, "God Say:");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append('?');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);

    }
    @Override
    public void append(String str){
        //追加字符串
        insert(len, str);
    }
    @Override
    public void append(char c){
        //追加字符
        append(String.valueOf(c));
    }
    @Override
    public void insert(int pos,char b){
        //在特定位置处插入字符
        insert(pos, String.valueOf(b));
    }
    public void insert(int pos,String b){
        //指定位置插入字符串
        if(pos<0||pos>len||b==null)
            return;
        while(len+b.length()>capacity){
            capacity = (int)((len+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, len);
            value = newValue;
        }
        char[] cs = b.toCharArray();
        System.arraycopy(value, pos, value, pos+b.length(), b.length());
        System.arraycopy(cs, 0, value, pos, cs.length);
        len +=cs.length;
    }
    public void delete(int start){
        //从开始位置删除剩下的
        delete(start, len);
    }
    public void delete(int start,int end){
        //从开始位置删除结束位置-1
        if(start<0||end>len||start>len||end<0||end<start||end-start==len)
            return;
        System.arraycopy(value, end, value, start, len-end);
        len -= (end-start);
    }
    public void reverse(){
        //反转
        for(int i=0;i<len/2;i++){
            char temp = value[i];
            value[i] = value[len-i-1];
            value[len-i-1] = temp;
        }
    }
    public int length(){
        //返回长度
        return len;
    }
    public String toString(){
        char[] realValue = new char[len];
        System.arraycopy(value, 0, realValue, 0, len);
        return new String(realValue);
    }
}
