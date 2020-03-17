package com.example.one.java01.JDBC;

import java.sql.*;
import java.util.Scanner;

//事务练习:设计一个代码，删除表中前10条数据，但是删除前会在控制台弹出一个提示：
//是否要删除数据(Y/N)
//如果用户输入Y，则删除
//如果输入N则不删除。
//如果输入的既不是Y也不是N，则重复提示
public class CommitLearn {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            Statement s = c.createStatement()){
            //关闭自动提交事务
            c.setAutoCommit(false);
            int len=10;
            for(int i=1;i<=len;i++){
                ResultSet rs = s.executeQuery("select * from hero where id="+i);
                System.out.println("试图删除数据id="+i);
                if(rs.next()) {
                    String sql = "delete from hero where id=" + i;
                    s.execute(sql);
                }
                else
                    len++;
            }
            System.out.println("是否要一并删除数据(y/n)");
            Scanner scan = new Scanner(System.in);
            if(scan.next().equals("y")) {
                //手动提交事务
                c.commit();
                System.out.println("已提交删除操作");
            }
            else
                System.out.println("取消删除操作");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
