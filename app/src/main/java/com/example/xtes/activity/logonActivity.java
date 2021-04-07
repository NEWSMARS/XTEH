package com.example.xtes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.xtes.R;
import com.example.xtes.dao.userdao;
import com.example.xtes.url.empty1;
import com.example.xtes.util.MysqlCon;

import java.sql.Connection;
import java.sql.SQLException;

public class logonActivity extends AppCompatActivity {
    public String name0;
    public String sex0;
    public String phone0;
    public String age0;
    public String password11;
    public String password22;
    public String idnum1,month0,date0;
    EditText name2;
    EditText sex2;
    EditText urltext;
    EditText phone1;
    EditText age;
    EditText password1;
    EditText password2;
    EditText idnum,month1,date1;
    Button logonbt1;
    Button loginbt2;
    RadioButton R1,R2;
    RadioGroup R3;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);
        name2=findViewById(R.id.nameedit2);
        R1=findViewById(R.id.radioButton);
        R2=findViewById(R.id.radioButton2);
        R3=findViewById(R.id.radioButton3);
        phone1=findViewById(R.id.phoneedit);
        age=findViewById(R.id.ageedit);
        idnum=findViewById(R.id.idnumedit3);
        password1=findViewById(R.id.passwordedit2);
        password2=findViewById(R.id.passwordedit3);
        loginbt2=findViewById(R.id.loginbutton2);
        logonbt1=findViewById(R.id.logonbutton2);
        urltext=findViewById(R.id.urledit);
        month1=findViewById(R.id.month1);
                date1=findViewById(R.id.date1);
        R1.setChecked(true);
        logonbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(R1.isChecked()) sex0="男";
                else sex0="女";
                name0=name2.getText().toString();
     /*           sex0=sex2.getText().toString();*/
                phone0=phone1.getText().toString();
                age0=age.getText().toString();
                password11=password1.getText().toString();
                password22=password2.getText().toString();
                idnum1=idnum.getText().toString();
                month0=month1.getText().toString();
                        date0=date1.getText().toString();
                if(name0.equals("")||sex0.equals("")||phone0.equals("")||age0.equals("")||password11.equals("")||password22.equals("")||idnum.equals("")||month0.equals("")||date0.equals("")){
                cheak0();
                }
                else{
                if(password11.equals(password22))
                new Thread(runnable).start();
                else cheak1();
                }
            }
        });

        loginbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty1 empty11=new empty1();
                empty11.setA(urltext.getText().toString());
                startActivity(new Intent(logonActivity.this, MainActivity.class));
            }
        });

    }
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        MysqlCon con = new MysqlCon();
        userdao dao=new userdao();
        @Override
        public void run() {
            dao.run1();
            int true0= 0;
            try {
                true0 = (int) dao.adduser(name0,sex0,phone0,age0,password11,idnum1,month0,date0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(true0==1){
                startActivity(new Intent(logonActivity.this, MainActivity.class));
            }
            else
                cheak0();
        }
    };
    void cheak0(){
        Toast.makeText(this, "请输入完整", Toast.LENGTH_SHORT).show();
    }
    void cheak1(){
        Toast.makeText(this, "两次密码一致", Toast.LENGTH_SHORT).show();
    }
}
