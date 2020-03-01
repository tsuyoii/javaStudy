package com.example.one.java00.classandnew;
//this关键字
public class thisHero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        //注，this不能在static方法中调用
        System.out.println("通过打印this看到的当前对象的虚拟地址："+this);
    }

    //通过this访问对象的属性
    public void setName1(String name){
        //参数名和属性名
        //前面是属性，后面是参数，将参数赋值给属性，很好理解
        //但由于属性名和参数名一致了，计算机也会无法分辨？？？
//        name = name;
    }
    //为了便于区分，我们就将参数名改一下
    public void setName2(String heroName){
        name =heroName;
    }
    //通过this访问
    public void setName3(String name){
        //将参数name赋值给this访问的属性
        this.name = name;
    }

    public static void main(String[] args){
        thisHero garen = new thisHero();
        thisHero teemo = new thisHero();
        thisHero h = new thisHero();

        garen.name="盖伦";
        teemo.name = "提莫";

        System.out.println("直接打印实例化的对象garen:"+garen);
        System.out.println("直接打印实例化的对象teemo:"+teemo);

        garen.showAddressInMemory();
        teemo.showAddressInMemory();

//        h.setName1("name1");
        //显示null
//        System.out.println(h.name);
        h.setName2("name2");
        System.out.println(h.name);
        h.setName3("name3");
        System.out.println(h.name);
    }
}
