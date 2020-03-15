package com.example.one.java01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//一次性向数据库插入数据
public class JDBCInserte {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" +
                        "/how2java?characterEncoding=UTF-8","root","sa110");
                Statement s = conn.createStatement();
                ){
                    for(int i=0;i<100;i++){
                        String sql="insert into hero values(null," + "'英雄"+i+"'" + "," + 313.0f + "," + 50 + ")";
                        s.execute(sql);
                    }
                 }catch (SQLException e){
                    e.printStackTrace();
                 }
    }
}
