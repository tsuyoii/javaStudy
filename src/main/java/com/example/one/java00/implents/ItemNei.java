package com.example.one.java00.implents;
//内部类的练习
//匿名类
//public abstract class ItemNei {
//    public abstract void disposable();
//    public static void main(String[] args){
//        ItemNei in = new ItemNei() {
//            @Override
//            public void disposable() {
//                System.out.println("disposable");
//            }
//        };
//        in.disposable();
//    }
//}


//本地类
public abstract class ItemNei{
    public String name;
    public abstract void disposable();
    public static void main(String[] args){
        class BendiNei extends ItemNei{
            @Override
            public void disposable(){
                System.out.println("本地类"+name);
            }
        }
        BendiNei bn = new BendiNei();
        bn.name = "bn";
        bn.disposable();
    }
}

//非静态内部类
//public class ItemNei{
//    private String name;
//    class NotStaticNei{
//        public void disposable(){
//            System.out.println("非静态内部类可直接使用所有外部类属性及方法"+name);
//        }
//    }
//    public static void main(String[] args){
//        ItemNei in = new ItemNei();
//        in.name = "konan";
//        NotStaticNei nsn = in.new NotStaticNei();
//        nsn.disposable();
//    }
//}


//静态内部类
//public class ItemNei{
//    private String name;
//    public int age;
//    static class StaticNei{
//        String name;
//        int age;
//        public void disposable(){
//            System.out.println("静态内部类不可直接使用所有外部类属性及方法"+name+age);
//        }
//    }
//    public static void main(String[] args){
//        ItemNei.StaticNei sn = new ItemNei.StaticNei();
//        sn.name="onan";
//        sn.age = 15;
//        sn.disposable();
//    }
//}
