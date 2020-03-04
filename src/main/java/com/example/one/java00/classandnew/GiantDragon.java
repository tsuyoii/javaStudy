package com.example.one.java00.classandnew;
//饿汉式单例模式和懒汉式单例模式

public class GiantDragon{

}

//饿汉式
class GiantDragon_e{
    //私有化构造方法
    private GiantDragon_e(){

    }
    //准备一个类属性，指向实例化对象
    private static GiantDragon_e Instance = new GiantDragon_e();
    //public static方法获得对象
    public static GiantDragon_e getInstance(){
        return Instance;
    }
}

//饿汉式测试
class TestGiantDragon_e{
    //不能new实例会报错
    public static void main(String[] args){
        GiantDragon_e e1 = GiantDragon_e.getInstance();
        GiantDragon_e e2 = GiantDragon_e.getInstance();
        GiantDragon_e e3 = GiantDragon_e.getInstance();

        System.out.println(e1==e2);
        System.out.println(e1==e3);
    }
}


//懒汉式
class GiantDragon_lan{
    //私有化构造方法
    private GiantDragon_lan(){}
    //准备一个类属性，指向null
    private static GiantDragon_lan Instance2 = new GiantDragon_lan();
    //public static方法获取对象
    public static GiantDragon_lan getInstance(){
        if(null==Instance2){
            Instance2 = new GiantDragon_lan();
        }
        return Instance2;
    }
}
//懒汉式测试
class TestGiantDragon_lan{
    //不能new实例会报错
    public static void main(String[] args){
        GiantDragon_lan lan1 = GiantDragon_lan.getInstance();
        GiantDragon_lan lan2 = GiantDragon_lan.getInstance();
        GiantDragon_lan lan3 = GiantDragon_lan.getInstance();

        System.out.println(lan1==lan2);
        System.out.println(lan1==lan3);
    }
}
