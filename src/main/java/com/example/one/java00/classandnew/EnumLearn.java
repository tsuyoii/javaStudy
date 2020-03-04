package com.example.one.java00.classandnew;

//枚举的练习
//public enum Season{中，enum也是一个类，要使用public,必须文件名也是Season,直接将enum当做class
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
public class EnumLearn {
    public static void main(String[] args){
        int season = 5;
        switch (season) {
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
        }
    }
}
