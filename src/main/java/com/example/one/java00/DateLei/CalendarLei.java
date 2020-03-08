package com.example.one.java00.DateLei;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Calendar的练习
public class CalendarLei {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        Date now = new Date();
        System.out.println("当前时间\t"+ sdf.format(c.getTime()));
        c.setTime(now);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,-3);
        System.out.println("下个月倒数第三天是\t"+sdf.format(c.getTime()));
    }
}
