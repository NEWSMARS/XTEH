package com.example.xtes.Fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.R;
import com.example.xtes.activity.Main2Activity;
import com.example.xtes.activity.MainActivity;
import com.example.xtes.activity.change_user;
import com.example.xtes.activity.fabu_product;
import com.example.xtes.activity.my_product;
import com.example.xtes.activity.product_show;
import com.example.xtes.dao.userdao;

import java.sql.Connection;
import java.sql.SQLException;

public class Fragment4 extends Fragment {
    TextView name;
    Button b1,b2,b3,b4,b0;
    String username="";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_myuser, container, false);
        b1=view.findViewById(R.id.fabushangping);
        b2=view.findViewById(R.id.changePasswordButton);
        b3=view.findViewById(R.id.myLoginButton);
        b4=view.findViewById(R.id.myDeleteButton);
        b0=view.findViewById(R.id.fabushangping0);
        name=view.findViewById(R.id.name123);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), fabu_product.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), my_product.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), change_user.class);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1();
            }
        });

        return view;


    }

    Runnable runnable = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {
               dao.delectbyid(username);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SqlliteHelper helper =new SqlliteHelper(getActivity());
        Cursor cursor = helper.query();
        while (cursor.moveToNext()) {
            username = cursor.getString(cursor.getColumnIndex("name"));
        }
        name.setText(username);
    }
    void a1(){
        new AlertDialog.Builder(getActivity());
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("一旦注销永不回复，请问是否继续");

        builder.setPositiveButton("残忍注销", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Thread thread2 = new Thread(runnable);
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });
        builder.setNegativeButton("我还是很爱你", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "no",Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
}