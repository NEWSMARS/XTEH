package com.example.xtes.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
    public int id;
    public String username;
    public String password;
    public String phoneNum;
    public Date birthday;
    public int sex;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUname() {
        return username;
    }
    public void setUname(String uname) {
        username = uname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phoneNum;
    }
    public void setPhone(String phone) {
        this.phoneNum = phone;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public String getAge() {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date date=new java.util.Date();

        String str=sdf.format(birthday);
        return  str;
    }
    public void setAge(String age) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        try {
            birthday = simpleDateFormat.parse(age);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
