package com.example.xtes.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.xtes.R;
import com.example.xtes.activity.product_show;
import com.example.xtes.url.empty1;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fragment2 extends Fragment {
    ImageView o1,o2,o3,o4,a1,a2,a3,a4,a5,a6,a7,a8;
    TextView s1,s2,s3,s4,s5,s6,s7,s8,d1,d2,d3,d4,d5,d6,d7,d8;
    String[] image0={"1","2","3","4","5","6","7","8","9","10"};
    String[] name0={"1","2","3","4","5","6","7","8","9"};
    String tpyename1;
    int tpyename=0;
    String[] pirce0={"1","2","3","4","5","6","7","8","9"};
    EditText search2;
    Button search3;
    static  int cat=1;
    static String name10="";
   int t=0;
    private String[] mStrs = {"aaa", "bbb", "ccc", "airsaid"};
    private ListView mListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_product_list, container, false);

        search2=view.findViewById(R.id.search66);
        search3=view.findViewById(R.id.search55);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
//        o1=view.findViewById(R.id.p1);
//        o2=view.findViewById(R.id.p2);
//        o3=view.findViewById(R.id.p3);
//        o4=view.findViewById(R.id.p4);
        a1=view.findViewById(R.id.z11);
        a2=view.findViewById(R.id.z22);
        a3=view.findViewById(R.id.z33);
        a4=view.findViewById(R.id.z44);
        a5=view.findViewById(R.id.z5);
        a6=view.findViewById(R.id.z6);

        s1=view.findViewById(R.id.x1);
        s2=view.findViewById(R.id.x2);
        s3=view.findViewById(R.id.x3);
        s4=view.findViewById(R.id.x4);
        s5=view.findViewById(R.id.x5);
        s6=view.findViewById(R.id.x6);

        d1=view.findViewById(R.id.c1);
        d2=view.findViewById(R.id.c2);
        d3=view.findViewById(R.id.c3);
        d4=view.findViewById(R.id.c4);
        d5=view.findViewById(R.id.c5);
        d6=view.findViewById(R.id.c6);






        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s1.getText());
                startActivity(intent);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s2.getText());
                startActivity(intent);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s3.getText());
                startActivity(intent);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s4.getText());
                startActivity(intent);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s5.getText());
                startActivity(intent);
            }
        });a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",s6.getText());
                startActivity(intent);
            }
        });
        search3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name10=search2.getText().toString();
                Thread thread3=new Thread(runnable3);
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                diaoyong();
            }
        });






        return view;
    }


    Runnable runnable3 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            run1();
            try {
                findproductbysearch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnable2 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            run1();
            try {
                findproduct();
                diaoyong();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

    empty1 empty11=new empty1();
    String url= "192.168.31.193";
    Connection connection = null;
    String id="0";
    public void run1(){
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
    public void findproduct() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select id,productName,productPrice from t_product where cateId="+cat+" order by id desc limit 0,8";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        //<code>ResultSet</code>最初指向第一行
         t = 0;
        while (rs.next()) {
            image0[t] = findproductimage(rs.getInt("id"));
            name0[t] = rs.getString("productName");
            pirce0[t] = rs.getString("productPrice");
            t++;
        }
       /* int imgID=0;
        try {
            if(t>=1){
           imgID = R.drawable.class.getField(image0[0] ).getInt(new R.drawable());
            a1.setImageResource(imgID);
                s1.setText(name0[0]);
                d1.setText(pirce0[0]);
            }
            if(t>=2){
            imgID = R.drawable.class.getField(image0[1] ).getInt(new R.drawable());
                s2.setText(name0[1]);
                d2.setText(pirce0[1]);
            a2.setImageResource(imgID);
            }
            if(t>=3) {
                imgID = R.drawable.class.getField(image0[2]).getInt(new R.drawable());
                a3.setImageResource(imgID);
                s3.setText(name0[2]);
                d3.setText(pirce0[2]);
            }
            if(t>=4) {
                imgID = R.drawable.class.getField(image0[3]).getInt(new R.drawable());
                a4.setImageResource(imgID);
                s4.setText(name0[3]);
                d4.setText(pirce0[3]);
            }
            if(t>=5) {
                imgID = R.drawable.class.getField(image0[4]).getInt(new R.drawable());
                a5.setImageResource(imgID);
                s5.setText(name0[4]);
                d5.setText(pirce0[4]);
            }
            if(t>=6) {
                imgID = R.drawable.class.getField(image0[5]).getInt(new R.drawable());
                a6.setImageResource(imgID);
                s6.setText(name0[5]);
                d6.setText(pirce0[5]);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }*/

    }
    public String findproductimage(int a) throws java.sql.SQLException {
        String imageform="";
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select imgPath from t_images where productid='" + a + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        while (rs.next()) {
            imageform = rs.getString("imgPath");

        }

        return imageform;

    }

    public void findproductbysearch() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        Log.i("name:", name10);
        String sql = "select id,productName,productPrice from t_product where  productName='"+name10+"'";        //查询表名为“user”的所有内容

        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        //<code>ResultSet</code>最初指向第一行
        t =0;
        while (rs.next()) {
            image0[t] = findproductimage(rs.getInt("id"));
            name0[t] = rs.getString("productName");
            pirce0[t] = rs.getString("productPrice");
            t++;
        }

    }


    void diaoyong(){ int imgID=0;
        Log.i("t:", String.valueOf(t));
            if(t>=1){
                a1.setImageBitmap(returnBitMap(empty11.returnimg()+image0[0]));
                s1.setText(name0[0]);
                d1.setText(pirce0[0]);
            }
            if(t>=2){
                a2.setImageBitmap(returnBitMap(empty11.returnimg()+image0[1]));
                s2.setText(name0[1]);
                d2.setText(pirce0[1]);

            }
            if(t>=3) {
                a3.setImageBitmap(returnBitMap(empty11.returnimg()+image0[2]));
                s3.setText(name0[2]);
                d3.setText(pirce0[2]);
            }
            if(t>=4) {
                a4.setImageBitmap(returnBitMap(empty11.returnimg()+image0[3]));
                s4.setText(name0[3]);
                d4.setText(pirce0[3]);
            }
            if(t>=5) {
                a5.setImageBitmap(returnBitMap(empty11.returnimg()+image0[4]));
                s5.setText(name0[4]);
                d5.setText(pirce0[4]);
            }
            if(t>=6) {
                a6.setImageBitmap(returnBitMap(empty11.returnimg()+image0[5]));
                s6.setText(name0[5]);
                d6.setText(pirce0[5]);
            }

       }
    public Bitmap returnBitMap(String url){
        URL myFileUrl = null;
        Bitmap bitmap = null;
        try {
            myFileUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) myFileUrl
                    .openConnection();
            conn.setDoInput(true);
            conn.connect();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
    private void start(){


        a1.setImageBitmap(null);
        a2.setImageBitmap(null);
        a3.setImageBitmap(null);
        a4.setImageBitmap(null);
        a5.setImageBitmap(null);
        a6.setImageBitmap(null);
        s1.setText("");
        s2.setText("");
        s3.setText("");
        s4.setText("");
        s5.setText("");
        s6.setText("");

        d1.setText("");
        d1.setText("");
        d2.setText("");d3.setText("");d4.setText("");d5.setText("");d6.setText("");


    }
}