package com.example.xtes.dao;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import android.util.Base64;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.activity.my_product;
import com.example.xtes.domain.user;
import com.example.xtes.url.empty1;
import com.mysql.jdbc.log.NullLogger;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class userdao {
    empty1 empty11 = new empty1();
    public String url = "192.168.31.193";

    private Connection connection = null;
    private String id = "0";
    private String userid = "",productid="";
    public void run1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + empty11.returnurl() + empty11.returnsujukuname()+"?useUnicode=true&characterEncoding=utf-8", empty11.returnguanliyuanname(), empty11.returnguanliyuanpw());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                SQLException e1) {
            e1.printStackTrace();
        }
    }

    public String test(String name1,String password1) throws java.sql.SQLException {
        String password2 = "123";
        try {
            Log.v("DB3", name1);
            String sql = "select password from t_user where username='" + name1 + "'";       //查询表名为“user”的所有内容'
            String sql1 = "select username from t_user where password='" + password1 + "'";
            Statement stmt = connection.createStatement();        //创建Statement
            ResultSet rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

            //<code>ResultSet</code>最初指向第一行
            /*      Bundle bundle = new Bundle();*/
            while (rs.next()) {
              password2 = rs.getString("password");
//                password2 = rs.getString("username");
                Log.v("DB2", password2);
                   /* bundle.clear();
                    bundle.putString("upassword", rs.getString("upassword"));
                    Message msg = new Message();
                    msg.setData(bundle);
                    myHandler.sendMessage(msg);*/
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
        return password2;
    }

    public int adduser(String name0, String sex0, String phone0, String age0, String password11,String idnum,String month0,String date0) throws SQLException {
        String maxid = "";
        int maxid1 = 0;
        Date date=null;
        Statement stmt = connection.createStatement();        //创建Statement
        String sql1 = "insert INTO `user` VALUES('1','2','3','4','5','4')";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        try {
            String k=age0+"-"+month0+"-"+date0;
           date = simpleDateFormat.parse(k);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int a= 1;
        if(sex0.equals("女")) a=2;
        String sql = "insert INTO `t_user` (username,password, birthday,phoneNum,identityNum,isAdmin,sex,userStatus)VALUES('" + name0 + "','" +password11 + "','" + simpleDateFormat.format(date) + "','" + phone0 + "','" + idnum + "','0','"+a+"','1')";



        try {
            stmt.executeUpdate(sql);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
        return 0;
    }

    public int delectbyid(String username)throws SQLException  {

        String sql1 = "DELETE FROM t_user WHERE username='"+username+"'";
        Statement stmt = connection.createStatement();        //创建Statement
        try {
            stmt.executeUpdate(sql1);
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
            return 1;
    }
    public user findbyname(String name0) throws java.sql.SQLException {
        user user1=new user();
        try {
            String sql = "select * from t_user WHERE username='" + name0 + "'";        //查询表名为“user”的所有内容
            Statement stmt = connection.createStatement();        //创建Statement
            ResultSet rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

            //<code>ResultSet</code>最初指向第一行
            /*      Bundle bundle = new Bundle();*/
            while (rs.next()) {
                user1.setPassword(rs.getString("username"));
                user1.setPassword(rs.getString("password"));
                user1.setSex(rs.getInt("sex"));
                user1.setPhone(rs.getString("phoneNum"));
                user1.setId(rs.getInt("id"));
                user1.setAge(rs.getString("birthday"));

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
        return  user1;
    }


    public void updateunamebyid(int id,String name0) throws SQLException {
        String sql1 = "UPDATE `t_user` SET username='"+name0+"' WHERE id="+id;
        Statement stmt = connection.createStatement();        //创建Statement
        try {
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
    }

    public void updateagebyid(int id, String age) throws SQLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date date=null;
        try {
            date = simpleDateFormat.parse(age);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String sql1 = "UPDATE `t_user` SET birthday='"+date+"' WHERE id="+id;
        Statement stmt = connection.createStatement();        //创建Statement
        try {
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
    }

    public void updatephonebyid(int id, String phone) throws SQLException{
        String sql1 = "UPDATE `t_user` SET phoneNum='"+phone+"' WHERE id="+id;
        Statement stmt = connection.createStatement();        //创建Statement
        try {
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
    }

    public void updatepasswordbyid(int id, String password) throws SQLException{
        String sql1 = "UPDATE `t_user` SET password='"+password+"' WHERE id="+id;
        Statement stmt = connection.createStatement();        //创建Statement
        try {
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
    }

    public String test1(String phone0) {
        String password2 = "123";
        try {

            String sql = "select username from t_user where phoneNum='" + phone0 + "'";       //查询表名为“user”的所有内容'

            Statement stmt = connection.createStatement();        //创建Statement
            ResultSet rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

            //<code>ResultSet</code>最初指向第一行
            /*      Bundle bundle = new Bundle();*/
            while (rs.next()) {
                password2 = rs.getString("username");
//                password2 = rs.getString("username");
                Log.v("DB2", password2);
                   /* bundle.clear();
                    bundle.putString("upassword", rs.getString("upassword"));
                    Message msg = new Message();
                    msg.setData(bundle);
                    myHandler.sendMessage(msg);*/
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
        return password2;
    }

    public void addproduct(String name11, String jieshao1, String price1, String tpye0,int t,String username) throws SQLException  {
        String maxid = "";
        int maxid1 = 0;
        Date date = new Date();
        Statement stmt = connection.createStatement();        //创建Statement
        String sql1 = "insert INTO `user` VALUES('1','2','3','4','5','4')";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");


        int a= 1;


        findid(username);
        String sql = "insert INTO `t_product` (productName,productDesc, productPrice,isHot,isSell,productStatus,userId,cateId,launchTime)VALUES('" +name11 + "','" +jieshao1 + "','" + price1 + "','0','0','2','"+userid+"','" +tpye0 + "','" +dateFormat.format(date) + "')";



        try {
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();

    }
    private void findid(String username) throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT id  FROM t_user where username='" + username + "'";
        rs = stmt.executeQuery(sql);
        int t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {

            userid = rs.getString("id");

        }
        rs.close();
        stmt.close();
    }
    public String findid1(String username) throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT id  FROM t_user where username='" + username + "'";
        rs = stmt.executeQuery(sql);
        int t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {

            userid = rs.getString("id");

        }
        rs.close();
        stmt.close();
        return userid;
    }

    public void addimage(String name11, String a)throws SQLException {
        String maxid = "";
        int maxid1 = 0;
        Date date = new Date();
        Statement stmt = connection.createStatement();        //创建Statement
        String sql1 = "insert INTO `user` VALUES('1','2','3','4','5','4')";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");






        findpid(name11);
        String k="/upload/img/"+a;
        String sql = "insert INTO `t_images` (productId,imgPath)VALUES('" +productid + "','" +k + "')";



        try {
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
    }
    private void findpid(String username) throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT id  FROM t_product where productName='" + username + "'";
        rs = stmt.executeQuery(sql);
        int t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {

            productid = rs.getString("id");

        }
        rs.close();
        stmt.close();
    }

    public int finduserStatus(String username)throws SQLException  {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        int t=0;

        String sql = "SELECT userStatus  FROM t_user where username='" + username + "'";
        rs = stmt.executeQuery(sql);
       t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {

           t = rs.getInt("userStatus");

        }
        rs.close();
        stmt.close();
        return  t;
    }
}