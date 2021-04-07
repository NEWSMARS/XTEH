package com.example.xtes.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UploadUtil {
    private OkHttpClient okHttpClient;
    private UploadUtil(){
        okHttpClient = new OkHttpClient();
    }
    /**
     * 使用静态内部类的方式实现单例模式
     */

    private static class UploadUtilInstance{
        private static final UploadUtil INSTANCE = new UploadUtil();
    }
    public static UploadUtil getInstance(){
        return UploadUtilInstance.INSTANCE;
    }

    /**
     * @param url   服务器地址
     * @param file  所要上传的文件
     * @return      响应结果
     * @throws IOException
     */

    public static String upload(String url, File file, String token) throws IOException {
        OkHttpClient client = new OkHttpClient();
        String k="/upload/img/"+file.getName();
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("picture", k,
                        RequestBody.create(MediaType.parse("multipart/form-data"), file))
                .build();
        Request request = new Request.Builder()
                .header("Authorization", token)
                .url("http://47.106.237.169:8080/trading_platform/image/upload.do")
                .post(requestBody)
                .build();


        Response response = client.newCall(request).execute();

        String result = response.body().string();
Log.v("result",result);
       return result;
    }
}

