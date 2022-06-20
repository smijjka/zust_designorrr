package cn.edu.zust.se.order.util;

import java.sql.*;

public class DBUtil {
    private static Connection con=null;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static boolean openConnection(String url,String userName,String pwd){
        //单个连接无法满足实际需求，一般会采用数据库连接池
        try {
            if(con==null||con.isClosed())
                con= DriverManager.getConnection(url,userName,pwd);

            System.out.println("数据库连接创建成功");
            return true;
        } catch (SQLException e) {
            con=null;
            return false;
        }
    }
    public static boolean closeConnection(){
        try {
            if(con!=null&&!con.isClosed()){
                con.close();
                con=null;
            }
            System.out.println("数据库连接成功关闭");
        } catch (SQLException e) {
            con=null;
        }
        return true;
    }
    public static ResultSet select(String sql){
        if(con==null)
            return null;
        try {
            Statement st=con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
    }
    public static Integer update(String sql){
        if(con==null)
            return null;
        try {
            Statement st=con.createStatement();
            //int ok=st.executeUpdate(sql);
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            return null;
        }
    }
}
