package com.example.one.java01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//jdbc的增删改
public class InsertUpdateDel {
    public static void main(String[] args){

    }
    public static void execute(String sql){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root","sa110");
            Statement s=c.createStatement()){
            s.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
