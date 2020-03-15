package com.example.one.java01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
//    public static void main(String[] args){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("数据库驱动初始化成功");
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }




    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动初始化成功");
            }catch (ClassNotFoundException e){
            e.printStackTrace();
            }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "sa110");
            Statement s = c.createStatement()){
                System.out.println("数据库连接成功,获取连接对象：" + c);
                System.out.println("获取Statement对象:" + s);
                String sql = "insert into hero values (null, " + "'提莫'" + ", " + 313.0f + ", " + 50 + ")";
                s.execute(sql);
                System.out.println("执行插入语句成功");
            }catch (SQLException e){
                e.printStackTrace();
            }
    }
}
