package com.example.one.java00.DateLei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//日期格式化练习
public class DateFormat {
    public static void main(String[] args){
        Date[] dd = new Date[9];
        String[] dds = new String[9];
        String[] tts = new String[9];
        long suiji;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String startd ="1970/1/1 00:00:00";
        String endd = "2000/12/31 23:59:59";
        try{
            Date d1 = sdf.parse(startd);
            Date d2 = sdf.parse(endd);
            System.out.println("得到的随机日期数组");
            for(int i=0;i<dd.length;i++){
                suiji = (long)(Math.random()*(d2.getTime()-d1.getTime())+d1.getTime());
                dd[i] = new Date(suiji);
                dds[i] = sdf.format(dd[i]);
                System.out.println(dds[i]);
            }
            System.out.println("排序后的日期数组");
            Arrays.sort(dds);
            System.out.println(Arrays.toString(dds));
            System.out.println("按时间顺序排序后的日期数组");
            for(int i=0;i<dds.length;i++){
                tts[i] = dds[i].substring(11,dds[i].toCharArray().length);
            }
            String temp = "";
            for(int i=0;i<tts.length-1;i++){
                for(int j=i+1;j<tts.length;j++){
                    if(tts[i].compareTo(tts[j])>0){
                        temp = tts[j];
                        tts[j] = tts[i];
                        tts[i] = temp;

                        temp = dds[j];
                        dds[j] = dds[i];
                        dds[i] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(dds));
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
