package com.example.one.java01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//预编译
public class PreStatement {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,?,?)";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,"提莫");//设置第一个参数，即sql语句中的第一个占位符?处的值为“提莫”
            ps.setFloat(2,313.0f);
            ps.setInt(3,50);

            //执行
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
