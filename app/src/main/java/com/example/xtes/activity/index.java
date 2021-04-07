package com.example.xtes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xtes.R;
import com.example.xtes.dao.productdao;
import com.example.xtes.dao.userdao;

import java.sql.Connection;
import java.sql.SQLException;

public class index extends AppCompatActivity {
    public String[] name1 = new String[]{"","","",""};
    public String[] img1 = new String[10];
    ImageView h1,h2,h3,h4;
    ImageView n1,n2,n3,n4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        t1=findViewById(R.id.textView10);
        h1=findViewById(R.id.hi1);
        h2=findViewById(R.id.hi2);
        h3=findViewById(R.id.hi3);
        h4=findViewById(R.id.hi4);
        n1=findViewById(R.id.ni1);
        n2=findViewById(R.id.ni2);
        n3=findViewById(R.id.ni3);
        n4=findViewById(R.id.ni4);
        productdao dao=new productdao();
        new Thread(runnable).start();

        Log.v("n",name1[0]);
//        h1.setImageResource(R.drawable.name1[0]);
//        h2.setImageResource(R.drawable.c_0003);
    }
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        productdao dao=new productdao();
        @Override
        public void run() {
            dao.run1();
            try {
                dao.findproduct();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    };
}
