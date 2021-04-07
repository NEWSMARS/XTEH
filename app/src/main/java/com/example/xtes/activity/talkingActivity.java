package com.example.xtes.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.R;
import com.example.xtes.dao.userdao;
import com.example.xtes.url.empty1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class talkingActivity extends AppCompatActivity {
    ListView listView;
    ListView listView2;
    SqlliteHelper helper;
    String ed22=null;
    Button b1;
    LinearLayout login;
    int p=0;
    String username2;
    private ListView listView_main_news;
    private List<Map<String, String>> list = null;
    String username;
    String[] from1 = {"_id","name","uname2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talking);

        listView = (ListView) findViewById(R.id.listview1);
        listView2 = (ListView) findViewById(R.id.listview2);
        this.setTitle("卖家信息");
        use_cursor();
        final AlertDialog.Builder builder = new AlertDialog.Builder(this); //提示框

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            p=(int)l;

                a1(1);
            /*    Thread thread3 = new Thread(runnable3);
                thread3.start();*/
//                use_cursor();
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                p=(int)l;

                a1(2);
//                use_cursor();
            }
        });
    }
    private void use_cursor(){
       /* Cursor cursor =helper.query();
        */
        SqlliteHelper helper =new SqlliteHelper(this);
        Cursor cursor = helper.query();
        while (cursor.moveToNext()) {
            username = cursor.getString(cursor.getColumnIndex("name"));
        }
        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* String[] from = {"_id","name","uname2"};
        int[] to={R.id.textView0,R.id.textView1,R.id.textView3};
        SimpleCursorAdapter adapter=new SimpleCursorAdapter(getApplicationContext(),R.layout.row,cursor,from,to);
        listView.setAdapter(adapter);*/
    }
    Runnable runnable3 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            run1();
            use_cursor();
        }
    };
    Runnable runnable = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            run1();
            try {
                findproduct();
                findproduct2();
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
            connection = DriverManager.getConnection("jdbc:mysql://"+empty11.returnurl()+"/xtes", "local", "123456");
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
        ResultSet rs = null;
        Cursor  cursor=null;

        String sql = "select * from sold  WHERE uname1='" + username + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor
        String[] data = {"uname2","time","talk"};
//        int[] to={R.id.textView0,R.id.textView1,R.id.textView3};

        //<code>ResultSet</code>最初指向第一行
        int t = 0;
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("uname2","接受信息人:"+rs.getString("uname2"));
            map.put("time","发送时间:"+rs.getString("time"));
            map.put("talk","信息:"+rs.getString("talk"));
            list.add(map);
            t++;
        }
/*        ArrayAdapter<String>  adapter0=new ArrayAdapter<String>(talkingActivity.this, android.R.layout.simple_list_item_1);*/
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.row, data, new int[] {
                R.id.textView0,
                R.id.textView1,
                R.id.textView3
        });
        /*      new ListAdapter(getApplicationContext(),R.layout.row, (Cursor) rs,from,to);*/
        listView.setAdapter( adapter);
    }


    public void findproduct0() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        Cursor  cursor=null;

        String sql = "select * from sold  WHERE uname1='" + username + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor
        int t = 0;
        while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
           if(t==p)
            username2=rs.getString("uname2");

            t++;
        }

    }


    public void findproduct2() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        Cursor  cursor=null;

        String sql = "select * from sold  WHERE uname2='" + username + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor
        String[] data = {"uname1","time","talk"};
//        int[] to={R.id.textView0,R.id.textView1,R.id.textView3};

        //<code>ResultSet</code>最初指向第一行
        int t = 0;
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("uname1","发送信息人:"+rs.getString("uname1"));
            map.put("time","发送时间:"+rs.getString("time"));
            map.put("talk","信息:"+rs.getString("talk"));
            list.add(map);
        }
        /*        ArrayAdapter<String>  adapter0=new ArrayAdapter<String>(talkingActivity.this, android.R.layout.simple_list_item_1);*/
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.row, data, new int[] {
                R.id.textView0,
                R.id.textView1,
                R.id.textView3
        });
        /*      new ListAdapter(getApplicationContext(),R.layout.row, (Cursor) rs,from,to);*/
        listView2.setAdapter( adapter);

    }
    void a1(int k){
        android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(talkingActivity.this);
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
        int k2=0;
        public loginClick(int k) {
            k2=k;
        }

        @Override
        public void onClick(DialogInterface dialog, int which) {
            ed3 = login.findViewById(R.id.ed20);
            ed22 = ed3.getText().toString();
            if(k2==1) {
                Thread thread2 = new Thread(runnable2);
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(k2==2){
                Thread thread3 = new Thread(runnable4);
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            }
        }
    Runnable runnable2 = new Runnable() {
        private Connection connection = null;

        @Override
        public void run() {
            userdao dao = new userdao();
            dao.run1();
            try {
                findproduct0();
                insertsold(username, username2, ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };

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

    Runnable runnable4 = new Runnable() {
        private Connection connection = null;

        @Override
        public void run() {
            userdao dao = new userdao();
            dao.run1();
            try {
                findproduct00();
                insertsold(username2, username, ed22);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    public void findproduct00() throws java.sql.SQLException {
        Statement stmt = connection.createStatement();        //创建Statement
        ResultSet rs = null;
        Cursor  cursor=null;

        String sql = "select * from sold  WHERE uname2='" + username + "'";        //查询表名为“user”的所有内容
        rs = stmt.executeQuery(sql);          //ResultSet类似Cursor
        int t = 0;
        while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            if(t==p)
                username2=rs.getString("uname1");

            t++;
        }

    }


    }

