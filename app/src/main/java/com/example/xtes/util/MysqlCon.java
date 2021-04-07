package com.example.xtes.util;


import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon {

    //资料库定义
    String mysql_ip="192.168.0.109";
    int mysql_port=3306;
    String db_name="test";
    String url="jdbc:mysql://"+mysql_ip+":3306/"+db_name;
    String db_user="local";
    String db_password="123456";


    public void run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Log.v("DB","加載驅動成功");
        }catch( ClassNotFoundException e) {
            Log.e("DB","加載驅動失敗");
            return;
        }

        // 連接資料庫
        try {
            java.sql.Connection cn= DriverManager.getConnection(
                    "jdbc:mysql://"+mysql_ip+":3306/"+db_name,"local",
                    "123456");
            Log.v("DB","遠端連接成功");
        }catch(SQLException e) {
            Log.e("DB","遠端連接失敗");
            Log.e("DB", e.toString());
        }
    }

    public String getData() {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM test1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                String id = rs.getString("id");
                String name = rs.getString("name");
                data += id + ", " + name + "\n";
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }



}
