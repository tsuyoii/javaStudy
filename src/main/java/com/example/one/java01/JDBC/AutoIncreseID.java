package com.example.one.java01.JDBC;

import java.sql.*;

//自增长ID练习：当插入一条数据后，自动获取该数据id,并删除上一条数据
public class AutoIncreseID {
    public static void main(String[] args){
//        try{
////            Class.forName("com.mysql.jdbc.Driver");
////        }catch (ClassNotFoundException e){
////            e.printStackTrace();
////        }
////
////        String sql = "insert into hero values(null,?,?,?)";
////        String sql2="delete from hero where id=?";
////        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
////            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
////            PreparedStatement ps2 = c.prepareStatement(sql2)){
////            ps.setString(1, "盖伦");
////            ps.setFloat(2,313.0f);
////            ps.setInt(3,50);
////            ps.execute();
////            ResultSet rs = ps.getGeneratedKeys();
////            if(rs.next()){
////                System.out.println(rs.getInt(1));
////                ps2.setInt(1,rs.getInt(1)-1);
////                int i=1;
////                while(ps2.executeUpdate()==0){
////                    ps2.setInt(1,rs.getInt(1)-(++i));
////                }
////            }
////        }catch (SQLException e){
////            e.printStackTrace();
////        }




        //写法二
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,?,?)";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            Statement s = c.createStatement()){
            ps.setString(1, "盖伦");
            ps.setFloat(2,313.0f);
            ps.setInt(3,50);
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                System.out.println("新增数据ID"+rs.getInt(1));
                int lastid=rs.getInt(1)-1;
                while(true){
                    String sql2="select * from hero where id="+lastid;
                    ResultSet rs2 = s.executeQuery(sql2);
                    if(rs2.next()){
                        s.execute("delete from hero where id="+lastid);
                        System.out.println("删除数据的ID"+lastid);
                        break;
                    }
                    else
                        lastid--;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
