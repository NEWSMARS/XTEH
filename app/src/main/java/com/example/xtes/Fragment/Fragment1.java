package com.example.xtes.Fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextLinks;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.example.xtes.R;
import com.example.xtes.activity.Main2Activity;
import com.example.xtes.activity.MainActivity;
import com.example.xtes.activity.showshowshow;
import com.example.xtes.domain.image;
import com.example.xtes.view.ViewPagerAdapter;
import com.example.xtes.activity.product_show;
import com.example.xtes.url.empty1;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Fragment1 extends Fragment {
    ImageView h1,h2,h3,h4;
    ImageView n1,n2,n3,n4,t00,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    TextView t1,t11,t12,t21,t22,t31,t32,t41,t42,t51,t52,t61,t62,t71,t72,t81,t82,t0;
    SliderLayout myslidershow;
    String a="c_0003";
    String[] image0={" "," "," "," "," "};
    String[] name0={" "," "," "," "," "," "," "," "," "};
    String[] pirce0={" "," "," "," "," "," "," "," "," "};
    String imageUrl = "http://47.106.237.169:8080/trading_platform/upload/img/20200318120454_%E8%81%94%E6%83%B31.jpg";
    Bitmap bmImg;
    ImageView imView;
    private ViewPager vp;
    private ViewPagerAdapter viewPagerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        final View view = inflater.inflate(R.layout.activity_index, container, false);

        myslidershow=(SliderLayout)view.findViewById(R.id.slider);
        requestImages();
        initSlider();
       /* vp = view.findViewById(R.id.vp);*/
        viewPagerAdapter = new ViewPagerAdapter(getContext(), image.imageArray);
       /* vp.setAdapter(viewPagerAdapter);*/

        final String[] name00 = {""};
        t1=view.findViewById(R.id.textView10);
       h1=view.findViewById(R.id.hi1);
        h2=view.findViewById(R.id.hi2);
        h3=view.findViewById(R.id.hi3);
        h4=view.findViewById(R.id.hi4);
        n1=view.findViewById(R.id.ni1);
        n2=view.findViewById(R.id.ni2);
        n3=view.findViewById(R.id.ni3);
        n4=view.findViewById(R.id.ni4);
        t11=view.findViewById(R.id.textView011);
        t12=view.findViewById(R.id.textView012);
        t21=view.findViewById(R.id.textView021);
        t22=view.findViewById(R.id.textView022);
        t31=view.findViewById(R.id.textView31);
        t32=view.findViewById(R.id.textView32);
        t41=view.findViewById(R.id.textView041);
        t42=view.findViewById(R.id.textView042);
        t51=view.findViewById(R.id.textView51);
        t52=view.findViewById(R.id.textView52);
        t61=view.findViewById(R.id.textView061);
        t62=view.findViewById(R.id.textView062);
        t71=view.findViewById(R.id.textView71);
        t72=view.findViewById(R.id.textView72);
        t81=view.findViewById(R.id.textView081);
        t82=view.findViewById(R.id.textView082);
        q1=view.findViewById(R.id.q1);
        q2=view.findViewById(R.id.q2);
        q3=view.findViewById(R.id.q3);
        q4=view.findViewById(R.id.q4);
        q5=view.findViewById(R.id.q5);
        q6=view.findViewById(R.id.q6);
        q7=view.findViewById(R.id.q7);
        q8=view.findViewById(R.id.q8);
        q9=view.findViewById(R.id.q9);
        q10=view.findViewById(R.id.q10);
//        t00.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                name00[0] =t0.toString();
//                Thread threadx = new Thread(runnable);
//                threadx.start();
//                try {
//                    threadx.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
        /*Picasso.get().load("http://47.106.237.169:8080/trading_platform//upload/img/20200321151554_iphone1.jpg").into(n1);*/

        Thread thread = new Thread(runnable);
                thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*for(int i = 0; i <4; i++)
        {
            try
            {
                imgID = R.drawable.class.getField(image0[i] ).getInt(new R.drawable());
                i++;
                imgViewID = R.id.class.getField( "hi" + i ).getInt(new R.id());
                i--;
                ((ImageView)view.findViewById(imgViewID)).setImageResource(imgID);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }*/
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "1");
                startActivity(intent);
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "2");
                startActivity(intent);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "3");
                startActivity(intent);
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "4");
                startActivity(intent);
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "10");
                startActivity(intent);
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "5");
                startActivity(intent);
            }
        });
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "6");
                startActivity(intent);
            }
        });
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "8");
                startActivity(intent);
            }
        });
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "9");
                startActivity(intent);
            }
        });
        q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), showshowshow.class);
                intent.putExtra("index", "11");
                startActivity(intent);
            }
        });


        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t11.getText());
                startActivity(intent);
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t12.getText());
                startActivity(intent);
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t31.getText());
                startActivity(intent);
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t32.getText());
                startActivity(intent);
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t51.getText());
                startActivity(intent);
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t52.getText());
                startActivity(intent);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t71.getText());
                startActivity(intent);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), product_show.class);
                intent.putExtra("strType",t72.getText());
                startActivity(intent);
            }
        });


        return view;
    }

    Runnable runnable = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
           run1();
            try {
                findproduct();
                findnewproduct();
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
            connection = DriverManager.getConnection("jdbc:mysql://" + empty11.returnurl() + empty11.returnsujukuname(), empty11.returnguanliyuanname(), empty11.returnguanliyuanpw());
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

            String sql = "select id,productName,productPrice from t_product order by id desc limit 0,4";        //查询表名为“user”的所有内容
            rs = stmt.executeQuery(sql);          //ResultSet类似Cursor

            //<code>ResultSet</code>最初指向第一行
            int t = 0;
            while (rs.next()) {
                image0[t] = findproductimage(rs.getInt("id"));
                name0[t] = rs.getString("productName");
                pirce0[t] = rs.getString("productPrice");
                t++;
            }
        int imgID=0;

            h1.setImageBitmap(returnBitMap(empty11.returnimg()+image0[0]));
            /*Picasso.get().load("http://47.106.237.169:8080/trading_platform//upload/img/20200321151554_iphone1.jpg").into(n1);*/
            h2.setImageBitmap(returnBitMap(empty11.returnimg()+image0[1]));
            h3.setImageBitmap(returnBitMap(empty11.returnimg()+image0[2]));
            h4.setImageBitmap(returnBitMap(empty11.returnimg()+image0[3]));


        t11.setText(name0[0]);
        t12.setText(name0[1]);
        t31.setText(name0[2]);
        t32.setText(name0[3]);
        t21.setText(pirce0[0]);
        t22.setText(pirce0[1]);
        t41.setText(pirce0[2]);
        t42.setText(pirce0[3]);

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

    public void findnewproduct() throws java.sql.SQLException {


        String sql = "select id,productName,productPrice from t_product where isHot=1 order by id desc limit 0,4";        //查询表名为“user”的所有内容
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = stmt.executeQuery(sql);          //ResultSet类似Cursor*//*

        //<code>ResultSet</code>最初指向第一行
        Bundle bundle = new Bundle();
        int t = 0;
        while (rs.next()) {
            image0[t] = findproductimage(rs.getInt("id"));
            name0[t] = rs.getString("productName");
            pirce0[t] = rs.getString("productPrice");
            t++;
        }
        int imgID=0;
        try{

            /*n1.setImageResource(imgID);*/
           /* n1.setImageBitmap();*/
            n1.setImageBitmap(returnBitMap(empty11.returnimg()+image0[0]));
            /*Picasso.get().load("http://47.106.237.169:8080/trading_platform//upload/img/20200321151554_iphone1.jpg").into(n1);*/
            n2.setImageBitmap(returnBitMap(empty11.returnimg()+image0[1]));
            n3.setImageBitmap(returnBitMap(empty11.returnimg()+image0[2]));
            n4.setImageBitmap(returnBitMap(empty11.returnimg()+image0[3]));
            t51.setText(name0[0]);
            t52.setText(name0[1]);
            t71.setText(name0[2]);
            t72.setText(name0[3]);
            t61.setText(pirce0[0]);
            t62.setText(pirce0[1]);
            t81.setText(pirce0[2]);
            t82.setText(pirce0[3]);

            Thread.sleep(1000L);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rs.close();
        stmt.close();

    }
    private  void initSlider(){
        TextSliderView textSliderView = new TextSliderView(this.getActivity());
        textSliderView
                .description("新品上市")
                .image(R.drawable.a11);
        textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                    Toast.makeText(Fragment1.this.getActivity(),"活动1未开放",Toast.LENGTH_LONG).show();
            }
        });



        TextSliderView textSliderView2 = new TextSliderView(this.getActivity());
        textSliderView2
                .description("热门活动")
                .image(R.drawable.a12);
        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(Fragment1.this.getActivity(),"活动2未开放",Toast.LENGTH_LONG).show();
            }
        });


        TextSliderView textSliderView3 = new TextSliderView(this.getActivity());
        textSliderView3
                .description("敬请留意")
                .image(R.drawable.a13);
        textSliderView3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(Fragment1.this.getActivity(),"活动3未开放",Toast.LENGTH_LONG).show();
            }
        });

        myslidershow.addSlider(textSliderView);
        myslidershow.addSlider(textSliderView2);
        myslidershow.addSlider(textSliderView3);


        myslidershow.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

        myslidershow.setCustomAnimation(new DescriptionAnimation());
        myslidershow.setPresetTransformer(SliderLayout.Transformer.RotateUp);
        myslidershow.setDuration(3000);
    }
    private void requestImages(){
        String url ="http://47.106.237.169:8080/trading_platform/upload";

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

                        Log.i("Fragment1","json="+json);
                    }
                }
            });




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

}