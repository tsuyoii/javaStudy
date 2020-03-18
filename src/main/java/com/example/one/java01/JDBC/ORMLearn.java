package com.example.one.java01.JDBC;

import com.example.one.java00.classandnew.Hero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//根据ORM对象和关系数据库的映射（及一个对象，对应一条数据记录）
//设计几个常见的ORM方法
public class ORMLearn {
    //向数据库中插入一个Hero对象
    public static void add(Hero h){
        run();
        String sql="insert into hero values(null,?,?,?)";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, h.name);
            ps.setFloat(2,(float)h.hp);
            ps.setInt(3,h.damage);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //把这个Hero对应的数据删掉
    public static void delete(Hero h){
        run();
        int id = h.id;
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            Statement s = c.createStatement()){
            String sql="delete from hero where id="+id;
            s.execute(sql);
            System.out.println("删除数据成功，"+h.id+" "+h.name+" "+h.hp+" "+h.damage);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //更新这条Hero对象
    public static void update(Hero h){
        run();
        String sql="update hero set name = ? , hp = ?, damage = ? where id = ?";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, h.name);
            ps.setFloat(2, (float)h.hp);
            ps.setInt(3, h.damage);
            ps.setInt(4, h.id);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //分页查询
    public static List<Hero> list(int start,int count){
        run();
        List<Hero> heros = new ArrayList<>();
        String sql="select * from hero limit ?,?";
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setInt(1,start);
            ps.setInt(2,count);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Hero h = new Hero();
                h.id = rs.getInt(1);
                h.name=rs.getString("name");
                h.hp = rs.getFloat(3);
                h.damage = rs.getInt("damage");
                heros.add(h);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return heros;
    }
    //把所有的hero表中的数据查询出来，转换为Hero对象后，放在一个集合中返回
    public static List<Hero> list(){
        return list(0,Short.MAX_VALUE);
    }
    //提供id返回一个Hero对象
    public static Hero get(int id){
        run();
        Hero h = null;
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","sa110");
            Statement s = c.createStatement()){
            String sql="select * from hero where id="+id;
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                h = new Hero();
                h.name=rs.getString(2);
                h.hp= rs.getFloat("hp");
                h.damage = rs.getInt(4);
                h.id = id;
            }
        }catch (SQLException e){
            System.out.println("数据库中没有此数据");
            e.printStackTrace();
        }
        return h;
    }
    //获取共有多少条数据
    public static int getTotal(){
        return list().size();
    }
    public static void run(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        int totalnum = getTotal();
        System.out.println("数据库中共有"+totalnum+"条数据");


        System.out.println("新增一条数据");
        Hero h = new Hero();
        h.name="柯南";
        h.hp=333.0f;
        h.damage=50;
        add(h);
        totalnum = getTotal();
        System.out.println("数据库中共有"+totalnum+"条数据");


        Hero hg = get(33);
        System.out.println("取出id="+hg.id+"的数据,其name是"+hg.name);

        hg.name="英雄101";
        update(hg);
        System.out.println("把名字改为"+hg.name+"并且更新到数据库");
        hg=get(33);
        System.out.println("取出id="+hg.id+"的数据,其name是"+hg.name);

        delete(hg);
        System.out.println("删除id="+hg.id+"的数据");
        totalnum = getTotal();
        System.out.println("数据库中共有"+totalnum+"条数据");
    }
}
