package com.example.xtes.dao;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.xtes.url.empty1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class productdao {
    empty1 empty11=new empty1();
    public String url= "192.168.31.193";

    private Connection connection = null;
    private String id="0";
    public void run1( ) {
        Log.v("DB", url);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + empty11.returnurl() + empty11.returnsujukuname(), empty11.returnguanliyuanname(), empty11.returnguanliyuanpw());
            Log.v("DB", "连接成功");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                SQLException e1) {
            e1.printStackTrace();
        }
    }
    Handler myHandler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            Bundle data = new Bundle();
            data=msg.getData();
            Log.v("DB3",data.get("pimage").toString());
        }
    };
    public void findproduct() throws java.sql.SQLException {

        try {
            String sql = "select * from t_product order by id desc limit 0,4";        //查询表名为“user”的所有内容
            Statement stmt = connection.createStatement();        //创建Statement
            ResultSet rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

            //<code>ResultSet</code>最初指向第一行
      Bundle bundle = new Bundle();
            int t=0;
            while (rs.next()) {
                    bundle.clear();


                    bundle.putString("pimage", rs.getString("pimage"));
                    Message msg = new Message();
                    msg.setData(bundle);
                    myHandler.sendMessage(msg);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {

        } finally {
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                }
        }
    }
}
