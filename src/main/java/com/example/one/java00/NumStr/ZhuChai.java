package com.example.one.java00.NumStr;
//装箱与拆箱的练习
public class ZhuChai {
    public static void main(String[] args){
        byte b = 1;
        short s = 1;
        int i = 1;
        float f = 1;
        double d = 1;

        //手动将基本类型转换成类类型
        Byte bt = new Byte(b);
        Short st = new Short(s);
        Integer it = new Integer(i);
        Float ft = new Float(f);
        Double dt = new Double(d);
//    Number bn = new Number(b);报错，number类是抽象类
        System.out.println("手动将基本类型转换成类类型byte:"+bt);
        System.out.println("手动将基本类型转换成类类型short:"+st);
        System.out.println("手动将基本类型转换成类类型int:"+it);
        System.out.println("手动将基本类型转换成类类型float:"+ft);
        System.out.println("手动将基本类型转换成类类型double:"+dt);


        //自动装箱
        Byte bz = b;
        Short sz = s;
        Integer iz = i;
        Float fz = f;
        Double dz = d;


//        不同类型之间的转换，有的是不行的，自行尝试
//        Byte bi = i;
//        Byte bbi = new Integer(i);
//        Integer ib = b;
//        Integer is = s;
//
        int ii = bz;
        int iii = bz.intValue();
//        byte bb = iz;
//        byte bbb = iz.byteValue();

        System.out.println("自动装箱（将基本类型转换成类类型）byte:"+bz);
        System.out.println("自动装箱（将基本类型转换成类类型）short:"+sz);
        System.out.println("自动装箱（将基本类型转换成类类型）int:"+iz);
        System.out.println("自动装箱（将基本类型转换成类类型）float:"+fz);
        System.out.println("自动装箱（将基本类型转换成类类型）double:"+dz);
        System.out.println("不同类型自动装箱:只能小转大"+ii);
        System.out.println("不同类型手动装箱（将基本类型转换成类类型）不需要强转:"+iii);




        //手动将封装类型（类类型）转换成基本类型
        byte bbt = bt.byteValue();
        short sst = st.shortValue();
        int iit = it.intValue();
        float fft = ft.floatValue();
        double ddt = dt.doubleValue();
        System.out.println("手动将封装类型（类类型）转换成基本类型byte:"+bbt);
        System.out.println("手动将封装类型（类类型）转换成基本类型short:"+sst);
        System.out.println("手动将封装类型（类类型）转换成基本类型int:"+iit);
        System.out.println("手动将封装类型（类类型）转换成基本类型float:"+fft);
        System.out.println("手动将封装类型（类类型）转换成基本类型double:"+ddt);





        //自动拆箱
//        byte bc = bt;
//        short sc = st;
//        int ic = it;
//        float fc = ft;
//        double dc = dt;
        byte bc = bz;
        short sc = sz;
        int ic = iz;
        float fc = fz;
        double dc = dz;
        System.out.println("自动拆箱（将封装类型（类类型）转换成基本类型）byte:"+bc);
        System.out.println("自动拆箱（将封装类型（类类型）转换成基本类型）short:"+sc);
        System.out.println("自动拆箱（将封装类型（类类型）转换成基本类型）int:"+ic);
        System.out.println("自动拆箱（将封装类型（类类型）转换成基本类型）float:"+fc);
        System.out.println("自动拆箱（将封装类型（类类型）转换成基本类型）double:"+dc);




//        byte的最大最小值
        System.out.println("byte最大值:"+Byte.MAX_VALUE);
        System.out.println("int最小值:"+Integer.MIN_VALUE);

    }

}
