
package com.example.xtes.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.xtes.DBhelper.DBHelper;
import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.Fragment.Fragment1;
import com.example.xtes.Fragment.Fragment3;
import com.example.xtes.R;
import com.example.xtes.dao.userdao;
import com.example.xtes.url.empty1;

import org.jetbrains.annotations.NotNull;

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
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class product_show extends AppCompatActivity {
    private String name0="",name1="";
    String username="";
    String tel="";
  int k1=0;
   String k0[]=new String[20];
    String  ed22;
    LinearLayout login;
    private  int type=1;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    ImageView same1,same2;
    SliderLayout p0;
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;

    String[] image0={"1","2","3","4","5"};
    String[] name8={"1","2","3","4","5","6","7","8","9"};
    String[] pirce0={"1","2","3","4","5","6","7","8","9"};

    Button b1,b2;
    SqlliteHelper helper=new SqlliteHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_show);

        p0 = findViewById(R.id.p1);
        t1 = findViewById(R.id.name0);
        t2 = findViewById(R.id.pcomman);
        t3 = findViewById(R.id.pbuyer);
        t9 = findViewById(R.id.shop_price);
        t4 = findViewById(R.id.ishot);
        b1 = findViewById(R.id.button1);
//        b2 = findViewById(R.id.button2);

        same1 = findViewById(R.id.ni3);
        same2 = findViewById(R.id.ni4);
        t5 = findViewById(R.id.textView71);
        t6 = findViewById(R.id.textView72);
        t7 = findViewById(R.id.textView081);
        t8 = findViewById(R.id.textView082);

        Intent intent = getIntent();
        name0 = intent.getStringExtra("strType");

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor cursor = helper.query();
                while (cursor.moveToNext()) { username = cursor.getString(cursor.getColumnIndex("name"));
                }
                a1();
            }
        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Cursor cursor = helper.query();
//                while (cursor.moveToNext()) { username = cursor.getString(cursor.getColumnIndex("name"));
//                }
//                Thread thread2 = new Thread(runnable2);
//                thread2.start();
//                try {
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                cheak0();
//
//            }});
        same1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(product_show.this, product_show.class);
                intent.putExtra("strType",t5.getText());
                startActivity(intent);
            }
        });
        same2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(product_show.this, product_show.class);
                intent.putExtra("strType",t6.getText());
                startActivity(intent);
            }
        });


    }
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            run1();
            try {
                findproduct();
                findsameproduct();
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
                add_shop_car();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };


    empty1 empty11=new empty1();
    public String url= "192.168.31.193";
    private Connection connection = null;
    private String id="0";
    public void run1( ) {
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

        String sql = "select * from t_product  WHERE productName='"+name0+"'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        //<code>ResultSet</code>最初指向第一行
        int t = 0;
        while (rs.next()) {
             name1=  findproductimage(rs.getInt("id"));;
             t1.setText(rs.getString("productName"));
            if(rs.getString("isHot").equals("1"))
             t2.setText("热卖");
            else
                t2.setText("在售");
            t3.setText(rs.getString("productPrice"));
            t4.setText(rs.getString("productDesc"));
            t9.setText(finduser(rs.getInt("userId")));
            tel=findphone(rs.getInt("userId"));
            type=rs.getInt("cateId");
        }
        int imgID=0;

//          p0.setImageBitmap(returnBitMap(empty11.returnimg()+name1));
        requestImages();
        initSlider();
    }

    private  void initSlider(){
        for(int i=0;i<k1;i++) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView
                    .description("非常棒")
                    .image(empty11.returnimg() + k0[i+1]);
            textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(BaseSliderView slider) {
                }

            });
            p0.addSlider(textSliderView);



        }
        p0.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

        p0.setCustomAnimation(new DescriptionAnimation());
        p0.setPresetTransformer(SliderLayout.Transformer.RotateUp);

//       p0.setPresetTransformer(SliderLayout.Transformer.RotateUp);
//       p0.setDuration(200);
//       p0.addOnPageChangeListener(new ViewPagerEx.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }
    private void requestImages(){
        String url ="http://47.106.237.169:8080/trading_platform";

        OkHttpClient client =new OkHttpClient();

        Request request= new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if(response.isSuccessful()){
                    String json=response.body().toString();

                    Log.i("dv","json="+json);
                }
            }
        });




    }



    public void findsameproduct() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select id,productName,productPrice from t_product where cateId='" +type +"' and productName != '"+name0+"'order by id desc limit 0,2";        //查询表名为“user”的所有内容

        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        //<code>ResultSet</code>最初指向第一行
        int t = 0;
        while (rs.next()) {
            image0[t] = findproductimage(rs.getInt("id"));
            name8[t] = rs.getString("productName");
            pirce0[t] = rs.getString("productPrice");
            t++;
        }
        int imgID=0;
        if(!image0[0].equals("1"))
        {     same1.setImageBitmap(returnBitMap(empty11.returnimg()+image0[0]));
        t5.setText(name8[0]);
        t7.setText(pirce0[0]);}
          if(!image0[1].equals("2")) {
              same2.setImageBitmap(returnBitMap(empty11.returnimg() + image0[1]));


              t6.setText(name8[1]);


              t8.setText(pirce0[1]);
          }

    }
    public void add_shop_car() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "insert into shopcar VALUES('"+name0+"','"+username+"','1')";        //查询表名为“user”的所有内容
        stmt.executeUpdate(sql);
    }
    void a1(){
        new AlertDialog.Builder(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("电话号码如下");
        builder.setMessage(tel);
        builder.setPositiveButton("发送信息", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                a1(1);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(product_show.this, "no",Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
    void cheak0(){
        Toast.makeText(this, "已加入数据库", Toast.LENGTH_SHORT).show();
    }
    Runnable runnable3 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao = new userdao();
            dao.run1();
            try {
                insertsold(username, t9.getText().toString(), ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    void a1(int k){
        android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(product_show.this);
        login = (LinearLayout) getLayoutInflater().inflate(R.layout.cincin, null);
        dialog.setTitle("发送信息").setMessage("请输入发送信息").setView(login);
        Intent intent2=new Intent(this,MainActivity.class);
        Intent intent3=new Intent(this, change_user.class);
        dialog.setPositiveButton("确定", new loginClick(k));
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
        int k2 = 0;

        public loginClick(int k) {
            k2 = k;
        }

        @Override
        public void onClick(DialogInterface dialog, int which) {
            ed3 = login.findViewById(R.id.ed20);
            ed22 = ed3.getText().toString();
            if (k2 == 1) {
                Thread thread2 = new Thread(runnable3);
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void insertsold(String username, String username2, String ed22) throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        String sql1 = "insert INTO `user` VALUES('1','2','3','4','5','4')";
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        String hehe = dateFormat.format( now );
        String sql = "insert INTO sold VALUES('" + username + "','" + username2 + "','" + ed22  + "','" + hehe+ "')";
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.close();
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
    public String findproductimage(int a) throws java.sql.SQLException {
        String imageform="";
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select imgPath from t_images where productid='" + a + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        while (rs.next()) {
            k1++;
            k0[k1] = rs.getString("imgPath");

        }
        return k0[1];
    }
    private String finduser(int userId) throws java.sql.SQLException{
        String imageform="";
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select username from t_user where id='" + userId + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        while (rs.next()) {
            imageform = rs.getString("username");

        }
        return imageform;
    }
    private String findphone(int userId) throws java.sql.SQLException{
        String imageform="";
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs=null;

        String sql = "select phoneNum from t_user where id='" + userId + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

        while (rs.next()) {
            imageform = rs.getString("phoneNum");

        }
        return imageform;
    }
}

