package com.example.one.java01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//数据库连接池
//1、构造方法和初始化设置连接池可放连接数
//2、init()初始化方法创建size条连接，但不关闭
//3、getConnection()先判断如果连接池不空则借一条连接出去
//4、returnConnection()使用完后，归还连接，并调用notifyAll()来唤醒其他线程
public class ConnectionPool {
    private int size;
    List<Connection> cs = new ArrayList<>();
    public ConnectionPool(int size){
        this.size = size;
        init();
    }
    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            for(int i=0;i<size;i++){
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
                cs.add(c);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection(){
        while(cs.isEmpty()){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Connection c = cs.remove(0);
        return c;
    }

    public synchronized void returnConnection(Connection c){
        cs.add(c);
        this.notifyAll();//唤醒等待的线程
    }
}
