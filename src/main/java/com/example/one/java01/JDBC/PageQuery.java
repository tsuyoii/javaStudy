package com.example.one.java01.JDBC;

import java.sql.*;

//分页查询及总数查询
public class PageQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        list(3, 5);
    }
    public static void list(int start,int count){

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            Statement s = conn.createStatement()){
//            if(start==0){
//                start=1;
//            }
            System.out.println("查询数据为第"+(start+count)/count+"页");
//            for(int i=0;i<count;i++){
//                int temp = start+i;
//                String sql = "select * from hero where id="+temp;
//                ResultSet rs = s.executeQuery(sql);
//                if(!rs.next()){
//                    System.out.println("后面没有数据了");
//                    break;
//                }
//                System.out.println("数据"+rs.getInt(1));
//            }


            //法二
            String sql = " select * from hero limit " + start + "," +count;
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                System.out.println("获取到数据"+rs.getInt(1));
            }

            String sql2 = " select count(*) from hero";
            ResultSet rs2 = s.executeQuery(sql2);
            int totalnum=0;
            while (rs2.next()){
                totalnum = rs2.getInt(1);
            }
            System.out.println("共有"+totalnum+"条数据");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
