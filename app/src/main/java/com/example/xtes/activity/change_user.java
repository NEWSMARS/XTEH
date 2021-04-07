package com.example.xtes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xtes.Fragment.Fragment4;
import com.example.xtes.R;
import com.example.xtes.dao.userdao;
import com.example.xtes.domain.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class change_user extends AppCompatActivity {
    public String name0;
    public String ed22;
    public String phone0;
    public String age0;
    public String password11;
    public String password22;
    EditText name2;
    ProgressDialog mydialog;
    LinearLayout login;
    TextView b11,b22,b33,b44;
    public  user user1=new user();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_user);
        b11=findViewById(R.id.name9);
        b22=findViewById(R.id.age9);
        b33=findViewById(R.id.phone9);
        b44=findViewById(R.id.password9);
        Intent intent = getIntent();

        name0 = intent.getStringExtra("username");
        final Thread thread2 = new Thread(runnable);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b11.setText("用户名                              "+name0);
        b22.setText("年龄                      "+user1.getAge().toString());
        b33.setText(" 手机                   "+user1.getPhone());
        b44.setText("密码                                 ****");
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1(1);

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1(2);

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1(3);

            }
        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1(4);

            }
        });


    }
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {
                user1=dao.findbyname(name0);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    };

    void a1(int k){
        AlertDialog.Builder dialog = new AlertDialog.Builder(change_user.this);
        login = (LinearLayout) getLayoutInflater().inflate(R.layout.cincin, null);
        dialog.setTitle("更改个人信息").setMessage("请输入更改信息").setView(login);
        Intent intent2=new Intent(this,MainActivity.class);
        Intent intent3=new Intent(this, change_user.class);
        dialog.setPositiveButton("确定", new loginClick(intent2,intent3,k));
        dialog.setNegativeButton("退出", new exitClick());
        dialog.create();
        dialog.show();
    }
    class exitClick implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialog, int which) {
        }
    }
    class loginClick implements DialogInterface.OnClickListener {
     EditText ed3;
        Intent intent2;
        Intent intent1;
        int k=0;
        public loginClick(Intent intent3,Intent intent4,int kt) {
            intent2=intent3;
            intent1=intent4;
            k=kt;
        }
        @Override
        public void onClick(DialogInterface dialog, int which) {
            ed3 = login.findViewById(R.id.ed20);
            ed22 = ed3.getText().toString();
            if(k==1) {
                Thread thread2 = new Thread(runnable2);
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                name0 = ed22;
                startActivity(intent2);
            }
            if(k==2) { Thread  thread3 = new Thread(runnable3);thread3.start();  try {
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } intent2.putExtra("username", name0);
                finish();
            }
                if(k==3) {Thread thread4 = new Thread(runnable4);thread4.start(); intent2.putExtra("username", name0);try {
                    thread4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    finish();
            }
                    if(k==4) {Thread thread5 = new Thread(runnable5);
                    thread5.start();try {
                        thread5.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    startActivity(intent2);
                    }
            Toast.makeText(change_user.this, "yes",Toast.LENGTH_SHORT).show();

        }
    }




    Runnable runnable2 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {

                dao.updateunamebyid(user1.getId(),ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    Runnable runnable3 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {

                dao.updateagebyid(user1.getId(),ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    Runnable runnable4 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {

                dao.updatephonebyid(user1.getId(),ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    Runnable runnable5 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {

                dao.updatepasswordbyid(user1.getId(),ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
}
