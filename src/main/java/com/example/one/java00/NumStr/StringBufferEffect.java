package com.example.one.java00.NumStr;

//stringBuffer性能
public class StringBufferEffect {
    public static void main(String[] args){
        StringBufferEffect sbe = new StringBufferEffect();
        String[] strs=new String[10000];
        for(int i=0;i<10000;i++){
            strs[i] = sbe.RandomString(10);
        }
        sbe.StringEct(strs);
        sbe.StrBufferEct(strs);
    }
    //生成任意位长度的随机字符串
    public String RandomString(int len){
        char[] cs = new char[len];
        for(int i=0;i<len;i++){
            char c = (char)(Math.random()*75+48);
            if(Character.isDigit(c)||Character.isLetter(c)){
                cs[i] = c;
            }
            else
                i--;
        }
        String str = new String(cs);
        System.out.println(str);
        return str;
    }
    //使用String的+连接多个随机字符串，计算消耗的时间
    public void StringEct(String[] strs){
        long start = System.currentTimeMillis();
        String ss = "";
        for(int i=0;i<strs.length;i++){
            ss += strs[i];
        }
        System.out.println("String连接后的字符串"+ss);
        long end = System.currentTimeMillis();
        System.out.println("String连接耗时"+(int)(end - start)+"毫秒");
    }
    //使用StringBuffer连接字符串所消耗的时间
    public void StrBufferEct(String[] strs){
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer(strs[0]);
        for(int i=1;i<strs.length;i++){
            sb.append(strs[i]);
        }
        System.out.println("StringBuffer连接后的字符串"+sb);
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer连接耗时"+(int)(end - start)+"毫秒");
    }
}
