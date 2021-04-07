package com.example.xtes.Fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.R;
import com.example.xtes.activity.buycar;
import com.example.xtes.activity.fabu_product;
import com.example.xtes.activity.my_product;
import com.example.xtes.activity.myuser;
import com.example.xtes.activity.product_show;
import com.example.xtes.dao.userdao;
import com.example.xtes.url.empty1;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fragment3 extends Fragment {
    private ListView listview;      // 列表
    private CheckBox all_chekbox;   //全选钮
    private TextView tv_total_price;         //价格
    private Button btn_d;          //刷新
    private Button btn_pay;         //付款
    private TextView f3;
    private ListView listView0;
    public static String name1;     //购物者名
    public static String username;     //购物者名
    public static String name2;     //商品名
    public static String amount;     //数量
    public static String total1;    //合计
    public static String userid;    //合计
    int x = 0;
    int p=0;

    private Context mContext;
    String[] image0 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] price0 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] pname0 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    /*public Fragment3(Context mContext) {
        this.mContext = mContext;} */
    String[] data=null;
    List<Map<String, Object>> list=null;
    SimpleAdapter adapter=null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_buycar, container, false);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        tv_total_price = view.findViewById(R.id.tv_total_price);
        listView0 = view.findViewById(R.id.list_image);
        tv_total_price = view.findViewById(R.id.tv_total_price);
        btn_d = view.findViewById(R.id.btn_d);
        btn_pay = view.findViewById(R.id.btn_pay);

        SqlliteHelper helper = new SqlliteHelper(this.getContext());
        Cursor cursor = helper.query();
        while (cursor.moveToNext()) {
            username = cursor.getString(cursor.getColumnIndex("name"));
        }
        data = new String[]{"shop_price", "pname"};
        list = new ArrayList<Map<String, Object>>();
       adapter = new SimpleAdapter(this.getContext(), list,
                R.layout.activity_buycar_lv, data, new int[]{
                R.id.item_tv1,
                R.id.item_tv2
        });

        Thread thread = new Thread(runnable0);
        thread.start();
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        listView0.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                x = (int) l;
                Thread thread = new Thread(runnable6);
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(Fragment3.this.getActivity(), product_show.class);
                intent.putExtra("strType", name2);
                startActivity(intent);
            }
        });


        //付款
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread(runnable);
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread thread5 = new Thread(runnable3);
                adapter.notifyDataSetChanged();
                thread5.start();
                try {
                    thread5.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                /*          Toast.makeText(mContext, "交易成功，请联系卖家", Toast.LENGTH_SHORT).show();  //传页面*/
            }
        });


        //合计价格
        Thread thread2 = new Thread(runnable1);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tv_total_price.setText("¥" + total1);


        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread(runnable1);

                thread.start();
                try {
                    thread.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread thread5 = new Thread(runnable3);
                adapter.notifyDataSetChanged();
                thread5.start();
                try {
                    thread5.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

return view;
    }

    //付款
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            run1();
            try {
                DeleteAll();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    };
    //合计
    Runnable runnable1 = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            run1();
            try {
                total1 = Total();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnable3 = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            run1();
            try {
              p=1;
                show_usercar(username);
                total1 = Total();
                tv_total_price.setText("¥" + total1);
                p=0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    Runnable runnable6 = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            run1();
            try {
                findname2();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

    private void findname2() throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT productName FROM t_product where userId='" + userid + "'";
        rs = stmt.executeQuery(sql);
        int t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {
            if (t == x)
                name2 = rs.getString("productName");
            t++;
        }

        rs.close();
        stmt.close();
    }

    empty1 empty11 = new empty1();
    public String url = "192.168.31.193";
    private Connection connection = null;
    private String id = "0";

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

    public void DeleteAll() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        //     ResultSet rs=null;
        String sql = "delete  FROM t_product where userId='" + userid + "'";
        stmt.execute(sql);
        //    rs.close();
        stmt.close();

    }

    public String Total() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT productPrice FROM t_product where userId='" + userid + "'";
        rs = stmt.executeQuery(sql);
        int t = 0;
        int total = 0;
        String total0 = null;
        String i = "";
        while (rs.next()) {
            i = rs.getString("productPrice");
            total += Integer.parseInt(i);
            t++;
        }
        rs.close();
        stmt.close();
        total0 = Integer.toString(total);
        return total0;
    }


    //加载购物车数据
    public void Load() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT productName,productPrice FROM t_product where userId='" + userid + "'";
        rs = stmt.executeQuery(sql);

        //<code>ResultSet</code>最初指向第一行
        int t = 0;
        while (rs.next()) {
            image0[t] = rs.getString("productName");

            price0[t] = rs.getString("productPrice");
            t++;
        }
        rs.close();
        stmt.close();
    }

    Runnable runnable0 = new Runnable() {
        private Connection connection = null;
        userdao dao = new userdao();

        @Override
        public void run() {
            run1();
            try {
                try {
                    findid(username);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                show_usercar(userid);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

    private void show_usercar(String username) throws SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        String sql = "SELECT productName,productPrice  FROM t_product where userId='" + userid + "'";
        rs = stmt.executeQuery(sql);

        //<code>ResultSet</code>最初指向第一行
 /*       int t = 0;
        while (rs.next()) {
            image0[t] = rs.getString("pimage");
            pname0[t] = rs.getString("pname");
            price0[t] = rs.getString("shop_price");
            t++;
        }*/
        list.clear();
        while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pname", rs.getString("productName"));
            map.put("shop_price", "￥" + rs.getString("productPrice"));
            list.add(map);
        }
        /*        ArrayAdapter<String>  adapter0=new ArrayAdapter<String>(talkingActivity.this, android.R.layout.simple_list_item_1);*/
        if(p==1)
        {}
        /*      new ListAdapter(getApplicationContext(),R.layout.row, (Cursor) rs,from,to);*/
        else
        listView0.setAdapter(adapter);
    }

    void cheak0() {
        Toast.makeText(this.getContext(), "交易成功", Toast.LENGTH_SHORT).show();
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
}