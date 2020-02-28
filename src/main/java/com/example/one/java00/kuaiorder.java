package com.example.one.java00;
////块的执行顺序
//public class kuaiorder {
////类对应的块
//    //方法对应的块，必须被调用才执行，可多次调用，可多次执行
//    public void method1(){
//        System.out.println("方法对应的块");
//    }
//    //普通块，当类被实例化时执行，比静态块的加载时执行慢，比方法的调用时执行快
//    {
//        System.out.println("普通块");
//    }
//    public static void main(String[] args){
//    //静态main方法对应的块，jvm调用main方法才执行
//        System.out.println("静态main方法对应的块");
//        //可以执行普通块，类被实例化了，所以执行了类中的普通类
//        kuaiorder aa = new kuaiorder();
//        aa.method1();
//    }
////静态块，类被加载时执行，只执行一次
//    static{
//        System.out.println("静态块");
//    }
//}





//继承时的块执行顺序
class kuaiorder{
    public static void main(String[] args){
        System.out.println("静态main方法");
        new D();
    }
}
class C {
    static{
        System.out.println("父静态块");
    }
    C(){
        System.out.println("父方法构造体");
    }
    {
        System.out.println("父普通块");
    }
}
class D extends C{
    //子普通方法调用
    public String sd1=getSd1();
    //子静态方法
    static public String getSd(){
        System.out.println("子静态方法调用");
        return "sd";
    }
    //子静态块
    static{
        System.out.println("子静态块");
    }
    //子静态方法调用
    public static String sd=getSd();
    D(){
        System.out.println("子构造方法");
    }
    {
        System.out.println("子普通块");
    }
    public String getSd1(){
        System.out.println("子普通方法调用");
        return "sd1";
    }
}
