package com.example.xtes.activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.R;
import com.example.xtes.dao.userdao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView tips;
    Button button1;
    Button button2, cheak_phone, button3;
    int k = 0;
    int kp = 0;
    public static String name1;
    public static String password1;
    private boolean codeResult = false;
    private static String registerPhone;
    private static String registerCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void setListener() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (kp == 0) {
                    editText1.setHint("输入账号");
                    editText2.setHint("输入密码");
                    cheak_phone.setText("输入密码");
                    button3.setText("短信验证");
                    kp = 1;
                } else {
                    editText1.setHint("手机号");
                    editText2.setHint("验证码");
                    cheak_phone.setText("获取验证码");
                    button3.setText("账号密码登录");
                    kp = 0;
                }
            }
        });
        cheak_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SMSSDK.getVerificationCode("86", editText1.getText().toString());
                timer.start();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registerPhone = editText1.getText().toString();
                registerCode = editText2.getText().toString();
                if (kp == 0) {
                    SMSSDK.submitVerificationCode("86", registerPhone, registerCode);//提交验证码  在eventHandler里面查看验证结果  code为验证码


                    EventHandler eh = new EventHandler() {

                        @Override
                        public void afterEvent(int event, int result, Object data) {

                            if (result == SMSSDK.RESULT_COMPLETE) {
                                //回调完成
                                if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                                    //提交验证码成功
                                    if (result == SMSSDK.RESULT_COMPLETE) {
                                        Thread thread = new Thread(runnable);
                                        thread.start();
                                        try {
                                            thread.join();

                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        if (k != 1)
                                            cheak0();
                                    } else {
                                        tips.setText("验证码错误，请重新输入");

                                    }
                                } else if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
                                    tips.setText("验证码错误，请重新输入");
                                    //获取验证码成功
                                    if (result == SMSSDK.RESULT_COMPLETE) {
                                    } else {
                                    }

                                }
                            } else {
                                ((Throwable) data).printStackTrace();
                            }
                        }
                    };
                    SMSSDK.registerEventHandler(eh); //注册短信回调

                } else if (kp == 1) {
                    Thread thread = new Thread(runnable1);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, logonActivity.class));
            }
        });
    }

    private void initView() {
        editText1 = findViewById(R.id.et_user_name);
        editText2 = findViewById(R.id.et_psw);
        button1 = findViewById(R.id.btn_register);
        button2 = findViewById(R.id.btn_register2);
        button3 = findViewById(R.id.btn_password);
        cheak_phone = findViewById(R.id.cheak_phone);
        tips = findViewById(R.id.tips);
        name1 = editText1.getText().toString();
    }
    Runnable runnable = new Runnable() {
        userdao dao = new userdao();
        @Override
        public void run() {
            dao.run1();
            name1 = dao.test1(editText1.getText().toString());
            if (name1 == "")
                tips.setText("用户不存在");
            else {
                a1();

                k = 1;
                Timer time = new Timer();
                TimerTask tk = new TimerTask() {
                    Intent intent = new Intent(new Intent(MainActivity.this, Main2Activity.class));

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub

                        startActivity(intent);
//                        Log.i("db","ok");
                        finish();
                    }
                };
                time.schedule(tk, 1000);


            }
        }
    };
    Runnable runnable1 = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            dao.run1();

            try {
                password1 = dao.test(editText1.getText().toString(), password1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (password1 == "")
                tips.setText("用户不存在");
            else if (!password1.equals(editText2.getText().toString()))
                tips.setText("密码不正确");
            if (password1.equals(editText2.getText().toString()) && password1 != "") {
                name1 = editText1.getText().toString();
                a1();

                k = 1;
                Timer time = new Timer();
                TimerTask tk = new TimerTask() {
                    Intent intent = new Intent(new Intent(MainActivity.this, Main2Activity.class));

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub

                        startActivity(intent);
//                        Log.i("db","ok");
                        finish();
                    }
                };
                time.schedule(tk, 1000);


            }
        }
    };

    void cheak0() {
        Toast.makeText(this, "账号不存在或密码不正确", Toast.LENGTH_SHORT).show();
    }

    void cheak1() {
        Toast.makeText(this, "输入不能为空", Toast.LENGTH_SHORT).show();
    }

    void a1() {
        SqlliteHelper helper = new SqlliteHelper(getApplicationContext());
        ContentValues values = new ContentValues();
        values.put("name", name1);
        values.put("password", password1);
        helper.insert(values);
    }

    private CountDownTimer timer = new CountDownTimer(60000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            cheak_phone.setText((millisUntilFinished / 1000) + "秒后可重发");
        }

        @Override
        public void onFinish() {
            cheak_phone.setEnabled(true);
            cheak_phone.setText("获取验证码");
            codeResult = false;
        }
    };
};


