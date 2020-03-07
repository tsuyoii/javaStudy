package com.example.one.java00.NumStr;

import java.util.Arrays;

//字符串的练习
public class StrWork {
    public static void main(String[] args){
        StrWork sw = new StrWork();
        String ss = sw.SuijiStr();
        sw.strArrOrder();
        sw.matchMima(ss);
        sw.matchDiGui(ss, ss.length());
    }
    //随机字符串(只含大小写和数字，例如验证码时可用)
    public String SuijiStr(){
        int c;
        char[] cs = new char[5];
        for(int i=0;i<=4;i++){
            c = (int)(Math.random()*94+33);
//            if((c>47&&c<58)||(c>64&&c<91)||(c>96&&c<123))
            if(Character.isLetter(c)||Character.isDigit(c))
                cs[i] = (char)c;
            else
                i--;
        }
        String str = new String(cs);
        System.out.print(str+"  ");
//        System.out.println();
        return str;
    }
    //查看某个字符的ASCLL值
    public void cAscll(char c){
        short s = (short)c;
        String sentence = "字符%c在ASCLL表中的值为%d";
        System.out.printf(sentence,c,s);
    }
    //字符串数组排序
    public void strArrOrder(){
        String[] srr = new String[8];
        System.out.println("排序前的");
        for(int i=0;i<srr.length;i++) {
            StrWork sss = new StrWork();
            srr[i] = sss.SuijiStr();
        }
        for(int i=0;i<srr.length-1;i++){
            for(int j=i+1;j<srr.length;j++){
                if(Character.toLowerCase(srr[i].charAt(0))>Character.toLowerCase(srr[j].charAt(0))){
                    String temp = srr[j];
                    srr[j] = srr[i];
                    srr[i] = temp;
                }
            }
        }
        System.out.print("排序后的" + Arrays.toString(srr));
    }
    //穷举法破解密码之for循环
    public void matchMima(String s){
        char[] cs = new char[s.length()];
        for(int i=0;i<s.length();i++){
            for(short c=48;c<123;c++){
                if(c==(short)(s.charAt(i))){
                    cs[i] = (char)c;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("for循环破译的密码："+Arrays.toString(cs));
    }
    //穷举法破解密码之递归
    public void matchDiGui(String s,int index){
        if(index==s.length()){
            System.out.println();
            return;
        }
        for(short c=48;c<123;c++) {
            if (c == (short) (s.charAt(index))) {
                matchDiGui(s,index+1);
                break;
            }
        }
    }
}
