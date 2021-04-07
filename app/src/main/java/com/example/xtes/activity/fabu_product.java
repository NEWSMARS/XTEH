package com.example.xtes.activity;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.loader.content.CursorLoader;

import com.example.xtes.DBhelper.SqlliteHelper;
import com.example.xtes.R;
import com.example.xtes.dao.userdao;
import com.example.xtes.util.MysqlCon;
import com.zhy.http.okhttp.utils.L;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callback.FileWithBitmapCallback;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class fabu_product extends AppCompatActivity implements View.OnClickListener {
    static String ret1="";
    //调取系统摄像头的请求码
    private static final int MY_ADD_CASE_CALL_PHONE = 6;
    //打开相册的请求码
    private static final int MY_ADD_CASE_CALL_PHONE2 = 7;
    private AlertDialog.Builder builder;
    private AlertDialog dialog;
    private LayoutInflater inflater;
    private ImageView imageView, ur1, ur2, ur3, ur4;
    private View layout;
    private TextView takePhotoTV;
    private TextView choosePhotoTV;
    private TextView cancelTV, k0;
    TextView fabuqingkuang;
    Button b0;
    Bitmap b1, b2, b3, b4;
    public String name11, jieshao1, price1, tpye0, username, img_src1, img_src2, img_src3,password;
    private int t = 0;
    EditText name1, jieshao, price;
    Bitmap bitmap1, bitmap2, bitmap3;
    int p = 0;
    private Spinner mySpinner;
    private ArrayAdapter<String> adapter;
    private List<String> list = new ArrayList<String>();
    public static final int EXTERNAL_STORAGE_REQ_CODE = 10 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        int permission = ActivityCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // 请求权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    EXTERNAL_STORAGE_REQ_CODE);
        }



        setContentView(R.layout.activity_fabu);
        imageView = findViewById(R.id.imagekkk);
        ur1 = findViewById(R.id.ul1);
        ur2 = findViewById(R.id.ul2);
        ur3 = findViewById(R.id.ul3);
        fabuqingkuang=findViewById(R.id.fabuqingkuang);
        b0 = findViewById(R.id.upload);
        list.add("数码");
        list.add("医药");
        list.add("手机");
        list.add("百货");
        list.add("食品");
        list.add("女装");
        list.add("电器");
        list.add("洗护");
        list.add("运动");
        list.add("饰品");
        SqlliteHelper helper = new SqlliteHelper(this);
        Cursor cursor = helper.query();
        while (cursor.moveToNext()) {
            username = cursor.getString(cursor.getColumnIndex("name"));
        }
        name1 = findViewById(R.id.namee);
        jieshao = findViewById(R.id.saye);
        price = findViewById(R.id.pricee);
        mySpinner = findViewById(R.id.typee);
        k0 = findViewById(R.id.namet);




        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        //第三步：为适配器设置下拉列表下拉时的菜单样式。
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //第四步：将适配器添加到下拉列表上
        mySpinner.setAdapter(adapter);
        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub
                /* 将所选mySpinner 的值带入myTextView 中*/
//                k0.setText("您选择的是："+ adapter.getItem(arg2));
                /* 将mySpinner 显示*/
                tpye0 = adapter.getItem(arg2);
                if (tpye0.equals("数码")) tpye0 = "1";
                if (tpye0.equals("医药")) tpye0 = "2";
                if (tpye0.equals("手机")) tpye0 = "3";
                if (tpye0.equals("百货")) tpye0 = "4";
                if (tpye0.equals("食品")) tpye0 = "5";
                if (tpye0.equals("女装")) tpye0 = "6";
                if (tpye0.equals("电器")) tpye0 = "8";
                if (tpye0.equals("洗护")) tpye0 = "9";
                if (tpye0.equals("运动")) tpye0 = "10";
                if (tpye0.equals("饰品")) tpye0 = "11";


                arg0.setVisibility(View.VISIBLE);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
