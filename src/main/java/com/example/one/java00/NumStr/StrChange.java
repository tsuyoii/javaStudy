package com.example.one.java00.NumStr;
//字符串转换
public class StrChange {
    public static void main(String[] args){
        float f = 3.14F;
        String s ="3.1a4";

        //将浮点数转换成字符串
        //法一:String.valueOf()方法
        String str = String.valueOf(f);

        //法二：装箱成对象后，对象.toString()
        Float ff = f;
        String str2 = ff.toString();


        //将字符串转换回浮点型:类类型.parseXXX()
        float ffs = Float.parseFloat(str);
        float ffs2 = Float.parseFloat(str2);
        //报错NumberFormatException: For input string: "3.1a4"
//        float ffs3 = Float.parseFloat(s);

        System.out.println("str1:"+str);
        System.out.println("str2:"+str2);
        System.out.println("ffs1:"+ffs);
        System.out.println("ffs2:"+ffs2);
//        System.out.println("ffs3:"+ffs3);
    }
}
