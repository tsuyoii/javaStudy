package com.example.one.java01.JDBC;

import java.sql.*;

//普通数据库操作与数据连接池性能对比
//向数据库中插入100条数据，比较传统方式和数据库连接池方式的性能差异
//
//        1. 使用传统方式创建100个线程，每个线程都会创建新的连接，通过这个连接向数据库插入1条数据，然后关闭这个连接。
//
//        2. 使用数据库连接池的方式，创建一个有10条连接的连接池，然后创建100个线程，每个线程都会向连接池借用连接，借用到后，向数据库插入1条数据，然后归还这个连接。
//
//        通过时间统计，比较这两种方式的性能表现差异。
public class ConnectionandPoolTest {
    public static void main(String[] args){
        long start1 = System.currentTimeMillis();
        ConnectionPool cp = new ConnectionPool(10);//创建一个含有10条连接的连接池
        for(int i=0;i<100;i++){
            new WorkingThread("Working thread"+i,cp).start();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("数据库连接池方式耗时"+(int)(end1-start1));



        long start2 = System.currentTimeMillis();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        for(int i=0;i<100;i++){
            String sql = "insert into hero values(null,?,?,?)";
            try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
                PreparedStatement ps = c.prepareStatement(sql)){
                ps.setString(1, "英雄"+i+i);
                ps.setFloat(2, 313.0f);
                ps.setInt(3,50);
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("普通方式操作SQL语句耗时"+(int)(end2-start2));
    }
}

class WorkingThread extends Thread{
    private ConnectionPool cp;
    public WorkingThread(String name,ConnectionPool cp){
        super(name);
        this.cp = cp;
    }
    public void run(){
        Connection c = cp.getConnection();
        System.out.println(this.getName()+"获得连接，开工");
        String sql = "insert into hero values(null,?,?,?)";
        try(PreparedStatement ps = c.prepareStatement(sql)){
            //模拟耗时1s的数据库SQL服务
            Thread.sleep(1000);
            ps.setString(1, "英雄"+00);
            ps.setFloat(2, 313.0f);
            ps.setInt(3,50);
            ps.execute();
        }catch (SQLException | InterruptedException e){
            e.printStackTrace();
        }
        cp.returnConnection(c);
    }
}
