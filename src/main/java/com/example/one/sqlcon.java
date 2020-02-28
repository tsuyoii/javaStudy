package com.example.one;

import java.io.IOException;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class sqlcon {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PreparedStatement ps = null;
        Connection ct = null;
        ResultSet rs = null;

        String url = "jdbc:sqlserver://localhost:1433;databaseName=bishe";
        String user="sa";
        String password="110";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(Exception e) {
            e.printStackTrace();
        }
        try {
            ct=DriverManager.getConnection( url,user,password);
        }catch(Exception e) {
            e.printStackTrace();
        }

        try {
            Statement stmt=ct.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query="SELECT yh_uname from yh_account";

            ct.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs1=stmt.executeQuery(query);
            String list="";
            if(rs1.first()){
                System.out.println(rs1.getString(1));
                list=rs1.getString(1);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}


