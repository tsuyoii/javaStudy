package com.example.one.java01.JDBC;

import java.sql.*;

//数据库的查询,例，判断账号密码是否正确
public class QueryJDBC {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            Statement s = c.createStatement()){
            String username = "英雄8";
            String userhp="313";

            String sql="select * from hero where name='" +username+ "'and hp='" +userhp+ "'";
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                System.out.println("账号密码正确"+rs.getInt("id")+rs.getString(2));
            }
            else
                System.out.println("账号密码错误");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