//               k0.setText("NONE");
                arg0.setVisibility(View.VISIBLE);
            }
        });
        /*下拉菜单弹出的内容选项触屏事件处理*/
        mySpinner.setOnTouchListener(new Spinner.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                /**
                 *
                 */
                return false;
            }
        });
        /*下拉菜单弹出的内容选项焦点改变事件处理*/
        mySpinner.setOnFocusChangeListener(new Spinner.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewInit();
                t++;
            }
        });
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        try {
            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
                name11 = name1.getText().toString();
                jieshao1 = jieshao.getText().toString();
                price1 = price.getText().toString();
//                Toast.makeText(fabu_product.this, "功能维护中", Toast.LENGTH_SHORT).show();

                Thread thread = new Thread(runnable);
                thread.start();
                try {
                    thread.join();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(new Intent(fabu_product.this, my_product.class));
            }
        });

    }

    Runnable runnable1 = new Runnable() {
        private Connection connection = null;
        @Override
        public void run() {
            userdao dao=new userdao();
            dao.run1();
            try {
            String k="";
                password=dao.test(username,k);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    };
    /*
    初始化控件方法
     */
    public void viewInit() {

        builder = new AlertDialog.Builder(this);//创建对话框
        inflater = getLayoutInflater();
        layout = inflater.inflate(R.layout.content_fabu_product, null);//获取自定义布局
        builder.setView(layout);//设置对话框的布局
        dialog = builder.create();//生成最终的对话框
        dialog.show();//显示对话框


        choosePhotoTV = layout.findViewById(R.id.photo);
        cancelTV = layout.findViewById(R.id.cancel);
        //设置监听
//        takePhotoTV.setOnClickListener(this);
        choosePhotoTV.setOnClickListener(this);
        cancelTV.setOnClickListener(this);
    }

    /**
     * 修改头像按钮执行方法
     *
     * @param view
     */
    public void UpdatePhoto(View view) {
        viewInit();
    }

    private void takePhoto() throws IOException {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        // 获取文件
        File file = createFileIfNeed("UserIcon.png");
        //拍照后原图回存入此路径下
        Uri uri;
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.M) {
            uri = Uri.fromFile(file);
        } else {
            /**
             * 7.0 调用系统相机拍照不再允许使用Uri方式，应该替换为FileProvider
             * 并且这样可以解决MIUI系统上拍照返回size为0的情况
             */
            uri = FileProvider.getUriForFile(this, "com.example.bobo.getphotodemo.fileprovider", file);
        }
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
        startActivityForResult(intent, 1);
    }

    // 在sd卡中创建一保存图片（原图和缩略图共用的）文件夹
    private File createFileIfNeed(String fileName) throws IOException {
        String fileA = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + "/nbinpic";
        File fileJA = new File(fileA);
        if (!fileJA.exists()) {
            fileJA.mkdirs();
        }
        File file = new File(fileA, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    /**
     * 打开相册
     */
    private void choosePhoto() {
        //这是打开系统默认的相册(就是你系统怎么分类,就怎么显示,首先展示分类列表)
        Intent picture = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(picture, 2);
    }

    /**
     * 申请权限回调方法
     *
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == MY_ADD_CASE_CALL_PHONE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                try {
                    takePhoto();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Toast.makeText(this, "拒绝了你的请求", Toast.LENGTH_SHORT).show();
                //"权限拒绝");
                // TODO: 2018/12/4 这里可以给用户一个提示,请求权限被拒绝了
            }
        }
        if (requestCode == MY_ADD_CASE_CALL_PHONE2) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                choosePhoto();
            } else {
                //"权限拒绝");
                // TODO: 2018/12/4 这里可以给用户一个提示,请求权限被拒绝了
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    /**
     * startActivityForResult执行后的回调方法，接收返回的图片
     * @param requestCode
     * @param resultCode
     * @param data
     */
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1 && resultCode != Activity.RESULT_CANCELED) {
//            String state = Environment.getExternalStorageState();
//            if (!state.equals(Environment.MEDIA_MOUNTED)) return;
//            // 把原图显示到界面上
//            Tiny.FileCompressOptions options = new Tiny.FileCompressOptions();
//            Tiny.getInstance().source(readpic()).asFile().withOptions(options).compress(new FileWithBitmapCallback() {
//                @Override
//                public void callback(boolean isSuccess, Bitmap bitmap, String outfile) {
//                    saveImageToServer(bitmap, outfile);//显示图片到imgView上
//                }
//
//
//            });
//        } else if (requestCode == 2 && resultCode == Activity.RESULT_OK
//                && null != data) {
//            try {
//                Uri selectedImage = data.getData();//获取路径
//                Tiny.FileCompressOptions options = new Tiny.FileCompressOptions();
//                Tiny.getInstance().source(selectedImage).asFile().withOptions(options).compress(new FileWithBitmapCallback() {
//                    @Override
//                    public void callback(boolean isSuccess, Bitmap bitmap, String outfile) {
//                        saveImageToServer(bitmap, outfile);
//                    }
//
//
//                });
//            } catch (Exception e) {
//                //"上传失败");
//            }
//        }
//    }

    /**
     * 从保存原图的地址读取图片
     */
    private String readpic() {
        String filePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + "/nbinpic/" + "UserIcon.png";
        return filePath;
    }

    private void saveImageToServer(final Bitmap bitmap, String outfile) {
        File file = new File(outfile);
        // TODO: 2018/12/4  这里就可以将图片文件 file 上传到服务器,上传成功后可以将bitmap设置给你对应的图片展示
        if (t == 1) {
            b1 = bitmap;
            ur1.setImageBitmap(bitmap);
        }
        if (t == 2) {
            b2 = bitmap;
            ur2.setImageBitmap(bitmap);
        }
        if (t == 3) {
            b3 = bitmap;
            ur3.setImageBitmap(bitmap);
        }
        if (t == 4) {
            b4 = bitmap;
            ur4.setImageBitmap(bitmap);
        }


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.photo:
                if (ContextCompat.checkSelfPermission(fabu_product.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                        PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(fabu_product.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                } else {
                    toPicture();
                }


                break;
            case R.id.cancel:
                dialog.dismiss();//关闭对话框
                break;
            default:
                break;
        }
    }

    void cheak0() {
        Toast.makeText(this, "请输入完整", Toast.LENGTH_SHORT).show();
    }




    Runnable runnable = new Runnable() {
        private Connection connection = null;
        MysqlCon con = new MysqlCon();
        userdao dao = new userdao();
        private String result;
        @Override
        public void run() {
            dao.run1();
/*
            try {
                //设置路径
                String path="http://47.106.237.169:8080/trading_platform/login.do";
                //创建URL对象
                URL url=new URL(path);
                //创建一个HttpURLConnection对象
                HttpURLConnection conn=(HttpURLConnection) url.openConnection();
                //设置请求方法
                conn.setRequestMethod("POST");
                //设置请求超时时间
                conn.setReadTimeout(5000);
                conn.setConnectTimeout(5000);

                //Post方式不能设置缓存，需要手动设置
                conn.setUseCaches(false);
                //设置我们的请求数据
                String password=null;
                String data="user_name="+username+"&password="+dao.test(username,password);
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");//使用的是表单请求类型
                conn.setRequestProperty("Content-Length", data.length()+"");
                conn.setDoOutput(true);
                conn.getOutputStream().write(data.getBytes());
//		                    //连接
//		                    conn.connect();
//							//获取一个输出流
//							OutputStream out=conn.getOutputStream();
//							out.write(data.getBytes());
                //获取服务器返回的状态吗
                int code=conn.getResponseCode();
                if(code==200){
                    //获取服务器返回的输入流对象
                    InputStream in= conn.getInputStream();
                    result = StringTools.readStream(in);
                    //更新UI
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            if(result.equals("success"))
                                // TODO Auto-generated method stub
                                Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent();
                            intent.setClassName("com.example.latitudeandlongitude.latitudeandlongitude", "com.example.latitudeandlongitude.latitudeandlongitude.LocationActivity");
                            startActivity(intent);
                        }
                    });
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

*/

            int a = 0;
            try {
                a = dao.finduserStatus(username);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int true0 = 0;
            try {
                if (a == 1) {
                    Random r = new Random(1);

                    int ran1 = r.nextInt(10000);
                    int ran2 = r.nextInt(10000);
                    int ran3 = r.nextInt(10000);
                    String k="";
                    dao.addproduct(name11, jieshao1, price1, tpye0, t, username);
                    if (p == 1) {
                        k=uploadImage(img_src1,name11);


                    }
                    if (p == 2) {



                        k=uploadImage(img_src1,name11);

                       k= uploadImage(img_src2,name11);


                    }
                    if (p == 3) {




                        k=uploadImage(img_src1,name11);


                        k=uploadImage(img_src2,name11);

                        k=uploadImage(img_src3,name11);

                    }

                } else {

                    Toast.makeText(fabu_product.this, "你没有权力发布商品", Toast.LENGTH_SHORT).show();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            startActivity(new Intent(fabu_product.this, my_product.class));

        }

    };

    //跳转相册
    private void toPicture() {
        String[] PERMISSIONS_STORAGE = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };
        int permission = ActivityCompat.checkSelfPermission(fabu_product.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        final int REQUEST_EXTERNAL_STORAGE = 1;
        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    fabu_product.this,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
        Intent intent = new Intent(Intent.ACTION_PICK);  //跳转到 ACTION_IMAGE_CAPTURE
        intent.setType("image/*");
        startActivityForResult(intent, 100);
        L.e("跳转相册成功");
    }

    private File tempFile = null;   //新建一个 File 文件（用于相机拿数据）

    //获取 相机 或者 图库 返回的图片

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //判断返回码不等于0
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap11 = null,bitmap22=null,bitmap33=null;
        if (requestCode != RESULT_CANCELED) {    //RESULT_CANCELED = 0(也可以直接写“if (requestCode != 0 )”)
            //读取返回码
            switch (requestCode) {
                case 100:   //相册返回的数据（相册的返回码）
                    L.e("相册");
                    Uri uri01 = data.getData();

                    if (p == 0)
                        img_src1 = uri01.getPath();//这是本机的图片路径
                    if (p == 1)
                        img_src2 = uri01.getPath();//这是本机的图片路径
                    if (p == 2)
                        img_src1 = uri01.getPath();//这是本机的图片路径
                    ContentResolver cr = this.getContentResolver();
                    try {
                        p++;
                        if (p == 1) {
                            bitmap1 = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri01));
                          bitmap11 = CompressImageUtils.pressScaleCompress(bitmap1);
                            bitmap1= compressImage(bitmap11);
                        }
                        if (p == 2){
                            bitmap2 = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri01));
                            bitmap22 = CompressImageUtils.pressScaleCompress(bitmap2);
                            bitmap2= compressImage(bitmap22);
                        }
                        if (p == 3){
                            bitmap3 = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri01));
                            bitmap33 = CompressImageUtils.pressScaleCompress(bitmap3);
                            bitmap3= compressImage(bitmap33);
                        }


                        if (p == 1)
                            ur1.setImageBitmap(bitmap1);
                        if (p == 2)
                            ur2.setImageBitmap(bitmap2);
                        if (p == 3)
                            ur3.setImageBitmap(bitmap3);

                        String[] proj = {MediaStore.Images.Media.DATA};
                        CursorLoader loader = new CursorLoader(this, uri01, proj, null, null, null);
                        Cursor cursor = loader.loadInBackground();
                        if (cursor != null) {
                            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                            cursor.moveToFirst();
                            if (p == 1)
                                img_src1 = cursor.getString(column_index);//这是本机的图片路径
                            if (p == 2)
                                img_src2 = cursor.getString(column_index);//这是本机的图片路径
                            if (p == 3)
                                img_src1 = cursor.getString(column_index);//这是本机的图片路径


                        }
                        cursor.close();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 101:  //相机返回的数据（相机的返回码）
                    L.e("相机");
                    try {
                        tempFile = new File(Environment.getExternalStorageDirectory(), "fileImg.jpg");  //相机取图片数据文件
                        Uri uri02 = Uri.fromFile(tempFile);   //图片文件
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri02));
                        ur1.setImageBitmap(bitmap);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    public String uploadImage(final String b,String c) {
         final int REQUEST_EXTERNAL_STORAGE = 1;
        String[] PERMISSIONS_STORAGE = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };
        int permission = ActivityCompat.checkSelfPermission(fabu_product.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    fabu_product.this,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }

        final String[] s = {""};
        final userdao dao = new userdao();
        new Thread(new Runnable() {
            @Override
            public void run() {
                    dao.run1();
                String uploadurl = "http://47.106.237.169:8080/trading_platform/image/upload.do";
                try {
                    String[] PERMISSIONS_STORAGE = {
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE
                    };
                    int permission = ActivityCompat.checkSelfPermission(fabu_product.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

                    if (permission != PackageManager.PERMISSION_GRANTED) {
                        // We don't have permission so prompt the user
                        ActivityCompat.requestPermissions(
                                fabu_product.this,
                                PERMISSIONS_STORAGE,
                                REQUEST_EXTERNAL_STORAGE
                        );
                    }
                    File file = new File(b);
                    Log.v("url",uploadurl);
                    Log.v("url",file.getName());
                    Log.v("url",ret1);
              String a= UploadUtil.upload( uploadurl,file, ret1);
                  s[0] = a.substring(a.indexOf("img/")+4,a.indexOf("\"}}"));
                    Log.v("s[0]", s[0]);

                    dao.addimage(name11, s[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
return s[0];
    }

    final static String url="http://47.106.237.169:8080/trading_platform/login.do";

    private void login() {

        final String username = this.username;
        final String password = this.password;


        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){

            Toast.makeText(fabu_product.this, "用户名或者密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        new Thread(){
            @Override
            public void run() {

                HttpUtils httpUtils = new HttpUtils();
                //转换为JSON
                String user = httpUtils.bolwingJson(username, password);



                //String user ="{'username':" + username + ","+"'password':"+password+"}";
                Log.v("user:", user);


                try {
                    final String result = httpUtils.login(url, username,password);
                    Log.v("结果:" , result);

                    //更新UI,在UI线程中
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if("SUCCESS".equals(result)){

                                fabuqingkuang.setText("登录成功");

                            }else{
                                fabuqingkuang.setText("登录失败");
                            }
                        }
                    });
            ret1 = result.substring(result.indexOf("token\":\"")+8,result.indexOf("\"}}"));
                    Log.v("token",ret1);

                } catch (IOException e) {
                    e.printStackTrace();
                }



            }
        }.start();


    }
    /**
     * 裁剪图片
     */
    private static Bitmap compressImage(Bitmap image) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 100;
        while ( baos.toByteArray().length / 1024>100) {	//循环判断如果压缩后图片是否大于100kb,大于继续压缩
            baos.reset();//重置baos即清空baos
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中
            options -= 10;//每次都减少10
        }
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());//把压缩后的数据baos存放到ByteArrayInputStream中


        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);//把ByteArrayInputStream数据生成图片
        return bitmap;
    }



}



