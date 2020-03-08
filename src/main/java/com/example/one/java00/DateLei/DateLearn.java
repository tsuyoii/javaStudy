package com.example.one.java00.DateLei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//创建日期对象
public class DateLearn {
    public static void main(String[] args){
        //当前时间
        Date d1 = new Date();
        System.out.println("当前时间是"+d1);
        System.out.println("当前时间是"+d1.toString());//与上一行格式一样

        long jingli = d1.getTime();
        System.out.println("从基准到现在经历了多少毫秒"+d1.getTime());
        System.out.println("从基准到现在经历了多少毫秒"+jingli);

        //从1979.1.1.8:00:00开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历5秒后的时间"+d2);


        DateLearn dl = new DateLearn();
        dl.RandomDate();
    }
    //借助随机数，创建一个从1995.1.1 00:00:00到1995.12.31 23:59:59之间的随机日期
    public void RandomDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String startd = "1995/01/01 00:00:00";
        String endd = "1995/12/31 23:59:59";
        try{
            Date d1 = sdf.parse(startd);
            Date d2 =sdf.parse(endd);
            System.out.println(startd+"转换后的日期对象"+d1);
            System.out.println(endd+"转换后的日期对象"+d2);

            long suiji = (long)(Math.random()*(d2.getTime()-d1.getTime())+d1.getTime());
            System.out.println("从中任取一个随机时间"+suiji);
            Date dd = new Date(suiji);
            System.out.println("从中任取一个随机时间"+dd);

        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
