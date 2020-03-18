package com.example.one.java01.JDBC;

import com.example.one.java00.classandnew.Hero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//将数据库相关操作都封装在该类中
//实现接口DAO（Data Access Object）数据访问对象：
//public interface DAO{
//    //增加
//    public void add(Hero hero);
//    //修改
//    public void update(Hero hero);
//    //删除
//    public void delete(int id);
//    //获取
//    public Hero get(int id);
//    //查询
//    public List<Hero> list();
//    //分页查询
//    public List<Hero> list(int start, int count);
//}
public class HeroDAO {
    //将驱动的初始化放在了构造方法HeroDAO里,只用执行一次
    public HeroDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?character=UTF-8",
                "root","sa110");
    }
    //向数据库中插入一个Hero对象
    public void add(Hero h){
        String sql="insert into hero values(null,?,?,?)";
        try(Connection c = getConnection();
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
    public void delete(Hero h){
        try(Connection c = getConnection();
            Statement s = c.createStatement()){
            String sql="delete from hero where id="+h.id;
            s.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //根据id删除数据
    public void delete(int id){
        try(Connection c = getConnection();
            Statement s = c.createStatement()){
            String sql="delete from hero where id="+id;
            s.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //更新这条Hero对象
    public void update(Hero h){
        String sql="update hero set name = ? , hp = ?, damage = ? where id = ?";
        try(Connection c = getConnection();
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
    //提供id返回一个Hero对象
    public Hero get(int id){
        Hero h = null;
        try(Connection c = getConnection();
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
    public int getTotal(){
        //法一：直接调用另一个方法返回集合的长度
        // return list().size();
        //法二：
        int total=0;
        try(Connection c=getConnection();
            Statement s = c.createStatement()){
            String sql = "select count(*) from hero";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                total = rs.getInt(1);
            }
            System.out.println("数据库中共有"+total+"条数据");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return total;
    }
    //把所有的hero表中的数据查询出来，转换为Hero对象后，放在一个集合中返回
    public List<Hero> list(){
        return list(0,Short.MAX_VALUE);
    }
    //分页查询
    public List<Hero> list(int start,int count){
        List<Hero> heros = new ArrayList<>();
        String sql="select * from hero order by id desc limit ?,?";
        try(Connection c = getConnection();
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
}
